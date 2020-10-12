package com.github.rodolfod2r2.webflux.taskflow.repository;

import com.github.rodolfod2r2.webflux.taskflow.document.Gamification;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface GamificationRepository extends ReactiveMongoRepository<Gamification, String> {
}
