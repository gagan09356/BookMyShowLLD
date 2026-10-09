package com.gagu.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Screen extends BaseModel {
    private String name;
    @OneToMany(mappedBy = "screen")
    private List<Seat> seats;
    @OneToMany(mappedBy = "screen")
    private List<Show> shows;
    @Enumerated(EnumType.STRING)
    @ElementCollection
    private List<Feature> features;
}
