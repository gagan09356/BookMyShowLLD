package com.gagu.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Seat extends BaseModel{
    private String number;
    //seat m:1 seatType
    @ManyToOne
    private SeatType seatType;
    @Column(name="seat_row")
    private Integer row;
    @Column(name="seat_col")
    private Integer column;
    @ManyToOne
    private Screen screen;
    @Enumerated(EnumType.STRING)
    private SeatStatus seatStatus;
}
