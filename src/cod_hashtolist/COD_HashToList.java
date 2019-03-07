/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod_hashtolist;

import java.util.Iterator;

/**
 *
 * @author slorenzorodriguez
 */
public class COD_HashToList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClassHash ch = new ClassHash();
        ch.putValue("sergio");
        ch.putValue("david");
        ch.putValue("jesus");


        ClassList cl = new ClassList();
        cl.putElement("lorenzo");
        cl.putElement("otero");
        cl.putElement("vazquez");


        //MostrarClassList.mostrar(cl);

        OutputList.mostrar(new HashToList(ch));
        
    }

    private static class HashToList implements InterfaceList {

        private ClassHash hash;
        private ClassList list = new ClassList();

        public HashToList(ClassHash h) {
            hash = h;
            Iterator<Integer> it = hash.miHash.keySet().iterator();
            while (it.hasNext()) {
                list.putElement(hash.miHash.get(it.next()));
            }
        }

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
}
    
    

