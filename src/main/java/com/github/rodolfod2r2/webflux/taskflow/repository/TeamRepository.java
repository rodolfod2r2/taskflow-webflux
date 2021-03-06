package com.github.rodolfod2r2.webflux.taskflow.repository;

import com.github.rodolfod2r2.webflux.taskflow.document.Team;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface TeamRepository extends ReactiveMongoRepository<Team, String> {
}
