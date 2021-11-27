package org.mipt.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Seats {
    @Id
    @ManyToOne
    @PrimaryKeyJoinColumn(name = "aircraft_code", referencedColumnName = "aircraft_code")
    @Column(name = "aircraft_code")
    private Aircrafts aircraftCode;
    @Id
    @Column(name = "seat_no")
    private String seatNo;
    @Column(name = "fare_conditions")
    private String fareConditions;

}
