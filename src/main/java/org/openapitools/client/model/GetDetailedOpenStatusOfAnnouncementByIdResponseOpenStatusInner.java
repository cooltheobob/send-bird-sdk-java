/*
 * Sendbird Platform SDK
 * Sendbird Platform API Javascript SDK  https://sendbird.com/docs/chat/v3/platform-api/getting-started/prepare-to-use-api
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner
 */
@JsonPropertyOrder({
  GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner.JSON_PROPERTY_USER_ID,
  GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner.JSON_PROPERTY_CHANNEL_URL,
  GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner.JSON_PROPERTY_HAS_OPENED,
  GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner.JSON_PROPERTY_SENT_AT,
  GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner.JSON_PROPERTY_OPEN_AT
})
@JsonTypeName("getDetailedOpenStatusOfAnnouncementByIdResponse_open_status_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T16:21:40.271053+01:00[Europe/London]")
public class GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner {
  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private String userId;

  public static final String JSON_PROPERTY_CHANNEL_URL = "channel_url";
  private String channelUrl;

  public static final String JSON_PROPERTY_HAS_OPENED = "has_opened";
  private Boolean hasOpened;

  public static final String JSON_PROPERTY_SENT_AT = "sent_at";
  private BigDecimal sentAt;

  public static final String JSON_PROPERTY_OPEN_AT = "open_at";
  private BigDecimal openAt;

  public GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner() { 
  }

  public GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(String userId) {
    this.userId = userId;
  }


  public GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner channelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Get channelUrl
   * @return channelUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHANNEL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChannelUrl() {
    return channelUrl;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
  }


  public GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner hasOpened(Boolean hasOpened) {
    this.hasOpened = hasOpened;
    return this;
  }

   /**
   * Get hasOpened
   * @return hasOpened
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HAS_OPENED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasOpened() {
    return hasOpened;
  }


  @JsonProperty(JSON_PROPERTY_HAS_OPENED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasOpened(Boolean hasOpened) {
    this.hasOpened = hasOpened;
  }


  public GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner sentAt(BigDecimal sentAt) {
    this.sentAt = sentAt;
    return this;
  }

   /**
   * Get sentAt
   * @return sentAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SENT_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSentAt() {
    return sentAt;
  }


  @JsonProperty(JSON_PROPERTY_SENT_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSentAt(BigDecimal sentAt) {
    this.sentAt = sentAt;
  }


  public GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner openAt(BigDecimal openAt) {
    this.openAt = openAt;
    return this;
  }

   /**
   * Get openAt
   * @return openAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPEN_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getOpenAt() {
    return openAt;
  }


  @JsonProperty(JSON_PROPERTY_OPEN_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpenAt(BigDecimal openAt) {
    this.openAt = openAt;
  }


  /**
   * Return true if this getDetailedOpenStatusOfAnnouncementByIdResponse_open_status_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner getDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner = (GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner) o;
    return Objects.equals(this.userId, getDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner.userId) &&
        Objects.equals(this.channelUrl, getDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner.channelUrl) &&
        Objects.equals(this.hasOpened, getDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner.hasOpened) &&
        Objects.equals(this.sentAt, getDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner.sentAt) &&
        Objects.equals(this.openAt, getDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner.openAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, channelUrl, hasOpened, sentAt, openAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDetailedOpenStatusOfAnnouncementByIdResponseOpenStatusInner {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    hasOpened: ").append(toIndentedString(hasOpened)).append("\n");
    sb.append("    sentAt: ").append(toIndentedString(sentAt)).append("\n");
    sb.append("    openAt: ").append(toIndentedString(openAt)).append("\n");
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
