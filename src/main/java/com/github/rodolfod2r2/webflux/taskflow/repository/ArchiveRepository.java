package com.github.rodolfod2r2.webflux.taskflow.repository;

import com.github.rodolfod2r2.webflux.taskflow.document.Archive;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ArchiveRepository extends ReactiveMongoRepository<Archive, String> {
}
