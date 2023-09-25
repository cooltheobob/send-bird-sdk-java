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
import org.openapitools.client.model.AddApnsPushConfigurationResponsePushConfigurationsInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * AddApnsPushConfigurationResponse
 */
@JsonPropertyOrder({
  AddApnsPushConfigurationResponse.JSON_PROPERTY_PUSH_CONFIGURATIONS
})
@JsonTypeName("addApnsPushConfigurationResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T16:21:40.271053+01:00[Europe/London]")
public class AddApnsPushConfigurationResponse {
  public static final String JSON_PROPERTY_PUSH_CONFIGURATIONS = "push_configurations";
  private List<AddApnsPushConfigurationResponsePushConfigurationsInner> pushConfigurations = null;

  public AddApnsPushConfigurationResponse() { 
  }

  public AddApnsPushConfigurationResponse pushConfigurations(List<AddApnsPushConfigurationResponsePushConfigurationsInner> pushConfigurations) {
    this.pushConfigurations = pushConfigurations;
    return this;
  }

  public AddApnsPushConfigurationResponse addPushConfigurationsItem(AddApnsPushConfigurationResponsePushConfigurationsInner pushConfigurationsItem) {
    if (this.pushConfigurations == null) {
      this.pushConfigurations = new ArrayList<>();
    }
    this.pushConfigurations.add(pushConfigurationsItem);
    return this;
  }

   /**
   * Get pushConfigurations
   * @return pushConfigurations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PUSH_CONFIGURATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AddApnsPushConfigurationResponsePushConfigurationsInner> getPushConfigurations() {
    return pushConfigurations;
  }


  @JsonProperty(JSON_PROPERTY_PUSH_CONFIGURATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPushConfigurations(List<AddApnsPushConfigurationResponsePushConfigurationsInner> pushConfigurations) {
    this.pushConfigurations = pushConfigurations;
  }


  /**
   * Return true if this addApnsPushConfigurationResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddApnsPushConfigurationResponse addApnsPushConfigurationResponse = (AddApnsPushConfigurationResponse) o;
    return Objects.equals(this.pushConfigurations, addApnsPushConfigurationResponse.pushConfigurations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pushConfigurations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddApnsPushConfigurationResponse {\n");
    sb.append("    pushConfigurations: ").append(toIndentedString(pushConfigurations)).append("\n");
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

