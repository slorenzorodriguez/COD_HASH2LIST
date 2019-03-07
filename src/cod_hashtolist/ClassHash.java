/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod_hashtolist;

/**
 *
 * @author slorenzorodriguez
 */

    import java.util.HashMap;

public class ClassHash implements InterfaceHash {

    HashMap<Integer, String> miHash = new HashMap<>();
    private static int cod = 1000;

    @Override
    public void putValue(String contenido) {
        int key = cod;
        miHash.put(key, contenido);
        cod++;
    }

    @Override
    public String getValue(int key) {
        return miHash.get(key);
    }

}

