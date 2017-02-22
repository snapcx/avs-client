# ZipCodeLookupApi

All URIs are relative to *https://api.snapcx.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zipInfo**](ZipCodeLookupApi.md#zipInfo) | **GET** /avs/v1/zipInfo | Gets zipcode details for a given zipcode Or get all zipcodes for given city &amp; state.


<a name="zipInfo"></a>
# **zipInfo**
> InlineResponse2001 zipInfo(userKey, requestId, city, state, zipcode)

Gets zipcode details for a given zipcode Or get all zipcodes for given city &amp; state.

This API provides zipcode lookup for a city &amp; state or lookup city/state for a given zipcode. If city has multiple zipcode assigned, then all zipcodes are returned. To further filter, filter on zipcode-&gt;type value. To invoke this API, you need to have your own private api key (aka user_key). You can always sign up for FREE plan to get user_key. 

### Example
```java
// Import classes:
//import io.snapcx.avs.client.ApiException;
//import io.snapcx.avs.client.api.ZipCodeLookupApi;


ZipCodeLookupApi apiInstance = new ZipCodeLookupApi();
String userKey = "userKey_example"; // String | Your private key, given after opening account with snapcx.io
String requestId = "requestId_example"; // String | Any unique string identifier. Same string will be part of response header.
String city = "city_example"; // String | City name. Provide either zipcode OR both city & state.
String state = "state_example"; // String | 2 Char State abbrv. Example NJ, NY, CA etc. Provide either zipcode OR both city & state.
String zipcode = "zipcode_example"; // String | 5 Digit zipcode. Provide either zipcode OR both city & state.
try {
    InlineResponse2001 result = apiInstance.zipInfo(userKey, requestId, city, state, zipcode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZipCodeLookupApi#zipInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userKey** | **String**| Your private key, given after opening account with snapcx.io |
 **requestId** | **String**| Any unique string identifier. Same string will be part of response header. | [optional]
 **city** | **String**| City name. Provide either zipcode OR both city &amp; state. | [optional]
 **state** | **String**| 2 Char State abbrv. Example NJ, NY, CA etc. Provide either zipcode OR both city &amp; state. | [optional]
 **zipcode** | **String**| 5 Digit zipcode. Provide either zipcode OR both city &amp; state. | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

