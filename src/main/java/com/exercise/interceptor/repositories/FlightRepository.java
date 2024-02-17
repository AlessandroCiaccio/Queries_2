package com.exercise.interceptor.repositories;

import com.exercise.interceptor.entities.Flight;
import com.exercise.interceptor.entities.FlightStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    @Query("select f from Flight f order by fromAirport ASC")
    List<Flight> findAllByOrderByFromAirportAsc(PageRequest pageRequest);

    @Query("select f from Flight f where f.status = ONTIME")
    List<Flight> findByStatusOnTime(FlightStatus ONTIME);

    @Query
    List<Flight> findByStatus(FlightStatus p);
}
