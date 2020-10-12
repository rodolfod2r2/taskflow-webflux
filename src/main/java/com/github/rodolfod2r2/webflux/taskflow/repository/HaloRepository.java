package com.github.rodolfod2r2.webflux.taskflow.repository;

import com.github.rodolfod2r2.webflux.taskflow.document.Halo;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface HaloRepository extends ReactiveMongoRepository<Halo, String> {
}
