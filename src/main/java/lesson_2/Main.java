package lesson_2;

import java.sql.*;

public class Main {
    private static Connection connection;
    private static Statement stmt;
    private static PreparedStatement psInsert;

    public static void connect() throws Exception {
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:main.db");
        stmt = connection.createStatement();
    }

    public static void disconnect() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 1. Создать CRUD операции,

    // 1 метод создания таблицы
    private static void createTable() throws SQLException {

        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS newTable (\n" +
                "    id    INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "    column1  TEXT,\n" +
                "    column2 TEXT,\n" +
                "    column3 INTEGER\n" +
                ");");
    }


    // 2 метод для добавления записи
    private static void addTable() throws SQLException {
        stmt.executeUpdate("INSERT INTO newTable (column1,column2,column3) \n" +
                "VALUES ('стробец1','столбец2', '3');");
    }


    // 3 метод для получения записи
    private static void getTableLine(int id) throws SQLException {
        ResultSet rs = stmt.executeQuery("SELECT id, column1, column2, column3 AS ID FROM newTable WHERE ID LIKE (" + id + ");");
           while (rs.next()) {
               System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
            }
    }


    // 4 метод для удаления записи
    private static void delTableLine(int id) throws SQLException {
        stmt.executeUpdate("DELETE FROM newTable WHERE id = " + id + ";");
    }


    // 5 удаление таблицы
    private static void dropTable(String table_name) throws SQLException {
        stmt.executeUpdate("DROP TABLE '" + table_name + "';");
    }




    public static void main(String[] args) {
        try {
            connect();
            //createTable();
            //dropTable("newTable");
//            for (int i = 0; i < 10; i++) {
//                addTable();
//            }
            //getTableLine(2);
            delTableLine(1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            disconnect();
        }
    }


}
