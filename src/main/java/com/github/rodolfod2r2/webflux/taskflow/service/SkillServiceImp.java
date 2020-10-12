package com.github.rodolfod2r2.webflux.taskflow.service;

import com.github.rodolfod2r2.webflux.taskflow.document.Skill;
import com.github.rodolfod2r2.webflux.taskflow.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class SkillServiceImp implements GenericsInterfaceService<Skill> {

    @Autowired
    SkillRepository skillRepository;

    public Flux<Skill> findAll() {
        return skillRepository.findAll();
    }

    public Mono<Skill> findById(String id) {
        return skillRepository.findById(id);
    }

    public Mono<Skill> save(Skill skill) {
        return skillRepository.save(skill);
    }

}
