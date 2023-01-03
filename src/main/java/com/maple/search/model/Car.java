package com.maple.search.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "car")
public class Car {
    private final static long serialVersionUID = 3381379210325832090L;
    @Id
    private String id;
    private String brand;
    private String type;
    private Double price;
    private Double quantity;
    private Double subtotal;
}
