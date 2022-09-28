package com.agenda30.msscbrewery.web.services;

import com.agenda30.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
