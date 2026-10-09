package com.gagu.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Booking extends BaseModel {
    //Booking M : 1 User
    @ManyToOne
    private User user;
    //Booking M : 1 Show
    @ManyToOne
    private Show show;
    private Double amount;
    @OneToMany(mappedBy = "booking")
    private List<Payment> payment;
    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;
    //Booking  1:M  Showseat
    @OneToMany(mappedBy = "booking")
    private List<ShowSeat> showSeats;
}
