package com.github.rodolfod2r2.webflux.taskflow.repository;

import com.github.rodolfod2r2.webflux.taskflow.document.Family;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface FamilyRepository extends ReactiveMongoRepository<Family, String> {
}
