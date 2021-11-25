package org.mipt.domain;

import lombok.Data;

@Data
public class Seats {
    private final String aircraft_code;
    private final String seat_no;
    private final String fare_conditions; // todo: можно создать отдельный класс для обозначения Класса обслуживания
}
