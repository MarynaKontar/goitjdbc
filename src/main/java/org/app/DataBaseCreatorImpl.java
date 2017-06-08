package org.app;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by User on 25.05.2017.
 *
 * 1.DRIVER.JAR in clathpath (maven dependency)
 * 2. Register driver in program (class for name or DriverManager.registerDriver
 * 3.)
 */
public class DataBaseCreatorImpl implements DataBaseCreator {

    static {
        try {
            DriverManager.registerDriver(new Driver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void createSchema() {

    }

    @Override
    public void createTable() {

    }
private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/persons?useSSL=false", "root", "123581321lL");
}


}
