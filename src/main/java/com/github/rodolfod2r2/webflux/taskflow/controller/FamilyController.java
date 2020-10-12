package com.github.rodolfod2r2.webflux.taskflow.controller;

import com.github.rodolfod2r2.webflux.taskflow.document.Family;
import com.github.rodolfod2r2.webflux.taskflow.service.FamilyServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
public class FamilyController {

    @Autowired
    FamilyServiceImp familyServiceImp;

    @GetMapping(value = "/family")
    public Flux<Family> getAllFamily() {
        return familyServiceImp.findAll();
    }

    @GetMapping(value = "/family/{id}")
    public Mono<Family> getFamilyById(@PathVariable String id) {
        return familyServiceImp.findById(id);
    }

    @PostMapping(value = "/family")
    public Mono<Family> save(@RequestBody Family family) {
        return familyServiceImp.save(family);
    }

}
