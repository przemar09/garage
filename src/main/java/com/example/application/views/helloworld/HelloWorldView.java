package com.example.application.views.helloworld;

import com.example.application.data.entity.Car;
import com.example.application.data.entity.History;
import com.example.application.data.service.GarageService;
import com.example.application.views.MainLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Hello World")
@Route(value = "hello", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class HelloWorldView extends HorizontalLayout {
    Grid<History> historyGrid = new Grid<>(History.class);
    private GarageService garageService;

    public HelloWorldView(GarageService garageService) {
        this.garageService = garageService;

        setSizeFull();
        configureGrid();
        add(historyGrid);
        historyGrid.setItems(garageService.findAllHistories());
    }

    private void configureGrid() {
        historyGrid.setColumns("date","description");
        historyGrid.addColumn(car -> car.getCar().getBrand()).setHeader("Brand");
    }

}
