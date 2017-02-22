# AddressValidationApi

All URIs are relative to *https://api.snapcx.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**validateAddress**](AddressValidationApi.md#validateAddress) | **GET** /avs/v1/validateAddress | [USA] Validate Address and provide corrected addresses.
[**validateGlobalAddress**](AddressValidationApi.md#validateGlobalAddress) | **GET** /avs/v1/validateGlobalAddress | Global validate Address and provide corrected addresses for all over the world.
[**zipInfo**](AddressValidationApi.md#zipInfo) | **GET** /avs/v1/zipInfo | Gets zipcode details for a given zipcode Or get all zipcodes for given city &amp; state.


<a name="validateAddress"></a>
# **validateAddress**
> InlineResponse200 validateAddress(userKey, requestId, street, secondary, city, state, zipcode)

[USA] Validate Address and provide corrected addresses.

This API provides real time address validation. If input address is not perfect match, then it will provide possible addresses. To invoke this API, you need to have your own private api key (aka user_key). You can always sign up for FREE plan to get user_key. 

### Example
```java
// Import classes:
//import io.snapcx.avs.client.ApiException;
//import io.snapcx.avs.client.api.AddressValidationApi;


AddressValidationApi apiInstance = new AddressValidationApi();
String userKey = "userKey_example"; // String | Your private key, given after opening account with snapcx.io
String requestId = "requestId_example"; // String | Any unique string identifier. Same string will be part of response header.
String street = "street_example"; // String | Address line1. It's mandatory field.
String secondary = "secondary_example"; // String | Address line2. Second line of address, as required.
String city = "city_example"; // String | City name.
String state = "state_example"; // String | 2 Char State abbrv. Example NJ, NY, CA etc.
String zipcode = "zipcode_example"; // String | 5 Digit zipcode.
try {
    InlineResponse200 result = apiInstance.validateAddress(userKey, requestId, street, secondary, city, state, zipcode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressValidationApi#validateAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userKey** | **String**| Your private key, given after opening account with snapcx.io |
 **requestId** | **String**| Any unique string identifier. Same string will be part of response header. |
 **street** | **String**| Address line1. It&#39;s mandatory field. |
 **secondary** | **String**| Address line2. Second line of address, as required. | [optional]
 **city** | **String**| City name. | [optional]
 **state** | **String**| 2 Char State abbrv. Example NJ, NY, CA etc. | [optional]
 **zipcode** | **String**| 5 Digit zipcode. | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="validateGlobalAddress"></a>
# **validateGlobalAddress**
> InlineResponse200 validateGlobalAddress(userKey, requestId, street, country, secondary, city, state, zipcode)

Global validate Address and provide corrected addresses for all over the world.

This API provides real time address validation. If input address is not perfect match, then it will provide possible addresses. To invoke this API, you need to have your own private api key (aka user_key). You can always sign up for subscription plan to get user_key. 

### Example
```java
// Import classes:
//import io.snapcx.avs.client.ApiException;
//import io.snapcx.avs.client.api.AddressValidationApi;


AddressValidationApi apiInstance = new AddressValidationApi();
String userKey = "userKey_example"; // String | Your private key, given after opening account with snapcx.io
String requestId = "requestId_example"; // String | Any unique string identifier. Same string will be part of response header.
String street = "street_example"; // String | Address line1. It's mandatory field.
String country = "country_example"; // String | Country name or ISO 3 Char country code. Example GBR, CAN, DEU etc.
String secondary = "secondary_example"; // String | Address line2. Second line of address, as required.
String city = "city_example"; // String | City name.
String state = "state_example"; // String | 2 Char State abbrv. Example NJ, NY, CA etc.
String zipcode = "zipcode_example"; // String | 5 Digit zipcode.
try {
    InlineResponse200 result = apiInstance.validateGlobalAddress(userKey, requestId, street, country, secondary, city, state, zipcode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressValidationApi#validateGlobalAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userKey** | **String**| Your private key, given after opening account with snapcx.io |
 **requestId** | **String**| Any unique string identifier. Same string will be part of response header. |
 **street** | **String**| Address line1. It&#39;s mandatory field. |
 **country** | **String**| Country name or ISO 3 Char country code. Example GBR, CAN, DEU etc. |
 **secondary** | **String**| Address line2. Second line of address, as required. | [optional]
 **city** | **String**| City name. | [optional]
 **state** | **String**| 2 Char State abbrv. Example NJ, NY, CA etc. | [optional]
 **zipcode** | **String**| 5 Digit zipcode. | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="zipInfo"></a>
# **zipInfo**
> InlineResponse2001 zipInfo(userKey, requestId, city, state, zipcode)

Gets zipcode details for a given zipcode Or get all zipcodes for given city &amp; state.

This API provides zipcode lookup for a city &amp; state or lookup city/state for a given zipcode. If city has multiple zipcode assigned, then all zipcodes are returned. To further filter, filter on zipcode-&gt;type value. To invoke this API, you need to have your own private api key (aka user_key). You can always sign up for FREE plan to get user_key. 

### Example
```java
// Import classes:
//import io.snapcx.avs.client.ApiException;
//import io.snapcx.avs.client.api.AddressValidationApi;


AddressValidationApi apiInstance = new AddressValidationApi();
String userKey = "userKey_example"; // String | Your private key, given after opening account with snapcx.io
String requestId = "requestId_example"; // String | Any unique string identifier. Same string will be part of response header.
String city = "city_example"; // String | City name. Provide either zipcode OR both city & state.
String state = "state_example"; // String | 2 Char State abbrv. Example NJ, NY, CA etc. Provide either zipcode OR both city & state.
String zipcode = "zipcode_example"; // String | 5 Digit zipcode. Provide either zipcode OR both city & state.
try {
    InlineResponse2001 result = apiInstance.zipInfo(userKey, requestId, city, state, zipcode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressValidationApi#zipInfo");
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

