package com.github.rodolfod2r2.webflux.taskflow.repository;

import com.github.rodolfod2r2.webflux.taskflow.document.Skill;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface SkillRepository extends ReactiveMongoRepository<Skill, String> {
}
