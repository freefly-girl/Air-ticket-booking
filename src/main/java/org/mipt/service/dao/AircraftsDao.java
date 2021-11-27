package org.mipt.service.dao;

import lombok.AllArgsConstructor;
import org.mipt.domain.Aircrafts;
import org.mipt.service.db.SimpleJdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
public class AircraftsDao {
    private final SimpleJdbcTemplate source;

    private Aircrafts createAircraft(ResultSet resultSet) throws SQLException {
        return new Aircrafts(resultSet.getString("aircraft_code"),
                resultSet.getString("model"),
                resultSet.getInt("range"));
    }

    public void saveAircrafts(Collection<Aircrafts> aircrafts) throws SQLException {
        source.preparedStatement("insert into aircrafts(aircraft_code, model, range) values (?, ?, ?)", insertAircrafts -> {
            for (Aircrafts aircraft : aircrafts) {
                insertAircrafts.setString(1, aircraft.getAircraftCode());
                insertAircrafts.setString(2, aircraft.getModel());
                insertAircrafts.setInt(3, aircraft.getRange());
                insertAircrafts.execute();
            }
        });
    }

    public Set<Aircrafts> getAircrafts() throws SQLException {
        return source.statement(stmt -> {
            Set<Aircrafts> result = new HashSet<>();
            ResultSet resultSet = stmt.executeQuery("select * from Aircrafts");
            while (resultSet.next()) {
                result.add(createAircraft(resultSet));
            }
            return result;
        });
    }
}
