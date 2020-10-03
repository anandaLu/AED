package algoritmos.insertionSort;

public class Ordenacao {

    int[] lista;

    public void OrdenarElementos(int[] lista){
        this.lista = lista;

        // para percorrer a lista a partir do indice 1
        for (int j = 1; j < lista.length; j++){

            //adicinar à chave o elemento da lista na posição j
            int chave = lista[j];

            int i = j - 1;

            /*enquanto o valor de i for maior que um e
            lista na posição i for maior que a chave*/
            while (i > -1 && lista[i] > chave){

                //atribui o valor no indice i + 1 por o elemento da lista na posição na posição i
                lista[i + 1] = lista[i];
                i = i - 1;
            }
            //adiciona a chave ao elemento de indice i + 1
            lista [i + 1] = chave;
        }
    }

}
