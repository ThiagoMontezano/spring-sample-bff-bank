package com.montezano.bff.rest;

import com.montezano.bff.rest.datacontract.CustomerDataContract;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Profile;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(url =EndpointConstants.customerServiceUrl, name = EndpointConstants.customerServiceName)
@Profile("!test")
public interface CustomerEndpoint {

    @RequestMapping(method = RequestMethod.GET, value = "/{id}",
                    produces = MediaType.APPLICATION_JSON_VALUE,
                    consumes = MediaType.APPLICATION_JSON_VALUE)
    CustomerDataContract getCustomer(@PathVariable("id") String customerId );
}
