package algoritmos.buscaBinaria;

import java.util.ArrayList;
import java.util.List;

public class Busca {

    int identificadorLista;
    List <Pessoa> lista = new ArrayList <Pessoa>();
    
    //método recebe um identificador e uma lista do tipo Pessoa
    public void buscarItem (int identificadorLista, List<Pessoa> lista){

        this.identificadorLista = identificadorLista;
        this.lista = lista;

        //Checa se o tamanho da lista é maior que um
        if(lista.size() > 1){

            //define qual será o meio da lista
            int meio = (lista.size() / 2);

            //Checa se o identificador do elemento que está no meio é igual ao identificador buscado
            if(lista.get(meio).getIdentificador() == identificadorLista) {
                System.out.println(lista.get(meio).getNome() + "," + lista.get(meio).getIdentificador());
            }
            //se o identificador do elemento que está no meio é maior do que o identificador buscado
            else if(lista.get(meio).getIdentificador() > identificadorLista){

                //percorrer do meio até o primeiro elemento do array - todo o lado esquerdo
                for(int i = meio; i >= 0; i--){

                    //se o identificador de algum dos elementos do lado
                    //esquerdo for igual ao identificador buscado
                    if(lista.get(i).getIdentificador() == identificadorLista){
                        System.out.println(lista.get(i).getNome() + "," + lista.get(i).getIdentificador());
                    }
                }
            }
            //se o identificador do elemento que está no meio é menor do que o identificador buscado
            else if(lista.get(meio).getIdentificador() < identificadorLista){

                //percorrer do meio até o último elemento do array
                for(int j = meio; j < lista.size(); j++){

                    //se o identificador de algum dos elementos do lado
                    //direito for igual ao identificador buscado
                    if(lista.get(j).getIdentificador() == identificadorLista){
                        System.out.println(lista.get(j).getNome() + "," + lista.get(j).getIdentificador());
                    }
                }
            }
            else{
                System.out.println("O elemento buscado não existe nesta lista.");
            }
        }else{
            System.out.println("A lista está vazia. Adicione elementos.");
        }
    }
}
