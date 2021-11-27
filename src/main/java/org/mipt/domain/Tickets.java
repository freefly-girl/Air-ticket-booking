package org.mipt.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tickets {
    @Id
    @Column(name = "ticket_no")
    private String ticketNo;
    @ManyToOne
    @PrimaryKeyJoinColumn(name = "book_ref", referencedColumnName = "book_ref")
    @Column(name = "book_ref")
    private Bookings bookRef;
    @Column(name = "passenger_id")
    private String passengerId;
    @Column(name = "passenger_name")
    private String passengerName;
    @Column(name = "contact_data")
    private String contactData;

}
