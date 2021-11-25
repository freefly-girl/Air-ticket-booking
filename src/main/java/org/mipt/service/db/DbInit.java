package org.mipt.service.db;

import lombok.AllArgsConstructor;
import org.mipt.App;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.util.stream.Collectors;

@AllArgsConstructor
public class DbInit {
    final SimpleJdbcTemplate source;

    private String getSQL(String name) throws IOException {
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        App.class.getResourceAsStream(name),
                        StandardCharsets.UTF_8))) {
            return br.lines().collect(Collectors.joining("\n"));
        }
    }

    // используется в тестах
    public void create() throws SQLException, IOException {
        String sql = getSQL("dbcreate.sql");
        source.statement(stmt -> {
            stmt.execute(sql);
        });
    }
}
