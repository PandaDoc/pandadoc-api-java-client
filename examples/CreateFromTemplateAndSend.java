package com.pandadoc.client;

import com.pandadoc.client.api.DocumentsApi;
import com.pandadoc.client.auth.ApiKeyAuth;
import com.pandadoc.client.models.*;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class CreateFromTemplateAndSend {

    private static final String API_KEY = "YOUR_API_KEY";
    private static final String TEMPLATE_UUID = "YOUR_TEMPLATE_UUID";
    private static final String CONTENT_LIBRARY_ITEM = "YOUR_CONTENT_LIBRARY_ITEM";
    private static final String DOCUMENT_IMAGE_URL = "https://s3.amazonaws.com/pd-static-content/public-docs/pandadoc-panda-bear.png";
    private static final String TOKEN_PREFIX = "API-Key";
    private static final String EDITOR_VERSION = "ev2";
    private static final String BASE_PATH = "https://api.pandadoc.com";
    private static final int MAX_CHECK_RETRIES = 5;

    public static DocumentCreateResponse createDocumentFromTemplate(DocumentsApi apiInstance) throws ApiException {
        DocumentCreateRequestRecipients recipient = new DocumentCreateRequestRecipients()
                .email("josh@example.com")
                .firstName("Josh")
                .lastName("Ron")
                .role("user")
                .signingOrder(1);

        List<DocumentCreateRequestRecipients> recipients = Collections.singletonList(recipient);

        PricingTableRequestOptionsDiscount discount = new PricingTableRequestOptionsDiscount()
                .type(PricingTableRequestOptionsDiscount.TypeEnum.ABSOLUTE)
                .name("Global discount")
                .value(new BigDecimal("2.26"));

        PricingTableRequestOptionsTaxFirst taxFirst = new PricingTableRequestOptionsTaxFirst()
                .type(PricingTableRequestOptionsTaxFirst.TypeEnum.PERCENT)
                .name("tax first")
                .value(new BigDecimal("2.26"));

        PricingTableRequestOptionsTaxSecond taxSecond = new PricingTableRequestOptionsTaxSecond()
                .type(PricingTableRequestOptionsTaxSecond.TypeEnum.PERCENT)
                .name("tax second")
                .value(new BigDecimal("2.26"));

        PricingTableRequestRowOptions sectionOption = new PricingTableRequestRowOptions()
                .qtyEditable(true)
                .optionalSelected(true)
                .optional(true);

        PricingTableRequestRowDataDiscount tableDataDiscount = new PricingTableRequestRowDataDiscount()
                .value(new BigDecimal("7.5"))
                .type("percent");

        PricingTableRequestRowData pricingTableData = new PricingTableRequestRowData()
                .name("Toy Panda")
                .description("Fluffy!")
                .price(new BigDecimal("10.0"))
                .cost(new BigDecimal("8.5"))
                .qty(3)
                .sku("toy_panda")
                .discount(tableDataDiscount);

        PricingTableRequestRows pricingTableRow = new PricingTableRequestRows()
                .options(sectionOption)
                .data(pricingTableData);
        List<PricingTableRequestRows> pricingTableRows = Collections.singletonList(pricingTableRow);

        PricingTableRequestSections pricingTableSection = new PricingTableRequestSections()
                .title("Sample Section")
                ._default(true)
                .multichoiceEnabled(false)
                .rows(pricingTableRows);
        List<PricingTableRequestSections> pricingTableSections = Collections.singletonList(pricingTableSection);

        PricingTableRequestOptions pricingTableOptions = new PricingTableRequestOptions()
                .currency("USD")
                .discount(discount)
                .taxFirst(taxFirst)
                .taxSecond(taxSecond);

        PricingTableRequest pricingTable = new PricingTableRequest()
                .name("Pricing Table 1")
                .options(pricingTableOptions)
                .sections(pricingTableSections);
        List<PricingTableRequest> pricingTables = Collections.singletonList(pricingTable);

        DocumentCreateByTemplateRequestTokens documentToken = new DocumentCreateByTemplateRequestTokens()
                .name("Favorite.Pet")
                .value("Panda");
        List<DocumentCreateByTemplateRequestTokens> documentTokens = Collections.singletonList(documentToken);

        DocumentCreateRequestImages documentImage = new DocumentCreateRequestImages()
                .urls(Collections.singletonList(DOCUMENT_IMAGE_URL))
                .name("Image 1");
        List<DocumentCreateRequestImages> documentImages = Collections.singletonList(documentImage);

        DocumentCreateRequestContentLibraryItems contentLibraryItem = new DocumentCreateRequestContentLibraryItems()
                .id(CONTENT_LIBRARY_ITEM);
        List<DocumentCreateRequestContentLibraryItems> contentLibraryItems = Collections.singletonList(contentLibraryItem);

        DocumentCreateRequestContentPlaceholders documentPlaceholder = new DocumentCreateRequestContentPlaceholders()
                .blockId("Content Placeholder 1")
                .contentLibraryItems(contentLibraryItems);
        List<DocumentCreateRequestContentPlaceholders> documentPlaceholders = Collections.singletonList(documentPlaceholder);

        DocumentCreateRequest documentRequest = new DocumentCreateRequest()
                .name("Sample Document from PDF with Field Tags")
                .templateUuid(TEMPLATE_UUID)
                .recipients(recipients)
                .tokens(documentTokens)
                .tags(Arrays.asList("created_via_api", "test_document"))
                .images(documentImages)
                .pricingTables(pricingTables)
                .contentPlaceholders(documentPlaceholders);

        return apiInstance.createDocument(documentRequest, EDITOR_VERSION);
    }

    public static void ensureDocumentCreated(DocumentsApi apiInstance, DocumentCreateResponse document) {
        // Document creation is non-blocking (asynchronous) operation.
        //
        // With a successful request, you receive a response with the created
        // document's ID and status document.uploaded.
        // After processing completes on our servers, usually a few seconds,
        // the document moves to the document.draft status.
        // Please wait for the webhook call or check this document's
        // status before proceeding.
        //
        // The change of status from document.uploaded to another status signifies
        // the document is ready for further processing.
        // Attempting to use a newly created document before PandaDoc servers
        // process it will result in a '404 document not found' response.


        int currentRetries = 0;

        while (currentRetries < MAX_CHECK_RETRIES) {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
                throw new RuntimeException("Error during ensureDocumentCreated");
            }

            currentRetries++;
            DocumentStatusResponse docStatusResponse = apiInstance.statusDocument(document.getId());
            String documentStatus = docStatusResponse.getStatus();

            if ("document.draft".equals(documentStatus)) {
                return;
            }
        }
        throw new RuntimeException("Document was not sent");
    }

    public static void sendDocument (DocumentsApi apiInstance, DocumentCreateResponse document) throws ApiException {
        DocumentSendRequest sendRequest = new DocumentSendRequest()
                .silent(true)
                .subject("This doc was send via java SDK");
        apiInstance.sendDocument(document.getId(), sendRequest);
    }

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath(BASE_PATH);

        ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
        apiKey.setApiKey(API_KEY);
        apiKey.setApiKeyPrefix(TOKEN_PREFIX);

        DocumentsApi apiInstance = new DocumentsApi(defaultClient);
        try {
            DocumentCreateResponse document = createDocumentFromTemplate(apiInstance);
            System.out.println("Document was successfully uploaded: \n" + document);
            ensureDocumentCreated(apiInstance, document);
            sendDocument(apiInstance, document);
            System.out.println("Document was successfully created and sent to the recipients!");
        } catch (ApiException e) {
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
