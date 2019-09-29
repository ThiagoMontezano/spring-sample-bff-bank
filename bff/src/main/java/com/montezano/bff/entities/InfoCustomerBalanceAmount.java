package com.montezano.bff.entities;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class InfoCustomerBalanceAmount {
    private String name;

    private String email;

    private Double balanceAmount;
}
