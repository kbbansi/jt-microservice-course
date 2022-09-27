package com.agenda30.msscbrewery.web.services;

import com.agenda30.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
