/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.inter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author namaz
 */
public abstract class AbstractDAO {

    private Connection con;
    private Statement stmt;

    private final String dbAddress = "jdbc:mysql://localhost:3306/";
    private final String userPass = "?user=root&password=12345";
    private final String userName = "root";
    private final String password = "12345";
    private final String dbName = "inventory_manager";

    private final String createDbQuery = "CREATE DATABASE IF NOT EXISTS " + dbName + " CHARACTER SET utf8 COLLATE utf8_general_ci";

    private final String createBedQuery = "CREATE TABLE IF NOT EXISTS bed "
            + "(id INT NOT NULL AUTO_INCREMENT, "
            + " brand VARCHAR(70), "
            + " color VARCHAR(70), "
            + " material VARCHAR(70), "
            + " cost VARCHAR(70), "
            + " length VARCHAR(70), "
            + " width VARCHAR(70), "
            + " PRIMARY KEY ( id ))";//stmt.executeUpdate()

    private final String createBookshelfQuery = "CREATE TABLE IF NOT EXISTS bookshelf "
            + "(id INT NOT NULL AUTO_INCREMENT, "
            + " brand VARCHAR(70), "
            + " color VARCHAR(70), "
            + " material VARCHAR(70), "
            + " cost VARCHAR(70), "
            + " length VARCHAR(70), "
            + " height VARCHAR(70), "
            + " capacity VARCHAR(70), "
            + " PRIMARY KEY ( id ))";

    private final String createChairQuery = "CREATE TABLE IF NOT EXISTS chair "
            + "(id INT NOT NULL AUTO_INCREMENT, "
            + " brand VARCHAR(70), "
            + " color VARCHAR(70), "
            + " material VARCHAR(70), "
            + " cost VARCHAR(70), "
            + " length VARCHAR(70), "
            + " width VARCHAR(70), "
            + " height VARCHAR(70), "
            + " PRIMARY KEY ( id ))";

    private final String createDoorQuery = "CREATE TABLE IF NOT EXISTS door "
            + "(id INT NOT NULL AUTO_INCREMENT, "
            + " brand VARCHAR(70), "
            + " color VARCHAR(70), "
            + " material VARCHAR(70), "
            + " cost VARCHAR(70), "
            + " length VARCHAR(70), "
            + " width VARCHAR(70), "
            + " PRIMARY KEY ( id ))";

    private final String createDeskQuery = "CREATE TABLE IF NOT EXISTS desk "
            + "(id INT NOT NULL AUTO_INCREMENT, "
            + " brand VARCHAR(70), "
            + " color VARCHAR(70), "
            + " material VARCHAR(70), "
            + " cost VARCHAR(70), "
            + " length VARCHAR(70), "
            + " width VARCHAR(70), "
            + " PRIMARY KEY ( id ))";

    private final String createWardrobeQuery = "CREATE TABLE IF NOT EXISTS wardrobe "
            + "(id INT NOT NULL AUTO_INCREMENT, "
            + " brand VARCHAR(70), "
            + " color VARCHAR(70), "
            + " material VARCHAR(70), "
            + " cost VARCHAR(70), "
            + " length VARCHAR(70), "
            + " height VARCHAR(70), "
            + " capacity VARCHAR(70), "
            + " PRIMARY KEY ( id ))";

    public Connection connect() throws Exception {
        try {
            con = DriverManager.getConnection(dbAddress + dbName, userName, password);
        } catch (SQLException e) {
            Thread.sleep(1000);
            createDatabase();
            System.out.println("\nDatabase [inventory_manager] has been created! ");
            System.out.println("\nTable initialization has been started! ");
            Thread.sleep(2000);
            createTable(createBedQuery);
            createTable(createBookshelfQuery);
            createTable(createChairQuery);
            createTable(createDoorQuery);
            createTable(createDeskQuery);
            createTable(createWardrobeQuery);
            System.out.println("All tables has been initialized successfully!\n");
        } finally {
            return con;
        }
    }

    private void createDatabase() {
        try {
            con = DriverManager.getConnection(dbAddress + userPass);
            Statement s = con.createStatement();
            s.executeUpdate(createDbQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void createTable(String createTableQuery) {
        try {
            con = DriverManager.getConnection(dbAddress + dbName, userName, password);
            stmt = con.createStatement();
            stmt.executeUpdate(createTableQuery);
            System.out.println("Table Created");
        } catch (SQLException e) {
            System.out.println("An error has occurred on Table Creation");
        }
    }

    public String getCreateDbQuery() {
        return createDbQuery;
    }

    public String getCreateBedQuery() {
        return createBedQuery;
    }

    public String getCreateBookshelfQuery() {
        return createBookshelfQuery;
    }

    public String getCreateChairQuery() {
        return createChairQuery;
    }

    public String getCreateDoorQuery() {
        return createDoorQuery;
    }

    public String getCreateDeskQuery() {
        return createDeskQuery;
    }

    public String getCreateWardrobeQuery() {
        return createWardrobeQuery;
    }

    public String getDbName() {
        return dbName;
    }
}
