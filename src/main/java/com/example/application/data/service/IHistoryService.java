package com.example.application.data.service;

import com.example.application.data.entity.History;

import java.util.List;

public interface IHistoryService {
    History addHistory(History history);
    List<History> getAllHistories();
    History getHistoryById(int id);
    History updateHistory(History history, int id);
    void deleteHistory(int id);
}
