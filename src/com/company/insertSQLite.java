package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 * Created by 46406163y on 12/12/16.
 */
public class insertSQLite {

    public static void listaMovies(String ORIGINAL_TITLE, int movie_id, String release_date) {

        Connection c = null;
        Statement stmt = null;
        try {

            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:Films.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();

            String sql = "INSERT INTO MOVIES (id, titulo, fecha) " +
                    "VALUES" + "(?, ?, ?);";

            PreparedStatement preparedstament = c.prepareStatement(sql);
            preparedstament.setInt(1, movie_id);
            preparedstament.setString(2, ORIGINAL_TITLE);
            preparedstament.setString(3, release_date);

            preparedstament.executeUpdate();

            stmt.close();
            c.commit();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Records created successfully");
    }
    public static void listaActores(Object id, Object name, Object character) {

        Connection c = null;
        Statement stmt = null;
        try {

            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:Films.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();

            String sql = "INSERT INTO MOVIES (id, Nombre, Personaje) " +
                    "VALUES" + "(?, ?, ?);";

            PreparedStatement preparedstament = c.prepareStatement(sql);
            preparedstament.setInt(1, (Integer) id);
            preparedstament.setString(2, (String) name);
            preparedstament.setString(3, (String) character);

            preparedstament.executeUpdate();

            stmt.close();
            c.commit();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Records created successfully");
    }


}