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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.BanUsersInChannelsWithCustomChannelTypeDataBannedListInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * BanUsersInChannelsWithCustomChannelTypeData
 */
@JsonPropertyOrder({
  BanUsersInChannelsWithCustomChannelTypeData.JSON_PROPERTY_BANNED_LIST,
  BanUsersInChannelsWithCustomChannelTypeData.JSON_PROPERTY_ON_DEMAND_UPSERT
})
@JsonTypeName("banUsersInChannelsWithCustomChannelTypeData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T16:21:40.271053+01:00[Europe/London]")
public class BanUsersInChannelsWithCustomChannelTypeData {
  public static final String JSON_PROPERTY_BANNED_LIST = "banned_list";
  private List<BanUsersInChannelsWithCustomChannelTypeDataBannedListInner> bannedList = new ArrayList<>();

  public static final String JSON_PROPERTY_ON_DEMAND_UPSERT = "on_demand_upsert";
  private Boolean onDemandUpsert;

  public BanUsersInChannelsWithCustomChannelTypeData() { 
  }

  public BanUsersInChannelsWithCustomChannelTypeData bannedList(List<BanUsersInChannelsWithCustomChannelTypeDataBannedListInner> bannedList) {
    this.bannedList = bannedList;
    return this;
  }

  public BanUsersInChannelsWithCustomChannelTypeData addBannedListItem(BanUsersInChannelsWithCustomChannelTypeDataBannedListInner bannedListItem) {
    this.bannedList.add(bannedListItem);
    return this;
  }

   /**
   * Get bannedList
   * @return bannedList
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BANNED_LIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<BanUsersInChannelsWithCustomChannelTypeDataBannedListInner> getBannedList() {
    return bannedList;
  }


  @JsonProperty(JSON_PROPERTY_BANNED_LIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBannedList(List<BanUsersInChannelsWithCustomChannelTypeDataBannedListInner> bannedList) {
    this.bannedList = bannedList;
  }


  public BanUsersInChannelsWithCustomChannelTypeData onDemandUpsert(Boolean onDemandUpsert) {
    this.onDemandUpsert = onDemandUpsert;
    return this;
  }

   /**
   * Get onDemandUpsert
   * @return onDemandUpsert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ON_DEMAND_UPSERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOnDemandUpsert() {
    return onDemandUpsert;
  }


  @JsonProperty(JSON_PROPERTY_ON_DEMAND_UPSERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOnDemandUpsert(Boolean onDemandUpsert) {
    this.onDemandUpsert = onDemandUpsert;
  }


  /**
   * Return true if this banUsersInChannelsWithCustomChannelTypeData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BanUsersInChannelsWithCustomChannelTypeData banUsersInChannelsWithCustomChannelTypeData = (BanUsersInChannelsWithCustomChannelTypeData) o;
    return Objects.equals(this.bannedList, banUsersInChannelsWithCustomChannelTypeData.bannedList) &&
        Objects.equals(this.onDemandUpsert, banUsersInChannelsWithCustomChannelTypeData.onDemandUpsert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bannedList, onDemandUpsert);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BanUsersInChannelsWithCustomChannelTypeData {\n");
    sb.append("    bannedList: ").append(toIndentedString(bannedList)).append("\n");
    sb.append("    onDemandUpsert: ").append(toIndentedString(onDemandUpsert)).append("\n");
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
