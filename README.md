# snapCX.io Address Validation & Correction *Java* Client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.snapcx</groupId>
    <artifactId>avs-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.snapcx:avs-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/avs-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

### cURL Example
```curl
curl -X GET -H "user_key: d111120ba53b07fxxxx05bc8c754a33f" "https://api.snapcx.io/avs/v1/validateAddress?request_id=12345&street=1%20Rosedale%20Street&city=baltimore&state=md&zipcode=08534"

curl -X GET -H "user_key: 777d94a03dd15c0d5782686aae88888c" "https://api.snapcx.io/avs/v1/validateGlobalAddress?request_id=12345&street=2%20Holt%20Street&city=Surry%20Hills&state=NSW&zipcode=2012&country=AU"

```

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.snapcx.avs.client.*;
import io.snapcx.avs.client.auth.*;
import io.snapcx.avs.client.model.*;
import io.snapcx.avs.client.api.AddressValidationApi;

import java.io.File;
import java.util.*;

public class AddressValidationApiExample {

    public static void main(String[] args) {
        
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.snapcx.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AddressValidationApi* | [**validateAddress**](docs/AddressValidationApi.md#validateAddress) | **GET** /avs/v1/validateAddress | [USA] Validate Address and provide corrected addresses.
*AddressValidationApi* | [**validateGlobalAddress**](docs/AddressValidationApi.md#validateGlobalAddress) | **GET** /avs/v1/validateGlobalAddress | Global validate Address and provide corrected addresses for all over the world.

## Documentation for Models

 - [Address](docs/Address.md)
 - [AddressRecordObj](docs/AddressRecordObj.md)
 - [AddressSummary](docs/AddressSummary.md)
 - [Header](docs/Header.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [RequestObject](docs/RequestObject.md)
 - [RequestParams](docs/RequestParams.md)

## Documentation for Authorization

All endpoints require *API KEY* in request *header*. You can get your api key from [developer portal of snapcx.io](https://developer.snapcx.io). Name of header key is *user_key*
Example
```
user_key:d111120ba53b07fxxxx05bc8c754a33f
```

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Website

https://snapcx.io

### Pricing & Subscription plans

https://snapcx.io/pricing

### Contact us

https://snapcx.io/contactus

### API Status

https://status.snapcx.io

### Troubleshooting and API Explorer

(You can use your API Key to test API end point)
https://snapcx.io/addressValidationAPI

