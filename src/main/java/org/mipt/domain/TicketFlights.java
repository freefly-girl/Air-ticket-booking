package org.mipt.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TicketFlights {
    @Id
    @Column(name = "ticket_no")
    private String ticketNo;
    @Id
    @ManyToOne
    @PrimaryKeyJoinColumn(name = "flight_id", referencedColumnName = "flight_id")
    @Column(name = "flight_id")
    private Flights flightId;
    @Column(name = "fare_conditions")
    private String fareConditions;
    @Column(name = "amount")
    private BigDecimal amount;
}
