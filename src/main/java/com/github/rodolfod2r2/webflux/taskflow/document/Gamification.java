package com.github.rodolfod2r2.webflux.taskflow.document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class Gamification {

    @Id
    private String id;
    private String name;
    private String description;
    private int points;
    private Archive archive;

}
