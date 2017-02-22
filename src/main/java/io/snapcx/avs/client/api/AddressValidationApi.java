package io.snapcx.avs.client.api;

import io.snapcx.avs.client.ApiException;
import io.snapcx.avs.client.ApiClient;
import io.snapcx.avs.client.Configuration;
import io.snapcx.avs.client.Pair;

import javax.ws.rs.core.GenericType;

import io.snapcx.avs.client.model.InlineResponse200;
import io.snapcx.avs.client.model.InlineResponse2001;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-03T19:15:39.720-05:00")
public class AddressValidationApi {
  private ApiClient apiClient;

  public AddressValidationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AddressValidationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * [USA] Validate Address and provide corrected addresses.
   * This API provides real time address validation. If input address is not perfect match, then it will provide possible addresses. To invoke this API, you need to have your own private api key (aka user_key). You can always sign up for FREE plan to get user_key. 
   * @param userKey Your private key, given after opening account with snapcx.io (required)
   * @param requestId Any unique string identifier. Same string will be part of response header. (required)
   * @param street Address line1. It&#39;s mandatory field. (required)
   * @param secondary Address line2. Second line of address, as required. (optional)
   * @param city City name. (optional)
   * @param state 2 Char State abbrv. Example NJ, NY, CA etc. (optional)
   * @param zipcode 5 Digit zipcode. (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public InlineResponse200 validateAddress(String userKey, String requestId, String street, String secondary, String city, String state, String zipcode) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userKey' is set
    if (userKey == null) {
      throw new ApiException(400, "Missing the required parameter 'userKey' when calling validateAddress");
    }
    
    // verify the required parameter 'requestId' is set
    if (requestId == null) {
      throw new ApiException(400, "Missing the required parameter 'requestId' when calling validateAddress");
    }
    
    // verify the required parameter 'street' is set
    if (street == null) {
      throw new ApiException(400, "Missing the required parameter 'street' when calling validateAddress");
    }
    
    // create path and map variables
    String localVarPath = "/avs/v1/validateAddress".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "request_id", requestId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "street", street));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "secondary", secondary));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "city", city));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "state", state));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "zipcode", zipcode));

    if (userKey != null)
      localVarHeaderParams.put("user_key", apiClient.parameterToString(userKey));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<InlineResponse200> localVarReturnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Global validate Address and provide corrected addresses for all over the world.
   * This API provides real time address validation. If input address is not perfect match, then it will provide possible addresses. To invoke this API, you need to have your own private api key (aka user_key). You can always sign up for subscription plan to get user_key. 
   * @param userKey Your private key, given after opening account with snapcx.io (required)
   * @param requestId Any unique string identifier. Same string will be part of response header. (required)
   * @param street Address line1. It&#39;s mandatory field. (required)
   * @param country Country name or ISO 3 Char country code. Example GBR, CAN, DEU etc. (required)
   * @param secondary Address line2. Second line of address, as required. (optional)
   * @param city City name. (optional)
   * @param state 2 Char State abbrv. Example NJ, NY, CA etc. (optional)
   * @param zipcode 5 Digit zipcode. (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public InlineResponse200 validateGlobalAddress(String userKey, String requestId, String street, String country, String secondary, String city, String state, String zipcode) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userKey' is set
    if (userKey == null) {
      throw new ApiException(400, "Missing the required parameter 'userKey' when calling validateGlobalAddress");
    }
    
    // verify the required parameter 'requestId' is set
    if (requestId == null) {
      throw new ApiException(400, "Missing the required parameter 'requestId' when calling validateGlobalAddress");
    }
    
    // verify the required parameter 'street' is set
    if (street == null) {
      throw new ApiException(400, "Missing the required parameter 'street' when calling validateGlobalAddress");
    }
    
    // verify the required parameter 'country' is set
    if (country == null) {
      throw new ApiException(400, "Missing the required parameter 'country' when calling validateGlobalAddress");
    }
    
    // create path and map variables
    String localVarPath = "/avs/v1/validateGlobalAddress".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "request_id", requestId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "street", street));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "secondary", secondary));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "city", city));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "state", state));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "zipcode", zipcode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "country", country));

    if (userKey != null)
      localVarHeaderParams.put("user_key", apiClient.parameterToString(userKey));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<InlineResponse200> localVarReturnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Gets zipcode details for a given zipcode Or get all zipcodes for given city &amp; state.
   * This API provides zipcode lookup for a city &amp; state or lookup city/state for a given zipcode. If city has multiple zipcode assigned, then all zipcodes are returned. To further filter, filter on zipcode-&gt;type value. To invoke this API, you need to have your own private api key (aka user_key). You can always sign up for FREE plan to get user_key. 
   * @param userKey Your private key, given after opening account with snapcx.io (required)
   * @param requestId Any unique string identifier. Same string will be part of response header. (optional)
   * @param city City name. Provide either zipcode OR both city &amp; state. (optional)
   * @param state 2 Char State abbrv. Example NJ, NY, CA etc. Provide either zipcode OR both city &amp; state. (optional)
   * @param zipcode 5 Digit zipcode. Provide either zipcode OR both city &amp; state. (optional)
   * @return InlineResponse2001
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2001 zipInfo(String userKey, String requestId, String city, String state, String zipcode) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userKey' is set
    if (userKey == null) {
      throw new ApiException(400, "Missing the required parameter 'userKey' when calling zipInfo");
    }
    
    // create path and map variables
    String localVarPath = "/avs/v1/zipInfo".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "request_id", requestId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "city", city));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "state", state));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "zipcode", zipcode));

    if (userKey != null)
      localVarHeaderParams.put("user_key", apiClient.parameterToString(userKey));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<InlineResponse2001> localVarReturnType = new GenericType<InlineResponse2001>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
