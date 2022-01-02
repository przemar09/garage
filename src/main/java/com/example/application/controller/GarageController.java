package com.example.application.controller;


import com.example.application.data.entity.History;
import com.example.application.data.service.HistoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/garage")
public class GarageController {

    private HistoryService historyService;

    public GarageController(HistoryService historyService) {
        this.historyService = historyService;
    }

    @GetMapping()
    public List<History> getAllHistories(){
        return historyService.getAllHistories();
    }

    @PostMapping()
    public ResponseEntity<History> saveHistory(@RequestBody History history) {
        return new ResponseEntity<History>(historyService.addHistory(history), HttpStatus.CREATED);
    }

}
