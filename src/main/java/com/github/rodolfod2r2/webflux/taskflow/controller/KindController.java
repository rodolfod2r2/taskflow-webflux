package com.github.rodolfod2r2.webflux.taskflow.controller;

import com.github.rodolfod2r2.webflux.taskflow.document.Kind;
import com.github.rodolfod2r2.webflux.taskflow.service.KindServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
public class KindController {

    @Autowired
    KindServiceImp kindServiceImp;

    @GetMapping(value = "/kind")
    public Flux<Kind> getAllKind() {
        return kindServiceImp.findAll();
    }

    @GetMapping(value = "/kind/{id}")
    public Mono<Kind> getKindById(@PathVariable String id) {
        return kindServiceImp.findById(id);
    }

    @PostMapping(value = "/kind")
    public Mono<Kind> save(@RequestBody Kind kind) {
        return kindServiceImp.save(kind);
    }

}
