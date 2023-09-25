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
import org.openapitools.client.model.ListGdprRequestsResponse;
import org.openapitools.client.model.RegisterGdprRequestData;
import org.openapitools.client.model.RegisterGdprRequestResponse;
import org.openapitools.client.model.ViewGdprRequestByIdResponse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PrivacyApi
 */
public class PrivacyApiTest {

    private final PrivacyApi api = new PrivacyApi();

    /**
     * Cancel the registration of a GDPR request
     *
     * ## Cancel the registration of a GDPR request  Cancels the registration of a specific GDPR request.  https://sendbird.com/docs/chat/v3/platform-api/guides/data-privacy#2-cancel-the-registration-of-a-gdpr-request ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelTheRegistrationOfGdprRequestByIdTest() throws ApiException {
        //String apiToken = null;
        //String requestId = null;
        //api.cancelTheRegistrationOfGdprRequestById(apiToken, requestId);
        // TODO: test validations
    }

    /**
     * List GDPR requests
     *
     * ## List GDPR requests  Retrieves a list of GDPR requests of all types.  https://sendbird.com/docs/chat/v3/platform-api/guides/data-privacy#2-list-gdpr-requests ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listGdprRequestsTest() throws ApiException {
        //String apiToken = null;
        //String token = null;
        //Integer limit = null;
        //ListGdprRequestsResponse response = api.listGdprRequests(apiToken, token, limit);
        // TODO: test validations
    }

    /**
     * Register a GDPR request
     *
     * ## Register a GDPR request  Registers a specific type of GDPR request to meet the GDPR&#39;s requirements.  &gt; __Note__: Currently, only delete and access of the user data are supported. The features for the [right to restriction of processing](https://gdpr-info.eu/art-18-gdpr/) and [right to object](https://gdpr-info.eu/art-21-gdpr/) will be available soon.  https://sendbird.com/docs/chat/v3/platform-api/guides/data-privacy#2-register-a-gdpr-request
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void registerGdprRequestTest() throws ApiException {
        //String apiToken = null;
        //RegisterGdprRequestData registerGdprRequestData = null;
        //RegisterGdprRequestResponse response = api.registerGdprRequest(apiToken, registerGdprRequestData);
        // TODO: test validations
    }

    /**
     * View a GDPR request
     *
     * ## View a GDPR request  Retrieves a specific GDPR request.  https://sendbird.com/docs/chat/v3/platform-api/guides/data-privacy#2-view-a-gdpr-request ----------------------------
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void viewGdprRequestByIdTest() throws ApiException {
        //String apiToken = null;
        //String requestId = null;
        //ViewGdprRequestByIdResponse response = api.viewGdprRequestById(apiToken, requestId);
        // TODO: test validations
    }

}
