package com.github.rodolfod2r2.webflux.taskflow.service;

import com.github.rodolfod2r2.webflux.taskflow.document.Kind;
import com.github.rodolfod2r2.webflux.taskflow.repository.KindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class KindServiceImp implements GenericsInterfaceService<Kind> {

    @Autowired
    KindRepository kindRepository;

    public Flux<Kind> findAll() {
        return kindRepository.findAll();
    }

    public Mono<Kind> findById(String id) {
        return kindRepository.findById(id);
    }

    public Mono<Kind> save(Kind kind) {
        return kindRepository.save(kind);
    }

}
