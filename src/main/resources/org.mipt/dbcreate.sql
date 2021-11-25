/*
 TODO: В каком формате записываются названия столбцов и таблиц (camelCase?)
 */

create table aircrafts (
    aircraft_code CHAR(3) not null primary key,
    model         JSONB   not null,
    range         INT     not null,
    foreign key (aircraft_code) references seats(aircraft_code)
);

create table airports (
    airport_code CHAR(3) not null primary key,
    airport_name JSONB   not null,
    city         JSONB   not null,
    coordinates  POINT   not null,
    timezone     TEXT    not null
);

create table boarding_passes (
    ticket_no   CHAR(13)   not null primary key,
    flight_id   INT        not null,
    boarding_no INT        not null,
    seat_no     VARCHAR(4) not null
);

create table bookings (
    book_ref     CHAR(6)       not null primary key,
    book_date    TIMESTAMP WITH TIME ZONE   not null,
    total_amount NUMERIC(10,2) not null,
    foreign key (book_ref) references tickets(book_ref)
);

create table flights (
    flight_id           INT         not null,
    flight_no           CHAR(6)     not null,
    scheduled_departure TIMESTAMP WITH TIME ZONE not null,
    scheduled_arrival   TIMESTAMP WITH TIME ZONE not null,
    departure_airport   CHAR(3)     not null,
    arrival_airport     CHAR(3)     not null,
    status              VARCHAR(20) not null,
    aircraft_code       CHAR(3)     not null,
    actual_departure    TIMESTAMP WITH TIME ZONE,
    actual_arrival      TIMESTAMP WITH TIME ZONE,
    primary key (flight_no, scheduled_departure),
    foreign key (flight_id ) references ticket_flights(flight_id),
    foreign key (aircraft_code ) references aircrafts(aircraft_code)
);

create table seats (
    aircraft_code   CHAR(3)     not null primary key,
    seat_no         VARCHAR(4)  not null primary key,
    fare_conditions VARCHAR(10) not null
);

create table ticket_flights (
    ticket_no       CHAR(13)      not null,
    flight_id       INTEGER       not null,
    fare_conditions VARCHAR(10)   not null,
    amount          NUMERIC(10,2) not null,
    primary key (ticket_no, flight_id),
    foreign key (ticket_no) references boarding_passes(ticket_no),
    foreign key (flight_id) references boarding_passes(flight_id)
);

create table tickets (
    ticket_no      CHAR(13)    not null primary key,
    book_ref       CHAR(6)     not null,
    passenger_id   VARCHAR(20) not null,
    passenger_name TEXT        not null,
    contact_data   JSONB
);
