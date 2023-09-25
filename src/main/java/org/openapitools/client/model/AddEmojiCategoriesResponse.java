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
import org.openapitools.client.model.AddEmojiCategoriesResponseEmojiCategoriesInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * AddEmojiCategoriesResponse
 */
@JsonPropertyOrder({
  AddEmojiCategoriesResponse.JSON_PROPERTY_EMOJI_CATEGORIES
})
@JsonTypeName("addEmojiCategoriesResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T16:21:40.271053+01:00[Europe/London]")
public class AddEmojiCategoriesResponse {
  public static final String JSON_PROPERTY_EMOJI_CATEGORIES = "emoji_categories";
  private List<AddEmojiCategoriesResponseEmojiCategoriesInner> emojiCategories = null;

  public AddEmojiCategoriesResponse() { 
  }

  public AddEmojiCategoriesResponse emojiCategories(List<AddEmojiCategoriesResponseEmojiCategoriesInner> emojiCategories) {
    this.emojiCategories = emojiCategories;
    return this;
  }

  public AddEmojiCategoriesResponse addEmojiCategoriesItem(AddEmojiCategoriesResponseEmojiCategoriesInner emojiCategoriesItem) {
    if (this.emojiCategories == null) {
      this.emojiCategories = new ArrayList<>();
    }
    this.emojiCategories.add(emojiCategoriesItem);
    return this;
  }

   /**
   * Get emojiCategories
   * @return emojiCategories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EMOJI_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AddEmojiCategoriesResponseEmojiCategoriesInner> getEmojiCategories() {
    return emojiCategories;
  }


  @JsonProperty(JSON_PROPERTY_EMOJI_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmojiCategories(List<AddEmojiCategoriesResponseEmojiCategoriesInner> emojiCategories) {
    this.emojiCategories = emojiCategories;
  }


  /**
   * Return true if this addEmojiCategoriesResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddEmojiCategoriesResponse addEmojiCategoriesResponse = (AddEmojiCategoriesResponse) o;
    return Objects.equals(this.emojiCategories, addEmojiCategoriesResponse.emojiCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emojiCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddEmojiCategoriesResponse {\n");
    sb.append("    emojiCategories: ").append(toIndentedString(emojiCategories)).append("\n");
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

