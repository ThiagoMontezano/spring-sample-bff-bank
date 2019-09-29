package com.montezano.bff.rest.datacontract;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDataContract {

    private String name;
    private String email;
    private LocalDate createdAt;
}

