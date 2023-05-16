package com.agenda30.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDto {
    private UUID id;

    @NotNull
    @Min(value = 3, message = "Customer name should be more than 3 characters long")
    @Max(value = 10, message = "Customer name should not be more than 10 characters long")
    private String name;
}
