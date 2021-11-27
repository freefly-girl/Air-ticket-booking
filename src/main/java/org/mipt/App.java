package org.mipt;

import org.mipt.service.db.DbInit;

import java.io.IOException;
import java.sql.SQLException;

public class App {
    private App() {
    }

    public static void main(String[] args) {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser(params[1]);
        dataSource.setPassword(params[2]);
        dataSource.setURL(params[0]);
        var adapter = new DbAdapter(dataSource);
        var initilaizer = new DbInit(adapter);
    }

}
