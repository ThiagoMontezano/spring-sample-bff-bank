package com.montezano.bff.rest;


import com.montezano.bff.rest.datacontract.AccountDataContract;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Profile;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url =EndpointConstants.accountServiceUrl, name = EndpointConstants.accountServiceName)
@Profile("!test")
public interface AccountEndpoint {


    @RequestMapping(method = RequestMethod.GET, value = "/search/byCustomer",
            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    AccountDataContract getAccountByCustomerId(@RequestParam(value ="id") String customerId); //@RequestParam(value="key")

}
