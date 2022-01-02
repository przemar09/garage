package com.example.application.data.service;

import com.example.application.data.entity.History;
import com.example.application.data.repository.HistoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HistoryService implements IHistoryService{

    private HistoryRepository historyRepository;

    public HistoryService(HistoryRepository historyRepository) {
        this.historyRepository = historyRepository;
    }

    @Override
    public History addHistory(History history) {
        return historyRepository.save(history);
    }

    @Override
    public List<History> getAllHistories() {
        return historyRepository.findAll();
    }

    @Override
    public History getHistoryById(int id) {
        Optional<History> history = historyRepository.findById(id);
        return history.get();
    }

    @Override
    public History updateHistory(History history, int id) {
        return null;
    }

    @Override
    public void deleteHistory(int id) {

    }

}
