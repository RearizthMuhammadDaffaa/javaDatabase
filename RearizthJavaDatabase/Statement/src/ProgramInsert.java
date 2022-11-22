/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author user
 */
public class ProgramInsert {
    public static void main(String[] args) {
        Connection koneksi = KoneksiDatabase.getkoneksi();
        Statement statement = null;
            try{
                statement = koneksi.createStatement();
                System.out.println("Statement berhasil dibuat");
                String url = "INSERT INTO barang(kode_barang,nama_barang,jumlah,harga)VALUES('B003,'BUKU TULIS',15,2000)";
                statement.executeUpdate(url);
            }
            catch(SQLException ex){
                System.out.println("Statement gagal dibuat");
                System.out.println("Pesan : "+ex.getMessage());
              
            }
            finally{
                if(statement != null){
                    try{
                        statement.close();
                        System.out.println("Statement Berhasil ditutup");
                        
                    }
                    catch(SQLException ex){
                        System.out.println("Statement gagal ditutup");
                        System.out.println("Pesan : "+ex.getMessage());
                    }

            }
        
        
    }
    }
    }
