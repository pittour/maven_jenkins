package com.example.sqlite;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
    public static void bddConnexion(){
        System.out.println("Connexion à la bdd");
        String url = "JDBC:sqlite:resources:bdd.db";
        try {
            Class.forName("org.sqlite.JDBC");
            try(Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement();){
                System.out.println("Connexion réussie");
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }     
    }
}