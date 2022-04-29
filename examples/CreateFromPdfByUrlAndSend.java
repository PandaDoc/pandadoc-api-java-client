package com.pandadoc.client;

import com.pandadoc.client.ApiClient;
import com.pandadoc.client.ApiException;
import com.pandadoc.client.Configuration;
import com.pandadoc.client.api.DocumentsApi;
import com.pandadoc.client.auth.ApiKeyAuth;
import com.pandadoc.client.models.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class CreateFromPdfByUrlAndSend {

    private static final String API_KEY = "YOUR_API_KEY";
    private static final String DOCUMENT_PDF_URL = "https://cdn2.hubspot.net/hubfs/2127247/public-templates/SamplePandaDocPdf_FieldTags.pdf";
    private static final String BASE_PATH = "https://api.pandadoc.com";
    private static final String EDITOR_VERSION = "ev2";
    private static final String TOKEN_PREFIX = "API-Key";
    private static final int MAX_CHECK_RETRIES = 5;

    public static DocumentCreateResponse createDocumentFromPdf(DocumentsApi apiInstance) throws ApiException {
        DocumentCreateRequestRecipients firstRecipient = new DocumentCreateRequestRecipients()
                .email("josh@example.com")
                .firstName("Josh")
                .lastName("Ron")
                .role("user")
                .signingOrder(1);

        DocumentCreateRequestRecipients secondRecipient = new DocumentCreateRequestRecipients()
                .email("john@example.com")
                .firstName("John")
                .lastName("Doe")
                .signingOrder(2);

        List<DocumentCreateRequestRecipients> recipients = Arrays.asList(firstRecipient, secondRecipient);

        Map<String, Map<String, Object> > fields = Map.of(
                "name", Map.of("value", "John", "role", "user"),
                "like", Map.of("value", true)
        );

        Map<String, String> metadata = new HashMap<>();
        metadata.put("salesforce.opportunity_id", "123456");
        metadata.put("my_favorite_pet", "Panda");

        DocumentCreateRequest documentCreateRequest = new DocumentCreateRequest()
                .name("Sample Document from PDF with Field Tags")
                .url(DOCUMENT_PDF_URL)
                .tags(Arrays.asList("tag_1", "tag_2"))
                .recipients(recipients)
                .fields(fields)
                .metadata(metadata)
                .parseFormFields(false);

        return apiInstance.createDocument(documentCreateRequest, EDITOR_VERSION);
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
            DocumentCreateResponse document = createDocumentFromPdf(apiInstance);
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
