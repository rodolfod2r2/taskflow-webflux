package com.github.rodolfod2r2.webflux.taskflow.controller;

import com.github.rodolfod2r2.webflux.taskflow.document.Gamification;
import com.github.rodolfod2r2.webflux.taskflow.service.GamificationServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
public class GamificationController {

    @Autowired
    GamificationServiceImp gamificationServiceImp;

    @GetMapping(value = "/gamification")
    public Flux<Gamification> getAllGamification() {
        return gamificationServiceImp.findAll();
    }

    @GetMapping(value = "/gamification/{id}")
    public Mono<Gamification> getGamificationById(@PathVariable String id) {
        return gamificationServiceImp.findById(id);
    }

    @PostMapping(value = "/gamification")
    public Mono<Gamification> save(@RequestBody Gamification gamification) {
        return gamificationServiceImp.save(gamification);
    }

}
