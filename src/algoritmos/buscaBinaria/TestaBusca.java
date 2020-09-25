package algoritmos.buscaBinaria;

import java.util.ArrayList;
import java.util.List;

public class TestaBusca {
    public static void main (String[] args){


        List<Pessoa> lista = new ArrayList<Pessoa>();

        lista.add(new Pessoa(1,"Ana"));
        lista.add(new Pessoa(2, "João"));
        lista.add(new Pessoa(3, "Sam"));
        lista.add(new Pessoa(4, "Paola"));
        lista.add(new Pessoa(5, "Jake"));

        Busca teste = new Busca();
        teste.buscarItem(5, lista);
    }

}
