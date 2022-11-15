package com.epam.cruisecompany.dao.connection;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionPoolHolder {
    private static volatile DataSource dataSource;

    private static DataSource getDataSource() {
        if (isExistDataSource(dataSource)) {
            synchronized (ConnectionPoolHolder.class) {
                if (isExistDataSource(dataSource)) {
                    fillDataSource();
                }
            }
        }
        return dataSource;
    }

    private static boolean isExistDataSource(DataSource dataSource) {
        return dataSource == null;
    }

    private static void fillDataSource() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("dataBase");
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName(resourceBundle.getString("driver"));
        basicDataSource.setUrl(resourceBundle.getString("url"));
        basicDataSource.setUsername(resourceBundle.getString("user"));
        basicDataSource.setPassword(resourceBundle.getString("pass"));
        basicDataSource.setMinIdle(Integer.parseInt(resourceBundle.getString("min.idle")));
        basicDataSource.setMaxIdle(Integer.parseInt(resourceBundle.getString("max.idle")));
        basicDataSource.setMaxOpenPreparedStatements(Integer.parseInt(resourceBundle.getString("max.open.prepare.statements")));
        dataSource = basicDataSource;
    }


    public Connection getConnection() {
        try {
            return getDataSource().getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}