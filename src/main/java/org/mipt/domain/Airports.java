package org.mipt.domain;

import lombok.Data;
import org.json.JSONObject;

@Data
public class Airports {
    private final String airportCode;
    private final JSONObject city;
    private final JSONObject airportName;
    // todo: POINT, TEXT
//    private final coordinates;
//    private final timezone; // text
}
