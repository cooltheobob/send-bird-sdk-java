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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.sendbird.client.JSON;


/**
 * BlockUserData
 */
@JsonPropertyOrder({
  BlockUserData.JSON_PROPERTY_USER_ID,
  BlockUserData.JSON_PROPERTY_TARGET_ID,
  BlockUserData.JSON_PROPERTY_USER_IDS,
  BlockUserData.JSON_PROPERTY_USERS
})
@JsonTypeName("blockUserData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-31T16:21:40.271053+01:00[Europe/London]")
public class BlockUserData {
  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private String userId;

  public static final String JSON_PROPERTY_TARGET_ID = "target_id";
  private String targetId;

  public static final String JSON_PROPERTY_USER_IDS = "user_ids";
  private List<String> userIds = new ArrayList<>();

  public static final String JSON_PROPERTY_USERS = "users";
  private List<String> users = new ArrayList<>();

  public BlockUserData() { 
  }

  public BlockUserData userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Specifies the unique ID of the user to block.
   * @return userId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the unique ID of the user to block.")
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


  public BlockUserData targetId(String targetId) {
    this.targetId = targetId;
    return this;
  }

   /**
   * Specifies the ID of the user to be blocked.
   * @return targetId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the ID of the user to be blocked.")
  @JsonProperty(JSON_PROPERTY_TARGET_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTargetId() {
    return targetId;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }


  public BlockUserData userIds(List<String> userIds) {
    this.userIds = userIds;
    return this;
  }

  public BlockUserData addUserIdsItem(String userIdsItem) {
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * Specifies an array of the IDs of the users to be blocked at a time. (for bulk mode)
   * @return userIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies an array of the IDs of the users to be blocked at a time. (for bulk mode)")
  @JsonProperty(JSON_PROPERTY_USER_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getUserIds() {
    return userIds;
  }


  @JsonProperty(JSON_PROPERTY_USER_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
  }


  public BlockUserData users(List<String> users) {
    this.users = users;
    return this;
  }

  public BlockUserData addUsersItem(String usersItem) {
    this.users.add(usersItem);
    return this;
  }

   /**
   * Specifies an array of the IDs of the users to be blocked at a time. The user_ids above and this property can be used interchangeably. (for bulk mode)
   * @return users
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies an array of the IDs of the users to be blocked at a time. The user_ids above and this property can be used interchangeably. (for bulk mode)")
  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getUsers() {
    return users;
  }


  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUsers(List<String> users) {
    this.users = users;
  }


  /**
   * Return true if this blockUserData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockUserData blockUserData = (BlockUserData) o;
    return Objects.equals(this.userId, blockUserData.userId) &&
        Objects.equals(this.targetId, blockUserData.targetId) &&
        Objects.equals(this.userIds, blockUserData.userIds) &&
        Objects.equals(this.users, blockUserData.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, targetId, userIds, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockUserData {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

