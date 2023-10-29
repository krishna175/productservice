package com.msaproject.productservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(value = "product")
@AllArgsConstructor  //generates a constructor that includes all fields of the class as parameters.
@NoArgsConstructor // It can be useful when you want to create objects of a class without passing any arguments
@Builder //The builder pattern provides a convenient way to construct objects by chaining method calls
@Data  // generates getters and setters for all fields
public class Product {

    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;

}
