package com.montezano.bff.usecase;

import com.montezano.bff.entities.InfoCustomerBalanceAmount;
import com.montezano.bff.rest.AccountEndpoint;
import com.montezano.bff.rest.CustomerEndpoint;
import com.montezano.bff.rest.datacontract.AccountDataContract;
import com.montezano.bff.rest.datacontract.CustomerDataContract;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class CustomerManager {

    private final AccountEndpoint accountEndpoint;

    private final CustomerEndpoint customerEndpoint;

    public InfoCustomerBalanceAmount getCustomerBalanceAmount(final String customerId) {
        final CustomerDataContract customer = customerEndpoint.getCustomer(customerId);
        final AccountDataContract account = accountEndpoint.getAccountByCustomerId(customerId);

        return InfoCustomerBalanceAmount.builder()
                .balanceAmount(account.getBalanceAmount())
                .email(customer.getEmail())
                .name(customer.getName())
                .build();
    }
}
