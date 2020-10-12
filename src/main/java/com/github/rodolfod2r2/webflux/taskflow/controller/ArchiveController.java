package com.github.rodolfod2r2.webflux.taskflow.controller;

import com.github.rodolfod2r2.webflux.taskflow.document.Archive;
import com.github.rodolfod2r2.webflux.taskflow.service.ArchiveServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
public class ArchiveController {

    @Autowired
    ArchiveServiceImp archiveServiceImp;

    @GetMapping(value = "/archive")
    public Flux<Archive> getAllArchive() {
        return archiveServiceImp.findAll();
    }

    @GetMapping(value = "/archive/{id}")
    public Mono<Archive> getArchiveById(@PathVariable String id) {
        return archiveServiceImp.findById(id);
    }

    @PostMapping(value = "/archive")
    public Mono<Archive> save(@RequestBody Archive archive) {
        return archiveServiceImp.save(archive);
    }

}
