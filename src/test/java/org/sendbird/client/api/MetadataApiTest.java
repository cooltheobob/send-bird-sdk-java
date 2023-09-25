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


package org.sendbird.client.api;

import org.sendbird.client.*;
import org.sendbird.client.auth.*;
import org.openapitools.client.model.CreateChannelMetacounterData;
import org.openapitools.client.model.CreateChannelMetadataData;
import org.openapitools.client.model.CreateChannelMetadataResponse;
import org.openapitools.client.model.CreateUserMetadataData;
import org.openapitools.client.model.CreateUserMetadataResponse;
import org.openapitools.client.model.UpdateChannelMetacounterData;
import org.openapitools.client.model.UpdateChannelMetadataData;
import org.openapitools.client.model.UpdateUserMetadataData;
import org.openapitools.client.model.UpdateUserMetadataResponse;
import org.openapitools.client.model.ViewUserMetadataResponse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MetadataApi
 */
public class MetadataApiTest {

    private final MetadataApi api = new MetadataApi();

    /**
     * Create a channel metacounter
     *
     * ## Create a channel metacounter  Creates a channel metacounter&#39;s items to store in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-create-a-channel-metacounter ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createChannelMetacounterTest() throws ApiException {
        //String apiToken = null;
        //String channelType = null;
        //String channelUrl = null;
        //CreateChannelMetacounterData createChannelMetacounterData = null;
        //Object response = api.createChannelMetacounter(apiToken, channelType, channelUrl, createChannelMetacounterData);
        // TODO: test validations
    }

    /**
     * Create a channel metadata
     *
     * ## Create a channel metadata  Creates a channel metadata&#39;s items to store in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-create-a-channel-metadata ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createChannelMetadataTest() throws ApiException {
        //String apiToken = null;
        //String channelType = null;
        //String channelUrl = null;
        //CreateChannelMetadataData createChannelMetadataData = null;
        //CreateChannelMetadataResponse response = api.createChannelMetadata(apiToken, channelType, channelUrl, createChannelMetadataData);
        // TODO: test validations
    }

    /**
     * Create a user metadata
     *
     * ## Create a user metadata  Creates a user metadata&#39;s items to store in a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-create-a-user-metadata ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createUserMetadataTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //CreateUserMetadataData createUserMetadataData = null;
        //CreateUserMetadataResponse response = api.createUserMetadata(apiToken, userId, createUserMetadataData);
        // TODO: test validations
    }

    /**
     * Delete a channel metacounter - When deleting all items of a channel metacounter
     *
     * ## Delete a channel metacounter  Deletes a channel metacounter&#39;s item that is stored in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-delete-a-channel-metacounter ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel which has the metacounter to delete.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteChannelMetacounterTest() throws ApiException {
        //String apiToken = null;
        //String channelType = null;
        //String channelUrl = null;
        //api.deleteChannelMetacounter(apiToken, channelType, channelUrl);
        // TODO: test validations
    }

    /**
     * Delete a channel metacounter - When deleting a specific item of a channel metacounter by its key
     *
     * ## Delete a channel metacounter  Deletes a channel metacounter&#39;s item that is stored in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-delete-a-channel-metacounter ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel which has the metacounter to delete.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteChannelMetacounterByKeyTest() throws ApiException {
        //String apiToken = null;
        //String channelType = null;
        //String channelUrl = null;
        //String key = null;
        //api.deleteChannelMetacounterByKey(apiToken, channelType, channelUrl, key);
        // TODO: test validations
    }

    /**
     * Delete a channel metadata - When deleting all items of a channel metadata
     *
     * ## Delete a channel metadata  Deletes a channel metadata&#39;s one or all items that are stored in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-delete-a-channel-metadata ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel which has the metadata to delete.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteChannelMetadataTest() throws ApiException {
        //String apiToken = null;
        //String channelType = null;
        //String channelUrl = null;
        //String key = null;
        //api.deleteChannelMetadata(apiToken, channelType, channelUrl, key);
        // TODO: test validations
    }

    /**
     * Delete a channel metadata - When deleting a specific item of a channel metadata by its key
     *
     * ## Delete a channel metadata  Deletes a channel metadata&#39;s one or all items that are stored in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-delete-a-channel-metadata ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the channel which has the metadata to delete.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteChannelMetadataByKeyTest() throws ApiException {
        //String apiToken = null;
        //String channelType = null;
        //String channelUrl = null;
        //String key = null;
        //api.deleteChannelMetadataByKey(apiToken, channelType, channelUrl, key);
        // TODO: test validations
    }

    /**
     * Delete a user metadata - When deleting all items of a user metadata
     *
     * ## Delete a user metadata  Deletes a user metadata&#39;s one or all items that are stored in a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-delete-a-user-metadata ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the ID of the user who has the metadata to delete.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteUserMetadataTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //String key = null;
        //api.deleteUserMetadata(apiToken, userId, key);
        // TODO: test validations
    }

    /**
     * Delete a user metadata - When deleting a specific item of a user metadata by its key
     *
     * ## Delete a user metadata  Deletes a user metadata&#39;s one or all items that are stored in a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-delete-a-user-metadata ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the ID of the user who has the metadata to delete.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteUserMetadataByKeyTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //String key = null;
        //api.deleteUserMetadataByKey(apiToken, userId, key);
        // TODO: test validations
    }

    /**
     * Update a channel metacounter - When updating existing items of a channel metacounter by their keys or adding new items to the metacounter
     *
     * ## Update a channel metacounter  Updates existing items of a channel metacounter by their keys, or adds new items to the metacounter.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-update-a-channel-metacounter ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateChannelMetacounterTest() throws ApiException {
        //String apiToken = null;
        //String channelType = null;
        //String channelUrl = null;
        //UpdateChannelMetacounterData updateChannelMetacounterData = null;
        //Object response = api.updateChannelMetacounter(apiToken, channelType, channelUrl, updateChannelMetacounterData);
        // TODO: test validations
    }

    /**
     * Update a channel metacounter - When updating a specific item of a channel metacounter by its key
     *
     * ## Update a channel metacounter  Updates existing items of a channel metacounter by their keys, or adds new items to the metacounter.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-update-a-channel-metacounter ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateChannelMetacounterByKeyTest() throws ApiException {
        //String apiToken = null;
        //String channelType = null;
        //String channelUrl = null;
        //String key = null;
        //Object body = null;
        //Object response = api.updateChannelMetacounterByKey(apiToken, channelType, channelUrl, key, body);
        // TODO: test validations
    }

    /**
     * Update a channel metadata - When updating existing items of a channel metadata by their keys or adding new items to the metadata
     *
     * ## Update a channel metadata  Updates existing items of a channel metadata by their keys, or adds new items to the metadata.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-update-a-channel-metadata ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateChannelMetadataTest() throws ApiException {
        //String apiToken = null;
        //String channelType = null;
        //String channelUrl = null;
        //UpdateChannelMetadataData updateChannelMetadataData = null;
        //Object response = api.updateChannelMetadata(apiToken, channelType, channelUrl, updateChannelMetadataData);
        // TODO: test validations
    }

    /**
     * Update a channel metadata - When updating a specific item of a channel metadata by its key
     *
     * ## Update a channel metadata  Updates existing items of a channel metadata by their keys, or adds new items to the metadata.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-update-a-channel-metadata ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateChannelMetadataByKeyTest() throws ApiException {
        //String apiToken = null;
        //String channelType = null;
        //String channelUrl = null;
        //String key = null;
        //Object body = null;
        //Object response = api.updateChannelMetadataByKey(apiToken, channelType, channelUrl, key, body);
        // TODO: test validations
    }

    /**
     * Update a user metadata - When updating existing items of a user metadata by their keys or adding new items to the metadata
     *
     * ## Update a user metadata  Updates existing items of a user metadata by their keys, or adds new items to the metadata.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-update-a-user-metadata ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the ID of the user to update the metadata in.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateUserMetadataTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //UpdateUserMetadataData updateUserMetadataData = null;
        //UpdateUserMetadataResponse response = api.updateUserMetadata(apiToken, userId, updateUserMetadataData);
        // TODO: test validations
    }

    /**
     * Update a user metadata - When updating a specific item of a user metadata by its key
     *
     * ## Update a user metadata  Updates existing items of a user metadata by their keys, or adds new items to the metadata.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-update-a-user-metadata ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the ID of the user to update the metadata in.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateUserMetadataByKeyTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //String key = null;
        //Object body = null;
        //Object response = api.updateUserMetadataByKey(apiToken, userId, key, body);
        // TODO: test validations
    }

    /**
     * View a channel metacounter - When retrieving all items of a channel metacounter
     *
     * ## View a channel metacounter  Retrieves channel metacounter&#39;s one or more items that are stored in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-view-a-channel-metacounter ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void viewChannelMetacounterTest() throws ApiException {
        //String apiToken = null;
        //String channelType = null;
        //String channelUrl = null;
        //String key = null;
        //List<String> keys = null;
        //Object response = api.viewChannelMetacounter(apiToken, channelType, channelUrl, key, keys);
        // TODO: test validations
    }

    /**
     * View a channel metacounter - When retrieving a specific item of a channel metacounter by its key
     *
     * ## View a channel metacounter  Retrieves channel metacounter&#39;s one or more items that are stored in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-view-a-channel-metacounter ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void viewChannelMetacounterByKeyTest() throws ApiException {
        //String apiToken = null;
        //String channelType = null;
        //String channelUrl = null;
        //String key = null;
        //Object response = api.viewChannelMetacounterByKey(apiToken, channelType, channelUrl, key);
        // TODO: test validations
    }

    /**
     * View a channel metadata - When retrieving all items of a channel metadata
     *
     * ## View a channel metadata  Retrieves a channel metadata&#39;s one or more items that are stored in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-view-a-channel-metadata ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void viewChannelMetadataTest() throws ApiException {
        //String apiToken = null;
        //String channelType = null;
        //String channelUrl = null;
        //String key = null;
        //List<String> keys = null;
        //Object response = api.viewChannelMetadata(apiToken, channelType, channelUrl, key, keys);
        // TODO: test validations
    }

    /**
     * View a channel metadata - When retrieving a specific item of a channel metadata by its key
     *
     * ## View a channel metadata  Retrieves a channel metadata&#39;s one or more items that are stored in a channel.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-view-a-channel-metadata ----------------------------   &#x60;channel_type&#x60;      Type: string      Description: Specifies the type of the channel. Either open_channels or group_channels.  &#x60;channel_url&#x60;      Type: string      Description: Specifies the URL of the target channel.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void viewChannelMetadataByKeyTest() throws ApiException {
        //String apiToken = null;
        //String channelType = null;
        //String channelUrl = null;
        //String key = null;
        //Object response = api.viewChannelMetadataByKey(apiToken, channelType, channelUrl, key);
        // TODO: test validations
    }

    /**
     * View a user metadata - When retrieving all items of a user metadata
     *
     * ## View a user metadata  Retrieves a user metadata&#39;s one or more items that are stored in a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-view-a-user-metadata ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the ID of the user to retrieve the metadata in.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void viewUserMetadataTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //String key = null;
        //List<String> keys = null;
        //ViewUserMetadataResponse response = api.viewUserMetadata(apiToken, userId, key, keys);
        // TODO: test validations
    }

    /**
     * View a user metadata - When retrieving a specific item of a user metadata by its key
     *
     * ## View a user metadata  Retrieves a user metadata&#39;s one or more items that are stored in a user.  https://sendbird.com/docs/chat/v3/platform-api/guides/user-and-channel-metadata#2-view-a-user-metadata ----------------------------   &#x60;user_id&#x60;      Type: string      Description: Specifies the ID of the user to retrieve the metadata in.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void viewUserMetadataByKeyTest() throws ApiException {
        //String apiToken = null;
        //String userId = null;
        //String key = null;
        //Object response = api.viewUserMetadataByKey(apiToken, userId, key);
        // TODO: test validations
    }

}