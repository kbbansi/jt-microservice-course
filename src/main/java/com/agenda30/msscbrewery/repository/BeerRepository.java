package com.agenda30.msscbrewery.repository;

import com.agenda30.msscbrewery.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BeerRepository extends PagingAndSortingRepository<Beer, Long> {
}
