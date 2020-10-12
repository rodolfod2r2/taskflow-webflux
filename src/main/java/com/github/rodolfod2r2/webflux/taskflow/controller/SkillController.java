package com.github.rodolfod2r2.webflux.taskflow.controller;

import com.github.rodolfod2r2.webflux.taskflow.document.Skill;
import com.github.rodolfod2r2.webflux.taskflow.service.SkillServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
public class SkillController {

    @Autowired
    SkillServiceImp skillServiceImp;

    @GetMapping(value = "/skill")
    public Flux<Skill> getAllSkill() {
        return skillServiceImp.findAll();
    }

    @GetMapping(value = "/skill/{id}")
    public Mono<Skill> getSkillById(@PathVariable String id) {
        return skillServiceImp.findById(id);
    }

    @PostMapping(value = "/skill")
    public Mono<Skill> save(@RequestBody Skill skill) {
        return skillServiceImp.save(skill);
    }

}
