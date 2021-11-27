package org.mipt.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Airports {
    @Id
    @PrimaryKeyJoinColumn(name = "airport_name", referencedColumnName = "ticket_no")
    @PrimaryKeyJoinColumn(name = "flight_id", referencedColumnName = "flight_id")
    @Column(name = "airport_code")
    private String airportCode;
    @Column(name = "airport_name")
    private String airportName;
    @Column(name = "city")
    private String city;
    @Column(name = "coordinates")
    private String coordinates;
    @Column(name = "timezone")
    private String timezone;

}
