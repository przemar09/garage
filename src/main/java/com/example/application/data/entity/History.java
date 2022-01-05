package com.example.application.data.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class History extends AbstractEntity{

    @OneToOne
    private Car car;

    @NotEmpty
    private String description="";

    private Date date;

    private String mileage="";



}
