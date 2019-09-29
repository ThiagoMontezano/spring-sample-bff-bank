package com.montezano.bff.controller;


import com.montezano.bff.controller.converter.InforCustomerBalanceAmountConverter;
import com.montezano.bff.controller.datacontract.InfoCustomerBalanceAmountDataContract;
import com.montezano.bff.entities.InfoCustomerBalanceAmount;
import com.montezano.bff.usecase.CustomerManager;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerManager customerManager;

    private final InforCustomerBalanceAmountConverter converter;

    @GetMapping("/id/{id}")
    public ResponseEntity<InfoCustomerBalanceAmountDataContract> getCustomerBalanceAmount(@PathVariable String id) {
        final InfoCustomerBalanceAmount customerBalanceAmount = customerManager.getCustomerBalanceAmount(id);
        return ResponseEntity.ok(converter.convert(customerBalanceAmount));
    }
}
