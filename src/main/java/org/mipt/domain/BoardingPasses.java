package org.mipt.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BoardingPasses {
    @Id
    @OneToOne
    @PrimaryKeyJoinColumn(name = "ticket_no")
    @PrimaryKeyJoinColumn(name = "flight_id")
    @Column(name = "ticket_no")
    private TicketFlights ticketNo;
    @Column(name = "flight_id")
    private Integer flightId;
    @Column(name = "boarding_no")
    private Integer boardingNo;
    @Column(name = "seat_no")
    private String seatNo;

}
