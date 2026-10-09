package com.gagu.bookmyshow.models;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel{
    private String name;
    private List<String> actors;
    private List<String> languages;
    private Integer rating;
    @Enumerated(EnumType.STRING)
    @ElementCollection
    private List<Feature> features;
}
