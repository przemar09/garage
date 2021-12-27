package com.example.application.data.entity;

import com.sun.istack.Nullable;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class History extends AbstractEntity{

    @OneToOne
    private Car car;

    @NotEmpty
    private String description="";

    private Date date;

    private String mileage="";

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "History{" +
                "car=" + car +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", mileage='" + mileage + '\'' +
                '}';
    }
}
