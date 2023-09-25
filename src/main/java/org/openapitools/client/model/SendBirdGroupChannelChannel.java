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

import com.fasterxml.jackson.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import org.sendbird.client.JSON;


/**
 * SendBirdGroupChannelChannel
 */
@JsonPropertyOrder({
  SendBirdGroupChannelChannel.JSON_PROPERTY_CHANNEL_URL,
  SendBirdGroupChannelChannel.JSON_PROPERTY_NAME,
  SendBirdGroupChannelChannel.JSON_PROPERTY_COVER_URL,
  SendBirdGroupChannelChannel.JSON_PROPERTY_DATA,
  SendBirdGroupChannelChannel.JSON_PROPERTY_CREATED_AT,
  SendBirdGroupChannelChannel.JSON_PROPERTY_CUSTOM_TYPE,
  SendBirdGroupChannelChannel.JSON_PROPERTY_MAX_LENGTH_MESSAGE,
  SendBirdGroupChannelChannel.JSON_PROPERTY_MEMBER_COUNT
})
@JsonTypeName("SendBird_GroupChannel_channel")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T16:21:40.271053+01:00[Europe/London]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SendBirdGroupChannelChannel {
  public static final String JSON_PROPERTY_CHANNEL_URL = "channel_url";
  private String channelUrl;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_COVER_URL = "cover_url";
  private String coverUrl;

  public static final String JSON_PROPERTY_DATA = "data";
  private String data;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private BigDecimal createdAt;

  public static final String JSON_PROPERTY_CUSTOM_TYPE = "custom_type";
  private String customType;

  public static final String JSON_PROPERTY_MAX_LENGTH_MESSAGE = "max_length_message";
  private BigDecimal maxLengthMessage;

  public static final String JSON_PROPERTY_MEMBER_COUNT = "member_count";
  private BigDecimal memberCount;

  public SendBirdGroupChannelChannel() { 
  }

  public SendBirdGroupChannelChannel channelUrl(String channelUrl) {
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


  public SendBirdGroupChannelChannel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public SendBirdGroupChannelChannel coverUrl(String coverUrl) {
    this.coverUrl = coverUrl;
    return this;
  }

   /**
   * Get coverUrl
   * @return coverUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COVER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCoverUrl() {
    return coverUrl;
  }


  @JsonProperty(JSON_PROPERTY_COVER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCoverUrl(String coverUrl) {
    this.coverUrl = coverUrl;
  }


  public SendBirdGroupChannelChannel data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(String data) {
    this.data = data;
  }


  public SendBirdGroupChannelChannel createdAt(BigDecimal createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(BigDecimal createdAt) {
    this.createdAt = createdAt;
  }


  public SendBirdGroupChannelChannel customType(String customType) {
    this.customType = customType;
    return this;
  }

   /**
   * Get customType
   * @return customType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUSTOM_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomType() {
    return customType;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomType(String customType) {
    this.customType = customType;
  }


  public SendBirdGroupChannelChannel maxLengthMessage(BigDecimal maxLengthMessage) {
    this.maxLengthMessage = maxLengthMessage;
    return this;
  }

   /**
   * Get maxLengthMessage
   * @return maxLengthMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAX_LENGTH_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMaxLengthMessage() {
    return maxLengthMessage;
  }


  @JsonProperty(JSON_PROPERTY_MAX_LENGTH_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxLengthMessage(BigDecimal maxLengthMessage) {
    this.maxLengthMessage = maxLengthMessage;
  }


  public SendBirdGroupChannelChannel memberCount(BigDecimal memberCount) {
    this.memberCount = memberCount;
    return this;
  }

   /**
   * Get memberCount
   * @return memberCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEMBER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMemberCount() {
    return memberCount;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemberCount(BigDecimal memberCount) {
    this.memberCount = memberCount;
  }


  /**
   * Return true if this SendBird_GroupChannel_channel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendBirdGroupChannelChannel sendBirdGroupChannelChannel = (SendBirdGroupChannelChannel) o;
    return Objects.equals(this.channelUrl, sendBirdGroupChannelChannel.channelUrl) &&
        Objects.equals(this.name, sendBirdGroupChannelChannel.name) &&
        Objects.equals(this.coverUrl, sendBirdGroupChannelChannel.coverUrl) &&
        Objects.equals(this.data, sendBirdGroupChannelChannel.data) &&
        Objects.equals(this.createdAt, sendBirdGroupChannelChannel.createdAt) &&
        Objects.equals(this.customType, sendBirdGroupChannelChannel.customType) &&
        Objects.equals(this.maxLengthMessage, sendBirdGroupChannelChannel.maxLengthMessage) &&
        Objects.equals(this.memberCount, sendBirdGroupChannelChannel.memberCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelUrl, name, coverUrl, data, createdAt, customType, maxLengthMessage, memberCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendBirdGroupChannelChannel {\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    coverUrl: ").append(toIndentedString(coverUrl)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    customType: ").append(toIndentedString(customType)).append("\n");
    sb.append("    maxLengthMessage: ").append(toIndentedString(maxLengthMessage)).append("\n");
    sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
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

