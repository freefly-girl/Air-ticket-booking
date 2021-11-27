package org.mipt.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Bookings {
    @Id
    @Column(name = "book_ref")
    private String bookRef;
    @Column(name = "book_date")
    private Timestamp bookDate;
    @Column(name = "total_amount")
    private BigDecimal totalAmount;
}
