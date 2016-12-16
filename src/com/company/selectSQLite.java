package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by 46406163y on 12/12/16.
 */
public class selectSQLite {
    public static void main(String[] args)
    {
    extreuActors();
        extreuMovies();
    }

    public static void extreuActors(){
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:Films.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM ACTORES;" );
            while ( rs.next() ) {
                int id = rs.getInt("idAct");
                String  name = rs.getString("Nombre");
                System.out.println( "ID = " + id );
                System.out.println( "NAME = " + name );
            }
            rs.close();
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }

    public static void extreuMovies(){
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:Films.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM MOVIES;" );
            while ( rs.next() ) {
                int id = rs.getInt("idMovie");
                String  name = rs.getString("titulo");
                String fecha = rs.getString("fecha");
                System.out.println( "ID = " + id + " TITULO= " + name + " FECHA= " + fecha);
            }
            rs.close();
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }
    public static void extreuPersonatjes(){
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:Films.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM AXM;" );
            while ( rs.next() ) {
                int movie_id = rs.getInt("idMovie");
                int actor_id = rs.getInt("idActor");
                int cast_id = rs.getInt("cast_id");
                String  character = rs.getString("titulo");
                System.out.println( "ID PELICULA = " + movie_id + " ID ACTOR= " + actor_id + " ID CAST= " + cast_id + " PERSONATGE= " + character);
            }
            rs.close();
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }
}
