package com.example.application.data.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Car extends AbstractEntity{

    @NotEmpty
    private String brand ="";

    @NotEmpty
    private String model ="";

    private String prodYear ="";

    private String vin ="";

    private String engine ="";

}
