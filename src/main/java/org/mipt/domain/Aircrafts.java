package org.mipt.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Aircrafts {
    @Id
    @Column(name = "aircraft_code")
    private String aircraftCode;
    @Column(name = "model")
    private String model;
    @Column(name = "range")
    private Integer range;
}
