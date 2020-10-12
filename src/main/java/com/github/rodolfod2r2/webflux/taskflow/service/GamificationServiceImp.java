package com.github.rodolfod2r2.webflux.taskflow.service;

import com.github.rodolfod2r2.webflux.taskflow.document.Gamification;
import com.github.rodolfod2r2.webflux.taskflow.repository.GamificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class GamificationServiceImp implements GenericsInterfaceService<Gamification> {

    @Autowired
    GamificationRepository gamificationRepository;

    public Flux<Gamification> findAll() {
        return gamificationRepository.findAll();
    }

    public Mono<Gamification> findById(String id) {
        return gamificationRepository.findById(id);
    }

    public Mono<Gamification> save(Gamification gamification) {
        return gamificationRepository.save(gamification);
    }
}
