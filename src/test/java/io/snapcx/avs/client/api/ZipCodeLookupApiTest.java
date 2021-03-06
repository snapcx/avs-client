/**
 * snapCX - Address Validation APIs for commerce & retailers.
 * This set of API end points, provides real time address validations and corrections. Also do zipcode lookups etc. To invoke this API, you need to have your own private api key (aka user_key). You can always sign up for FREE plan to get user_key.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@snapcx.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.snapcx.avs.client.api;

import io.snapcx.avs.client.ApiException;
import io.snapcx.avs.client.model.InlineResponse2001;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ZipCodeLookupApi
 */
public class ZipCodeLookupApiTest {

    private final ZipCodeLookupApi api = new ZipCodeLookupApi();

    
    /**
     * Gets zipcode details for a given zipcode Or get all zipcodes for given city &amp; state.
     *
     * This API provides zipcode lookup for a city &amp; state or lookup city/state for a given zipcode. If city has multiple zipcode assigned, then all zipcodes are returned. To further filter, filter on zipcode-&gt;type value. To invoke this API, you need to have your own private api key (aka user_key). You can always sign up for FREE plan to get user_key. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void zipInfoTest() throws ApiException {
        String userKey = null;
        String requestId = null;
        String city = null;
        String state = null;
        String zipcode = null;
        // InlineResponse2001 response = api.zipInfo(userKey, requestId, city, state, zipcode);

        // TODO: test validations
    }
    
}
