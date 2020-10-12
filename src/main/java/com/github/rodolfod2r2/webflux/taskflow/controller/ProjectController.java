package com.github.rodolfod2r2.webflux.taskflow.controller;

import com.github.rodolfod2r2.webflux.taskflow.document.Project;
import com.github.rodolfod2r2.webflux.taskflow.service.ProjectServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
public class ProjectController {

    @Autowired
    ProjectServiceImp projectServiceImp;

    @GetMapping(value = "/project")
    public Flux<Project> getAllProject() {
        return projectServiceImp.findAll();
    }

    @GetMapping(value = "/project/{id}")
    public Mono<Project> getProjectById(@PathVariable String id) {
        return projectServiceImp.findById(id);
    }

    @PostMapping(value = "/project")
    public Mono<Project> save(@RequestBody Project project) {
        return projectServiceImp.save(project);
    }

}
