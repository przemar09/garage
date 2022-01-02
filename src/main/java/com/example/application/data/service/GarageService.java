package com.example.application.data.service;

import com.example.application.data.entity.Car;
import com.example.application.data.entity.History;
import com.example.application.data.repository.CarRepository;
import com.example.application.data.repository.HistoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GarageService {

    private CarRepository carRepository;
    private HistoryRepository historyRepository;

    public GarageService(CarRepository carRepository, HistoryRepository historyRepository) {
        this.carRepository = carRepository;
        this.historyRepository = historyRepository;

        Car car = new Car();
        History history = new History();
        car.setBrand("Audi");
        car.setModel("A3");
        car.setProdYear("2003");
        carRepository.save(car);
        history.setCar(car);
        history.setDescription("Wymiana turbiny");
        historyRepository.save(history);
    }

    public List<History> findAllHistories() {
        return historyRepository.findAll();
    }


    public void saveHistory(History history) {
        historyRepository.save(history);
    }
}
