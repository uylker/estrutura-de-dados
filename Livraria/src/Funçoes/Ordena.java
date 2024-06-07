/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funçoes;

import LisArv.*;
import java.util.List;

/**
 *
 * @author Uylker
 */
public class Ordena {

    public String padrao(ArvBi arv, ListaEncadeada listaEn) {

        
            String var = "";
            for (int i = 0; i < arv.size(); i++) {
                var += "ID: " + i + ", NOME: " + arv.search(i, 1) + ", GÊNERO: " + arv.search(i, 2)
                        + ", QUANTIDADE: " + listaEn.buscaNo(i) + "\n";
            }
            return var;
        
        
    }

    public String alfabetica(ArvBi arv, ListaEncadeada listaEn) {

        String listaOrd = "";
        List<String> listaOrdenada = arv.obterListaOrdenada();
        for (String item : listaOrdenada) {
            listaOrd += item + "\n";
        }
        return listaOrd;

    }

}
