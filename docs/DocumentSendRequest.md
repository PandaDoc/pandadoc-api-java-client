

# DocumentSendRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **String** | A message that will be sent by email with a link to a document to sign. |  [optional]
**subject** | **String** | Value that will be used as the email subject. |  [optional]
**silent** | **Boolean** | Disables sent, viewed, comment, and completed email notifications for document recipients and the document sender. By default, notifications emails are sent for specific actions. If set as true, it won&#39;t affect the \&quot;Approve document\&quot; email notification sent to the Approver. |  [optional]
**sender** | **Map&lt;String, String&gt;** | You can set a sender of a document as an &#x60;email&#x60; or &#x60;membership_id&#x60; |  [optional]



