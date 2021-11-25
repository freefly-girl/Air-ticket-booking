package org.mipt.domain;

import lombok.Data;
import org.postgresql.util.PGTimestamp;

import java.sql.Timestamp;
import java.util.TimeZone;

@Data
public class Flights {
    private final int flight_id;
    private final String flight_no;
    // TODO: 25.11.2021 TIMESTAMPTZ
//    private final Timestamp scheduled_departure;
//    private final scheduled_arrival;
    private final String departure_airport;
    private final String arrival_airport;
    private final String status; // todo: скорее всего нужно создать отдельный класс, который будет хранить возможные значения Статуса
    private final String aircraft_code;
    // TODO: 25.11.2021 TIMESTAMPTZ
//    private final actual_departure;
//    private final actual_arrival;
}
