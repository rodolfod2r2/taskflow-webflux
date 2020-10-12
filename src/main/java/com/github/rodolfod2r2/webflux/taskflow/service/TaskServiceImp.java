package com.github.rodolfod2r2.webflux.taskflow.service;

import com.github.rodolfod2r2.webflux.taskflow.document.Task;
import com.github.rodolfod2r2.webflux.taskflow.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TaskServiceImp implements GenericsInterfaceService<Task> {

    @Autowired
    TaskRepository taskRepository;

    public Flux<Task> findAll() {
        return taskRepository.findAll();
    }

    public Mono<Task> findById(String id) {
        return taskRepository.findById(id);
    }

    public Mono<Task> save(Task task) {
        return taskRepository.save(task);
    }

}
