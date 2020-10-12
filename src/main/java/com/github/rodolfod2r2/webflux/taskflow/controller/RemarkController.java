package com.github.rodolfod2r2.webflux.taskflow.controller;

import com.github.rodolfod2r2.webflux.taskflow.document.Remark;
import com.github.rodolfod2r2.webflux.taskflow.service.RemarkServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
public class RemarkController {

    @Autowired
    RemarkServiceImp remarkServiceImp;

    @GetMapping(value = "/remark")
    public Flux<Remark> getAllRemark() {
        return remarkServiceImp.findAll();
    }

    @GetMapping(value = "/remark/{id}")
    public Mono<Remark> getRemarkById(@PathVariable String id) {
        return remarkServiceImp.findById(id);
    }

    @PostMapping(value = "/remark")
    public Mono<Remark> save(@RequestBody Remark remark) {
        return remarkServiceImp.save(remark);
    }

}
