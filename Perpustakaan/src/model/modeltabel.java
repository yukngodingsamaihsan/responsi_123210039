/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import javax.swing.table.AbstractTableModel;
import java.util.List;
/**
 *
 * @author PC PRAKTIKUM
 */
public class modeltabel {
    List<databuku> db;
    public modeltabel(List<databuku>db){
        this.db=db;
    }
    

    public int getRowCount(){
       return db.size();
    } 
    public int getColumnCount(){
       return 7;
    }
    public String getColumnName(int column){
        switch(column){
            case 0 : return "ID";
            case 1 : return "Judul";
            case 2 : return "Genre";
            case 3 : return "Penulis";
            case 4 : return "Penerbit";
            case 5 : return "Lokasi";
            case 6 : return "Stock";
            default : return null;
            
        }
    }
    
    
}

