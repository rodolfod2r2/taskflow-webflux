package com.github.rodolfod2r2.webflux.taskflow.controller;

import com.github.rodolfod2r2.webflux.taskflow.document.Team;
import com.github.rodolfod2r2.webflux.taskflow.service.TeamServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
public class TeamController {

    @Autowired
    TeamServiceImp teamServiceImp;

    @GetMapping(value = "/team")
    public Flux<Team> getAllTeam() {
        return teamServiceImp.findAll();
    }

    @GetMapping(value = "/team/{id}")
    public Mono<Team> getTeamById(@PathVariable String id) {
        return teamServiceImp.findById(id);
    }

    @PostMapping(value = "/team")
    public Mono<Team> save(@RequestBody Team team) {
        return teamServiceImp.save(team);
    }

}
