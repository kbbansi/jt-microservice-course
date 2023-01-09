package com.agenda30.msscbrewery.bootstrap;

import com.agenda30.msscbrewery.domain.Beer;
import com.agenda30.msscbrewery.repository.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository repository) {
        this.beerRepository = repository;
    }

    @Override
    public void run(String... args) {
        loadBeerObjects();
    }


    private void loadBeerObjects() {
        if (beerRepository.count() == 0) {
            beerRepository.saveAll(
                    List.of(
                            Beer.builder()
                                    .beerName("ABC Beer")
                                    .beerStyle("Larger")
                                    .quantityToBrew(200)
                                    .upc(200L)
                                    .price(new BigDecimal("35.5"))
                                    .minOnHand(12)
                                    .build(),
                            Beer.builder()
                                    .beerName("Club Beer")
                                    .beerStyle("Shandy")
                                    .quantityToBrew(300)
                                    .upc(20012L)
                                    .price(new BigDecimal("40.5"))
                                    .minOnHand(10)
                                    .build(),
                            Beer.builder()
                                    .beerName("Kiss Beer")
                                    .beerStyle("Herbal")
                                    .quantityToBrew(240)
                                    .upc(20023L)
                                    .price(new BigDecimal("50.5"))
                                    .minOnHand(14)
                                    .build()
                    )
            );
        }
        System.out.println("Loaded beers: " + beerRepository.count());
    }
}
