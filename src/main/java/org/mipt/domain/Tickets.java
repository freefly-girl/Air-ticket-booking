package org.mipt.domain;

import lombok.Data;
import org.json.JSONObject;

@Data
public class Tickets {
    private final String ticket_no;
    private final String book_ref;
    private final String passenger_id;
    private final String passenger_name;
    private final JSONObject contact_data;
}
