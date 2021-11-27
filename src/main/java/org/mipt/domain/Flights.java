package org.mipt.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Flights {
    @Id
    @Column(name = "flight_id")
    private Integer flightId;
    @Column(name = "flight_no")
    private String flightNo;
    @Column(name = "schedule_departure")
    private Timestamp scheduleDeparture;
    @Column(name = "schedule_arrival")
    private Timestamp scheduledArrival;
    @ManyToOne
    @PrimaryKeyJoinColumn(name = "airport_code", referencedColumnName = "airport_code")
    @Column(name = "departure_airport")
    private Airports departureAirport;
    @ManyToOne
    @PrimaryKeyJoinColumn(name = "airport_code", referencedColumnName = "airport_code")
    @Column(name = "actual_arrival")
    private Airports arrivalAirport;
    @Column(name = "status")
    private String status;
    @ManyToOne
    @JoinColumn(name = "aircraft_code", referencedColumnName = "aircraft_code") //todo
    @Column(name = "aircraft_code")
    private Aircrafts aircraftCode;
    @Column(name = "actual_departure")
    private Timestamp actualDeparture;
    @Column(name = "actual_arrival")
    private Timestamp actualArrival;
}
