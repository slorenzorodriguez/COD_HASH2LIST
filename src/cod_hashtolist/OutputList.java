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
public class OutputList {
    public static void mostrar(InterfaceList lista) {
        for (int i = 0; i < lista.size(); i++) {
             System.out.println(i + " " + lista.getElement(i));
}
    }
}
