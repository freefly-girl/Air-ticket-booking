package org.mipt.domain;

import lombok.Data;

@Data
public class Bookings {
    private final String book_ref;
    // TODO: 25.11.2021 TIMESTAMPTZ
//    private final book_date;
    private final float total_amount;
}
