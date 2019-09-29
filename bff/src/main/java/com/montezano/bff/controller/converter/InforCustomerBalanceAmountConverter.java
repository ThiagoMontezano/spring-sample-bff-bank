package com.montezano.bff.controller.converter;

import com.montezano.bff.controller.datacontract.InfoCustomerBalanceAmountDataContract;
import com.montezano.bff.entities.InfoCustomerBalanceAmount;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class InforCustomerBalanceAmountConverter implements Converter<InfoCustomerBalanceAmount, InfoCustomerBalanceAmountDataContract> {

    @Override
    public InfoCustomerBalanceAmountDataContract convert(final InfoCustomerBalanceAmount infoCustomerBalanceAmount) {
        InfoCustomerBalanceAmountDataContract dataContract = new InfoCustomerBalanceAmountDataContract();
        BeanUtils.copyProperties(infoCustomerBalanceAmount, dataContract);
        return dataContract;
    }
}
