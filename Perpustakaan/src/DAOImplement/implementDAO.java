/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOImplement;

import java.util.List;
import model.*;

public interface implementDAO {
    public void insert (databuku p);
    public void update (databuku p);
    public void delete (int id);
    public void cari (int id);
    public List<databuku> getAll();

    
}
