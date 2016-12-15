package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by 46406163y on 12/12/16.
 */
public class createSQLite {

    public static void main(String[] args) {
        {
            Connection c = null;
            Statement stmt = null;
            try {
                Class.forName("org.sqlite.JDBC");
                c = DriverManager.getConnection("jdbc:sqlite:Films1.db");
                System.out.println("Opened database successfully");

                stmt = c.createStatement();
                String sql = "CREATE TABLE MOVIES " +
                        "(idMovie            INT     PRIMARY KEY     NOT NULL," +
                        " titulo        TEXT                    NOT NULL, " +
                        " fecha         DATE                    NOT NULL)";
                stmt.executeUpdate(sql);
                sql = "CREATE TABLE ACTORES " +
                        "(idAct              INT       PRIMARY KEY    NOT NULL," +
                        " Nombre          CHAR(50)                 NOT NULL )";
                stmt.executeUpdate(sql);
                sql = "CREATE TABLE AXM " +
                        "(movieId         INT                           NOT NULL," +
                        "idActor          INT                           NOT NULL," +
                        "Actor            TEXT                           NOT NULL," +
                        " Personaje       CHAR(50)          PRIMARY KEY NOT NULL)";
                stmt.executeUpdate(sql);
                stmt.close();
                c.close();
            } catch ( Exception e ) {
                System.err.println( e.getClass().getName() + ": " + e.getMessage() );
                System.exit(0);
            }
            System.out.println("Table created successfully");
        }

    }


}
