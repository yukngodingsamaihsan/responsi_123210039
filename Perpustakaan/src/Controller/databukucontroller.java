/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.util.List;
import DAOdatabuku.databukuDAO;
import DAOImplement.implementDAO;
import model.*;
import view.MainView;
/**
 *
 * @author PC PRAKTIKUM
 */
public class databukucontroller {
    MainView frame;
    implementDAO implbuku;
    List<databuku>db;
    private Object integer;
    
    public databukucontroller(MainView frame){
        this.frame = frame;
        implbuku = new databukuDAO();
        db = implbuku.getAll();
    }
    
    public void isitabel(){
        db = implbuku.getAll();
        modeltabel mp = new modeltabel(db);
        
    }
    
    public void insert(){
        databuku db = new databuku();
        db.setJudul(frame.getJTxtjudul().getText());
        db.setGenre(frame.getJTxtgenre().getText());
        db.setPenulis(frame.getJTxtpenulis().getText());
        db.setPenerbit(frame.getJTxtpenerbit().getText());
        db.setLokasi(frame.getJTxtlokasi().getText());
    }
    
    public void update(){
        databuku db = new databuku();
        db.setJudul(frame.getJTxtjudul().getText());
        db.setGenre(frame.getJTxtgenre().getText());
        db.setPenulis(frame.getJTxtpenulis().getText());
        db.setPenerbit(frame.getJTxtpenerbit().getText());
        db.setLokasi(frame.getJTxtlokasi().getText());
    }
    
    public void delete(){
      
    }
    
    public void cari (){
        databuku db = new databuku();
        db.setJudul(frame.getJTxtjudul().getText());
        db.setGenre(frame.getJTxtgenre().getText());
        db.setPenulis(frame.getJTxtpenulis().getText());
        db.setPenerbit(frame.getJTxtpenerbit().getText());
        db.setLokasi(frame.getJTxtlokasi().getText());

    }
    
    
}

