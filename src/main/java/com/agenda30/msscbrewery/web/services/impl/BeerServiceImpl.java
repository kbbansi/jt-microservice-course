package com.agenda30.msscbrewery.web.services.impl;

import com.agenda30.msscbrewery.web.model.BeerDto;
import com.agenda30.msscbrewery.web.services.BeerService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {

    /**
     * @param beerId beer uuid
     * @return beer
     */
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .beerName("Club Beer")
                .id(UUID.randomUUID())
                .beerStyle("Pale Ale")
                .build();
    }
}
