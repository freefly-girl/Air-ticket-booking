package org.mipt.domain;

import lombok.Data;
import org.json.JSONObject;

@Data
public class Aircrafts {
    private final String aircraftCode;
    private final JSONObject model;
    private final int range;
}
