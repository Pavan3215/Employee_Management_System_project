package employee.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {

    Connection connection;
    Statement statement;

    public conn() {
        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection("jdbc:h2:mem:employeemanagement;DB_CLOSE_DELAY=-1", "sa", "");
            statement = connection.createStatement();
            // Create table if not exists
            String createTable = "CREATE TABLE IF NOT EXISTS employee ("
                    + "empId VARCHAR(10) PRIMARY KEY, "
                    + "name VARCHAR(50), "
                    + "fname VARCHAR(50), "
                    + "dob VARCHAR(20), "
                    + "salary INT, "
                    + "address VARCHAR(100), "
                    + "phone BIGINT, "
                    + "email VARCHAR(50), "
                    + "education VARCHAR(50), "
                    + "designation VARCHAR(50), "
                    + "aadhar BIGINT"
                    + ")";
            statement.execute(createTable);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
