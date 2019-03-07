/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod_hashtolist;

import java.util.ArrayList;

/**
 *
 * @author slorenzorodriguez
 */
public interface InterfaceList {
    
    ArrayList<String> miLista = new ArrayList<>();

    public void putElement(String cadena);

    public String getElement(int indice);
    
    public int size();

}

