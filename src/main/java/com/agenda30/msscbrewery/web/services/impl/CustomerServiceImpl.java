package com.agenda30.msscbrewery.web.services.impl;

import com.agenda30.msscbrewery.web.model.CustomerDto;
import com.agenda30.msscbrewery.web.services.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
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

    /**
     * @param customerDto customer to save
     * @return saved customer
     */
    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name(customerDto.getName())
                .build();
    }

    /**
     * @param customerId customer to update
     * @param customerDto customer details to update
     */
    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        log.info("Updating customer.....");
    }

    /**
     * @param customerId customer to be deleted
     */
    @Override
    public void deleteById(UUID customerId) {
        log.info("Deleting customer....");
    }
}
