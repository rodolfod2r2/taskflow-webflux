package com.github.rodolfod2r2.webflux.taskflow.controller;

import com.github.rodolfod2r2.webflux.taskflow.document.Task;
import com.github.rodolfod2r2.webflux.taskflow.service.TaskServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
public class TaskController {

    @Autowired
    TaskServiceImp taskServiceImp;

    @GetMapping(value = "/task")
    public Flux<Task> getAllTask() {
        return taskServiceImp.findAll();
    }

    @GetMapping(value = "/task/{id}")
    public Mono<Task> getTaskById(@PathVariable String id) {
        return taskServiceImp.findById(id);
    }

    @PostMapping(value = "/task")
    public Mono<Task> save(@RequestBody Task task) {
        return taskServiceImp.save(task);
    }

}
