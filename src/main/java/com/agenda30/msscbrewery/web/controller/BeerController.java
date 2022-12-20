package com.agenda30.msscbrewery.web.controller;

import com.agenda30.msscbrewery.web.model.BeerDto;
import com.agenda30.msscbrewery.web.services.BeerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(path = "/api/v1/beer")
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService service) {
        beerService = service;
    }


    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable UUID beerId) {
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<HttpHeaders> handlePost(@RequestBody BeerDto beerDto) {
        BeerDto savedDto = beerService.saveNewBeer(beerDto);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/beer/" + savedDto.getId().toString());

        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleUpdate(@PathVariable UUID beerId, @RequestBody BeerDto beerDto) {
        beerService.updateBeer(beerId, beerDto);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleDelete(@PathVariable UUID beerId) {
        beerService.deleteById(beerId);
    }
}
