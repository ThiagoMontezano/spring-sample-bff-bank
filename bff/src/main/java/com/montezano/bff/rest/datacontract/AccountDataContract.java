package com.montezano.bff.rest.datacontract;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountDataContract {

    private String accountNumber;
    private String agencyNumber;
    private String customerId;
    private Double balanceAmount;
    private Double transactionLimit;
    private Boolean active;
    private LocalDate createdAt;

}
