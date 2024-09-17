package com.smart.consumption.command.infrastructure.adapter.rest.data.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.smart.consumption.command.domain.models.product.Price;
import jakarta.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductRequest {
    
    @JsonIgnore
    private Long id;

    @NotBlank(message = "The name is required")
    private String name;

    @NotBlank(message = "The description is required")
    private String description;

    private Price price;
}
