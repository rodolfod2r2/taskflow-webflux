package com.github.rodolfod2r2.webflux.taskflow.service;

import com.github.rodolfod2r2.webflux.taskflow.document.Family;
import com.github.rodolfod2r2.webflux.taskflow.repository.FamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class FamilyServiceImp implements GenericsInterfaceService<Family> {

    @Autowired
    FamilyRepository familyRepository;

    public Flux<Family> findAll() {
        return familyRepository.findAll();
    }

    public Mono<Family> findById(String id) {
        return familyRepository.findById(id);
    }

    public Mono<Family> save(Family family) {
        return familyRepository.save(family);
    }
}
