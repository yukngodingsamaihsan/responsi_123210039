/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOdatabuku;
import java.sql.*;
import java.util.*;
import koneksi.connector;
import model.*;
import DAOImplement.implementDAO;
import java.util.logging.Level;
import java.util.logging.Logger;


public class databukuDAO implements  implementDAO{
    Connection connection;
    final String select = "select * from dataperpus;";
    final String insert = "INSERT INTO dataperpus(judul,genre,penulis,penerbit,lokasi,stock) VALUES (? ? ? ? ? ?);";
    final String update = "update dataperpus set judul=? ,genre=? ,penulis=? ,penerbit=? ,lokasi=? ,stock=? where id=?;";
    final String delete = "delete from dataperpus where id=?";
    final String cari   = "select * from dataperpus where id=?"; 
    public databukuDAO(){
        connection=connector.connection();
    }
    

    @Override
    public void insert(databuku p) {
        PreparedStatement statement = null;
        try{
            connection.prepareStatement(insert,Statement.RETURN_GENERATED_KEYS);
            statement.setString(1,p.getJudul());
            statement.setString(2,p.getGenre());
            statement.setString(3,p.getPenulis());
            statement.setString(4,p.getPenerbit());
            statement.setString(5,p.getLokasi());
            statement.setInt(6,p.getStock());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while(rs.next()){
                p.setId(rs.getInt(1));
            }
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void update(databuku p) {
        PreparedStatement statement = null;
        try{
        connection.prepareStatement(update,Statement.RETURN_GENERATED_KEYS);
            statement.setString(1,p.getJudul());
            statement.setString(2,p.getGenre());
            statement.setString(3,p.getPenulis());
            statement.setString(4,p.getPenerbit());
            statement.setString(5,p.getLokasi());
            statement.setInt(6,p.getStock());
            statement.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        
    }

    @Override
    public void delete(int id) {
         PreparedStatement statement = null;
        try{
        statement = connection.prepareStatement(delete);
        statement.setInt(1, id);
        statement.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<databuku> getAll() {
       List<databuku> db = null;
       try{
       db = new ArrayList<databuku>();
       Statement st = connection.createStatement();
       ResultSet rs = st.executeQuery(select);
       while(rs.next()){
           databuku bk = new databuku();
           bk.setId(rs.getInt("id"));
           bk.setJudul(rs.getString("judul"));
           bk.setGenre(rs.getString("genre"));
           bk.setPenulis(rs.getString("penulis"));
           bk.setPenerbit(rs.getString("penerbit"));
           bk.setLokasi(rs.getString("lokasi"));
           bk.setStock(rs.getInt("stock"));
            }
       }catch(SQLException ex){
       Logger.getLogger(databukuDAO.class.getName()).log(Level.SEVERE,null,ex);
       }
       return db;
    }

    @Override
    public void cari(int id) {
        List<databuku> db = null;
       try{
       db = new ArrayList<databuku>();
       Statement st = connection.createStatement();
       ResultSet rs = st.executeQuery(select);
       while(rs.next()){
           databuku bk = new databuku();
           bk.setId(rs.getInt("id"));
           bk.setJudul(rs.getString("judul"));
           bk.setGenre(rs.getString("genre"));
           bk.setPenulis(rs.getString("penulis"));
           bk.setPenerbit(rs.getString("penerbit"));
           bk.setLokasi(rs.getString("lokasi"));
           bk.setStock(rs.getInt("stock"));
            }
       }catch(SQLException ex){
       Logger.getLogger(databukuDAO.class.getName()).log(Level.SEVERE,null,ex);
       }
    }
    
}
