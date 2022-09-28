package com.agenda30.msscbrewery.web.services.impl;

import com.agenda30.msscbrewery.web.model.CustomerDto;
import com.agenda30.msscbrewery.web.services.CustomerService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    /**
     * @param customerId customer id
     * @return customer
     */
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Kofi Ghana")
                .build();
    }
}
