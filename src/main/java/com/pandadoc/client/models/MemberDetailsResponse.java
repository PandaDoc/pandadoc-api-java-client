/*
 * PandaDoc Public API
 * PandaDoc Public API documentation
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.pandadoc.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MemberDetailsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MemberDetailsResponse {
  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_MEMBERSHIP_ID = "membership_id";
  @SerializedName(SERIALIZED_NAME_MEMBERSHIP_ID)
  private String membershipId;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "is_active";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_WORKSPACE = "workspace";
  @SerializedName(SERIALIZED_NAME_WORKSPACE)
  private String workspace;

  public static final String SERIALIZED_NAME_WORKSPACE_NAME = "workspace_name";
  @SerializedName(SERIALIZED_NAME_WORKSPACE_NAME)
  private String workspaceName;

  public static final String SERIALIZED_NAME_EMAILS_VERIFIED = "emails_verified";
  @SerializedName(SERIALIZED_NAME_EMAILS_VERIFIED)
  private Boolean emailsVerified;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public static final String SERIALIZED_NAME_USER_LICENSE = "user_license";
  @SerializedName(SERIALIZED_NAME_USER_LICENSE)
  private String userLicense;

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private String dateCreated;

  public static final String SERIALIZED_NAME_DATE_MODIFIED = "date_modified";
  @SerializedName(SERIALIZED_NAME_DATE_MODIFIED)
  private String dateModified;

  public MemberDetailsResponse() { 
  }

  public MemberDetailsResponse userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * A unique identifier of the user in the organization.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ajnN7eGutJZsRKjQrNuPkh", value = "A unique identifier of the user in the organization.")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public MemberDetailsResponse membershipId(String membershipId) {
    
    this.membershipId = membershipId;
    return this;
  }

   /**
   * A unique identifier of the user in the workspace.
   * @return membershipId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "radQBiBkU7MBk59NSgaGf5", value = "A unique identifier of the user in the workspace.")

  public String getMembershipId() {
    return membershipId;
  }


  public void setMembershipId(String membershipId) {
    this.membershipId = membershipId;
  }


  public MemberDetailsResponse email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * A user&#39;s email address.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "josh@example.com", value = "A user's email address.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public MemberDetailsResponse firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * A user&#39;s first name.
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Josh", value = "A user's first name.")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public MemberDetailsResponse lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * A user&#39;s last name.
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Ron", value = "A user's last name.")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public MemberDetailsResponse isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * A boolean value that identifies if a member is active in the workspace.
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "A boolean value that identifies if a member is active in the workspace.")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public MemberDetailsResponse workspace(String workspace) {
    
    this.workspace = workspace;
    return this;
  }

   /**
   * A name of the user&#39;s current active workspace.
   * @return workspace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xc4mBZ7dKErXQtJwwD6Ghg", value = "A name of the user's current active workspace.")

  public String getWorkspace() {
    return workspace;
  }


  public void setWorkspace(String workspace) {
    this.workspace = workspace;
  }


  public MemberDetailsResponse workspaceName(String workspaceName) {
    
    this.workspaceName = workspaceName;
    return this;
  }

   /**
   * A unique identifier of the user&#39;s current active workspace.
   * @return workspaceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PandaDoc", value = "A unique identifier of the user's current active workspace.")

  public String getWorkspaceName() {
    return workspaceName;
  }


  public void setWorkspaceName(String workspaceName) {
    this.workspaceName = workspaceName;
  }


  public MemberDetailsResponse emailsVerified(Boolean emailsVerified) {
    
    this.emailsVerified = emailsVerified;
    return this;
  }

   /**
   * A boolean value that identifies if the email is verified.
   * @return emailsVerified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "A boolean value that identifies if the email is verified.")

  public Boolean getEmailsVerified() {
    return emailsVerified;
  }


  public void setEmailsVerified(Boolean emailsVerified) {
    this.emailsVerified = emailsVerified;
  }


  public MemberDetailsResponse role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * A member&#39;s role in the workspace.
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Admin", value = "A member's role in the workspace.")

  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }


  public MemberDetailsResponse userLicense(String userLicense) {
    
    this.userLicense = userLicense;
    return this;
  }

   /**
   * A user license in the organization.
   * @return userLicense
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Full", value = "A user license in the organization.")

  public String getUserLicense() {
    return userLicense;
  }


  public void setUserLicense(String userLicense) {
    this.userLicense = userLicense;
  }


  public MemberDetailsResponse dateCreated(String dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * A date when a member was added to the workspace.
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-11-17T08:42:34.237567Z", value = "A date when a member was added to the workspace.")

  public String getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
  }


  public MemberDetailsResponse dateModified(String dateModified) {
    
    this.dateModified = dateModified;
    return this;
  }

   /**
   * Last modified date of a member.
   * @return dateModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-11-30T10:30:35.071428Z", value = "Last modified date of a member.")

  public String getDateModified() {
    return dateModified;
  }


  public void setDateModified(String dateModified) {
    this.dateModified = dateModified;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberDetailsResponse memberDetailsResponse = (MemberDetailsResponse) o;
    return Objects.equals(this.userId, memberDetailsResponse.userId) &&
        Objects.equals(this.membershipId, memberDetailsResponse.membershipId) &&
        Objects.equals(this.email, memberDetailsResponse.email) &&
        Objects.equals(this.firstName, memberDetailsResponse.firstName) &&
        Objects.equals(this.lastName, memberDetailsResponse.lastName) &&
        Objects.equals(this.isActive, memberDetailsResponse.isActive) &&
        Objects.equals(this.workspace, memberDetailsResponse.workspace) &&
        Objects.equals(this.workspaceName, memberDetailsResponse.workspaceName) &&
        Objects.equals(this.emailsVerified, memberDetailsResponse.emailsVerified) &&
        Objects.equals(this.role, memberDetailsResponse.role) &&
        Objects.equals(this.userLicense, memberDetailsResponse.userLicense) &&
        Objects.equals(this.dateCreated, memberDetailsResponse.dateCreated) &&
        Objects.equals(this.dateModified, memberDetailsResponse.dateModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, membershipId, email, firstName, lastName, isActive, workspace, workspaceName, emailsVerified, role, userLicense, dateCreated, dateModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberDetailsResponse {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    membershipId: ").append(toIndentedString(membershipId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    workspaceName: ").append(toIndentedString(workspaceName)).append("\n");
    sb.append("    emailsVerified: ").append(toIndentedString(emailsVerified)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    userLicense: ").append(toIndentedString(userLicense)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

