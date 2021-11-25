package org.mipt.domain;

import lombok.Data;

@Data
public class TicketFlights {
    private final String ticket_no;
    private final int flight_id;
    private final String fare_conditions;
    private final float amount;
}
