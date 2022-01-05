package com.example.application.data;

import com.example.application.data.entity.Car;
import com.example.application.data.entity.History;
import com.example.application.data.repository.CarRepository;
import com.example.application.data.service.GarageService;
import com.example.application.data.service.HistoryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DataLoader implements CommandLineRunner {

    private HistoryService historyService;
    private CarRepository carRepository;
    private GarageService garageService;

    public DataLoader(HistoryService historyService, CarRepository carRepository, GarageService garageService) {
        this.historyService = historyService;
        this.carRepository = carRepository;
        this.garageService = garageService;
    }

    @Override
    public void run(String... args) throws Exception {
        Car car = new Car("Audi", "A3", "103", "WBA23", "BKD");
        carRepository.save(car);
        History history = new History(car, "Czyszczenie EGR", new Date(121, 0, 03), "352 000");
        historyService.addHistory(history);
        history = new History(car, "Wymiana klocków hamulcowych", new Date(121, 0, 05), "360 000");
        garageService.saveHistory(history);
        car = new Car("Volkswagen", "Golf 4", "103", "WBN234", "AXR");
        carRepository.save(car);
        history = new History(car, "Wymiana osłon przegubów", new Date(121, 0, 04), "230 000");
        garageService.saveHistory(history);

    }
}
