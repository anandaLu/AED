package algoritmos.insertionSort;

public class TestaOrdenacao {
    public static void main(String[] args){

        int[] lista = {1, 4, 3, 2, 5};

        Ordenacao ordenacao1 = new Ordenacao();
        ordenacao1.OrdenarElementos(lista);

        for (int i = 0; i < lista.length; i++){
            System.out.print(lista[i] + " ");
        }
    }
}
