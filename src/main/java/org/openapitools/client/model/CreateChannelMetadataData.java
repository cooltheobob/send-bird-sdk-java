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
 * CreateChannelMetadataData
 */
@JsonPropertyOrder({
  CreateChannelMetadataData.JSON_PROPERTY_CHANNEL_TYPE,
  CreateChannelMetadataData.JSON_PROPERTY_CHANNEL_URL,
  CreateChannelMetadataData.JSON_PROPERTY_METADATA,
  CreateChannelMetadataData.JSON_PROPERTY_INCLUDE_TS
})
@JsonTypeName("createChannelMetadataData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T16:21:40.271053+01:00[Europe/London]")
public class CreateChannelMetadataData {
  public static final String JSON_PROPERTY_CHANNEL_TYPE = "channel_type";
  private String channelType;

  public static final String JSON_PROPERTY_CHANNEL_URL = "channel_url";
  private String channelUrl;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Object metadata;

  public static final String JSON_PROPERTY_INCLUDE_TS = "include_ts";
  private Boolean includeTs;

  public CreateChannelMetadataData() { 
  }

  public CreateChannelMetadataData channelType(String channelType) {
    this.channelType = channelType;
    return this;
  }

   /**
   * Specifies the type of the channel. Either open_channels or group_channels.
   * @return channelType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the type of the channel. Either open_channels or group_channels.")
  @JsonProperty(JSON_PROPERTY_CHANNEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getChannelType() {
    return channelType;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChannelType(String channelType) {
    this.channelType = channelType;
  }


  public CreateChannelMetadataData channelUrl(String channelUrl) {
    this.channelUrl = channelUrl;
    return this;
  }

   /**
   * Specifies the URL of the channel to store the metadata in.
   * @return channelUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the URL of the channel to store the metadata in.")
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


  public CreateChannelMetadataData metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Specifies a &#x60;JSON&#x60; object that stores key-value items. The key must not have a comma (,) and its length is limited to 128 characters. The value must be a string and its length is limited to 190 characters. This property can have up to 5 items.
   * @return metadata
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies a `JSON` object that stores key-value items. The key must not have a comma (,) and its length is limited to 128 characters. The value must be a string and its length is limited to 190 characters. This property can have up to 5 items.")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public CreateChannelMetadataData includeTs(Boolean includeTs) {
    this.includeTs = includeTs;
    return this;
  }

   /**
   * Determines whether to include the timestamp of when a metadata has been created in the response. (Default: false)
   * @return includeTs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether to include the timestamp of when a metadata has been created in the response. (Default: false)")
  @JsonProperty(JSON_PROPERTY_INCLUDE_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeTs() {
    return includeTs;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludeTs(Boolean includeTs) {
    this.includeTs = includeTs;
  }


  /**
   * Return true if this createChannelMetadataData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChannelMetadataData createChannelMetadataData = (CreateChannelMetadataData) o;
    return Objects.equals(this.channelType, createChannelMetadataData.channelType) &&
        Objects.equals(this.channelUrl, createChannelMetadataData.channelUrl) &&
        Objects.equals(this.metadata, createChannelMetadataData.metadata) &&
        Objects.equals(this.includeTs, createChannelMetadataData.includeTs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelType, channelUrl, metadata, includeTs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChannelMetadataData {\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
    sb.append("    channelUrl: ").append(toIndentedString(channelUrl)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    includeTs: ").append(toIndentedString(includeTs)).append("\n");
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
