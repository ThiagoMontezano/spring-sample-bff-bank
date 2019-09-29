package com.montezano.bff.rest;

public interface EndpointConstants {

    String accountServiceName = "${apis.account.name:}";

    String accountServiceUrl = "${apis.account.url:}";

    String customerServiceName = "${apis.customer.name:}";

    String customerServiceUrl = "${apis.customer.url:}";

}
