package com.agenda30.msscbrewery.web.services.impl;

import com.agenda30.msscbrewery.web.model.BeerDto;
import com.agenda30.msscbrewery.web.model.BeerStyleEnum;
import com.agenda30.msscbrewery.web.services.BeerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
@Slf4j
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
                .beerStyle(BeerStyleEnum.ALE)
                .build();
    }

    /**
     * @param beerDto beer to be created
     * @return saved beer
     */
    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        log.info("[{}]", beerDto);
        return BeerDto.builder()
                .beerStyle(beerDto.getBeerStyle())
                .id(UUID.randomUUID())
                .beerName(beerDto.getBeerName())
                .upc(1L)
                .build();
    }

    /**
     * @param beerId beer to be updated
     * @param beerDto beer details
     */
    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        log.info("Updating beer....");
    }

    /**
     * @param beerId beer to be deleted
     */
    @Override
    public void deleteById(UUID beerId) {
        log.info("Deleting beer....");
    }
}
