package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    private static ConnectDB instance;
    private final Connection connection;
    private ConnectDB() throws ClassNotFoundException, SQLException {
        Class.forName("org.mariadb.jdbc.Driver");
        String url = "jdbc:mariadb://localhost:3306/mydb";
        connection = DriverManager.getConnection(url, "root", "sapassword");
    }

    public static ConnectDB getInstance() throws SQLException, ClassNotFoundException {
        if (instance == null)
            instance = new ConnectDB();
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
    public void closeConnection() throws SQLException {
        connection.close();
    }
}
