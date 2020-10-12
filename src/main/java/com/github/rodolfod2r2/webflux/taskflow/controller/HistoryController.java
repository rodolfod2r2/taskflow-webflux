package com.github.rodolfod2r2.webflux.taskflow.controller;

import com.github.rodolfod2r2.webflux.taskflow.document.History;
import com.github.rodolfod2r2.webflux.taskflow.service.HistoryServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
public class HistoryController {

    @Autowired
    HistoryServiceImp historyServiceImp;

    @GetMapping(value = "/history")
    public Flux<History> getAllHistory() {
        return historyServiceImp.findAll();
    }

    @GetMapping(value = "/history/{id}")
    public Mono<History> getHistoryById(@PathVariable String id) {
        return historyServiceImp.findById(id);
    }

    @PostMapping(value = "/history")
    public Mono<History> save(@RequestBody History history) {
        return historyServiceImp.save(history);
    }

}
