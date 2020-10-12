package com.github.rodolfod2r2.webflux.taskflow.repository;

import com.github.rodolfod2r2.webflux.taskflow.document.Kind;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface KindRepository extends ReactiveMongoRepository<Kind, String> {
}
