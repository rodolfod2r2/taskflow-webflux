package com.github.rodolfod2r2.webflux.taskflow.repository;

import com.github.rodolfod2r2.webflux.taskflow.document.Remark;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface RemarkRepository extends ReactiveMongoRepository<Remark, String> {
}
