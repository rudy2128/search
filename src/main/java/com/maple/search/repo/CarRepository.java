package com.maple.search.repo;

import com.maple.search.model.Car;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface CarRepository extends ElasticsearchRepository<Car,String> {
}
