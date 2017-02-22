
# AddressSummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errorCode** | **String** | Error Code in case of any problem for this particular address. |  [optional]
**errorMessage** | **String** | Error Message in case of any problem for this particular address.  |  [optional]
**status** | **String** | Two possible values, SUCCESS or FAIL. |  [optional]
**cached** | **Boolean** | if address was validated using cache. Generally, it will be always be false. |  [optional]
**matchCode** | **String** | Primary match code. Either of AVS_01 or AVS_02 or AVS_03 |  [optional]
**detailedMatchCodes** | **String** | Further drill down on matchCode above. |  [optional]
**dpvIndicator** | **String** | dpvIndicator |  [optional]
**dpvFootNote1** | **String** | dpvFootNote1 (Future use) |  [optional]
**dpvFootNote2** | **String** | dpvFootNote2 (Future Use). |  [optional]
**dpvVacantIndicator** | **String** | dpvVacantIndicator (Future Use). |  [optional]
**message** | **String** | Message from validation engine, hinting what has been corrected on input address. |  [optional]
**footnotes** | **String** | USPS footnotes values. |  [optional]



