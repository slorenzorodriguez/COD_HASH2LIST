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


public class ClassList implements InterfaceList {

    ArrayList<String> miLista = new ArrayList();

    @Override
    public void putElement(String cadena) {
        miLista.add(cadena);
    }

    @Override
    public String getElement(int indice) {
        return miLista.get(indice);
    }

    @Override
    public int size() {
        return miLista.size();
    }
} 

