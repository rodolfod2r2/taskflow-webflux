package com.github.rodolfod2r2.webflux.taskflow.repository;

import com.github.rodolfod2r2.webflux.taskflow.document.History;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface HistoryRepository extends ReactiveMongoRepository<History, String> {
}
