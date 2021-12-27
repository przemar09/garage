package com.example.application.data.entity;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

@Entity
public class Car extends AbstractEntity{

    @NotEmpty
    private String brand ="";

    @NotEmpty
    private String model ="";

    @NotEmpty
    private String prodYear ="";

    @NotEmpty
    private String vin ="";

    @NotEmpty
    private String engine ="";

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProdYear() {
        return prodYear;
    }

    public void setProdYear(String prodYear) {
        this.prodYear = prodYear;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", prodYear='" + prodYear + '\'' +
                ", vin='" + vin + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
