/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import java.sql.DriverManager;

/**
 *
 * @author ASUS
 */
public class koneksi {
    private static java.sql.Connection koneksi;
    
    public static java.sql.Connection getkoneksi(){
        if (koneksi == null){
            try{
                String url = "jdbc:mysql://localhost:3306/siresta";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi Berhasil");
            }catch (Exception e){
                System.out.println("Error");
            }
        }
        return koneksi;
    }
    
    public static void main(String args[]){
        getkoneksi();
}
}