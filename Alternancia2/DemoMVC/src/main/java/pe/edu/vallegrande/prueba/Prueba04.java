package pe.edu.vallegrande.prueba;

import pe.edu.vallegrande.db.AccesoDB;

import java.sql.Connection;

public class Prueba04 {

    public static void main(String[] args) {
        try {
            Connection cn = AccesoDB.getConnection();
            System.out.println("Conexion ok.");
            cn.close();
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
