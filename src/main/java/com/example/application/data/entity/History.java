package com.example.application.data.entity;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class History extends AbstractEntity{

    @NotNull
    private Car car;

    @NotEmpty
    private String description="";

    @NotEmpty
    private Date date;

    @NotEmpty
    private String mileage="";
}
