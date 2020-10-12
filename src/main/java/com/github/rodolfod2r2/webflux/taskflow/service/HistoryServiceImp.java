package com.github.rodolfod2r2.webflux.taskflow.service;

import com.github.rodolfod2r2.webflux.taskflow.document.History;
import com.github.rodolfod2r2.webflux.taskflow.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class HistoryServiceImp implements GenericsInterfaceService<History> {

    @Autowired
    HistoryRepository historyRepository;

    public Flux<History> findAll() {
        return historyRepository.findAll();
    }

    public Mono<History> findById(String id) {
        return historyRepository.findById(id);
    }

    public Mono<History> save(History halo) {
        return historyRepository.save(halo);
    }

}
