package com.exercise.interceptor.entities;

import jakarta.persistence.*;
import lombok.*;

@Table
@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    private String fromAirport;
    private String toAirport;
    private FlightStatus status;
}

