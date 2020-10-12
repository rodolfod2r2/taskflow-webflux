package com.github.rodolfod2r2.webflux.taskflow.service;

import com.github.rodolfod2r2.webflux.taskflow.document.Project;
import com.github.rodolfod2r2.webflux.taskflow.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProjectServiceImp implements GenericsInterfaceService<Project> {

    @Autowired
    ProjectRepository projectRepository;

    public Flux<Project> findAll() {
        return projectRepository.findAll();
    }

    public Mono<Project> findById(String id) {
        return projectRepository.findById(id);
    }

    public Mono<Project> save(Project project) {
        return projectRepository.save(project);
    }

}
