package com.github.rodolfod2r2.webflux.taskflow.repository;

import com.github.rodolfod2r2.webflux.taskflow.document.Project;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProjectRepository extends ReactiveMongoRepository<Project, String> {
}
