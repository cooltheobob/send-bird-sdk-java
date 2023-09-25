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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * GcJoinChannelData
 */
@JsonPropertyOrder({
  GcJoinChannelData.JSON_PROPERTY_CHANNEL_URL,
  GcJoinChannelData.JSON_PROPERTY_USER_ID,
  GcJoinChannelData.JSON_PROPERTY_ACCESS_CODE
})
@JsonTypeName("gcJoinChannelData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T16:21:40.271053+01:00[Europe/London]")
public class GcJoinChannelData {
  public static final String JSON_PROPERTY_CHANNEL_URL = "channel_url";
  private String channelUrl;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private String userId;

  public static final String JSON_PROPERTY_ACCESS_CODE = "access_code";
  private String accessCode;

  public GcJoinChannelData() { 
  }

  public GcJoinChannelData channelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Specifies the URL of the channel to join.
   * @return channelUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the channel to join.")
  @JsonProperty(JSON_PROPERTY_CHANNEL_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getChannelUrl() {
    return channelUrl;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChannelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
  }


  public GcJoinChannelData userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Specifies the unique ID of the user to join the public group channel.
   * @return userId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the unique ID of the user to join the public group channel.")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserId(String userId) {
    this.userId = userId;
  }


  public GcJoinChannelData accessCode(String accessCode) {
    this.accessCode = accessCode;
    return this;
  }

   /**
   * This property should be specified if the public group channel to join requires an access code to users, which means that the is_access_code_required property of the channel resource is true.
   * @return accessCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "This property should be specified if the public group channel to join requires an access code to users, which means that the is_access_code_required property of the channel resource is true.")
  @JsonProperty(JSON_PROPERTY_ACCESS_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccessCode() {
    return accessCode;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccessCode(String accessCode) {
    this.accessCode = accessCode;
  }


  /**
   * Return true if this gcJoinChannelData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcJoinChannelData gcJoinChannelData = (GcJoinChannelData) o;
    return Objects.equals(this.channelUrl, gcJoinChannelData.channelUrl) &&
        Objects.equals(this.userId, gcJoinChannelData.userId) &&
        Objects.equals(this.accessCode, gcJoinChannelData.accessCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelUrl, userId, accessCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcJoinChannelData {\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
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
