package com.github.rodolfod2r2.webflux.taskflow.service;

import com.github.rodolfod2r2.webflux.taskflow.document.Remark;
import com.github.rodolfod2r2.webflux.taskflow.repository.RemarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class RemarkServiceImp implements GenericsInterfaceService<Remark> {

    @Autowired
    RemarkRepository remarkRepository;

    public Flux<Remark> findAll() {
        return remarkRepository.findAll();
    }

    public Mono<Remark> findById(String id) {
        return remarkRepository.findById(id);
    }

    public Mono<Remark> save(Remark remark) {
        return remarkRepository.save(remark);
    }

}
