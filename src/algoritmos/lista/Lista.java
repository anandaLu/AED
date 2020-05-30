package algoritmos.lista;

//Classe Java
public class Lista {

    //Vetor (lista) de livros
    String[] listaLivros = new String [5];

    //indice do vetor (onde o elemento será adicionado)
    int indice = 0;

    //Método para adicionar livros. Recebe o índice onde o elemento vai ser adicionado e o elemento, respectivamente
    public void adicionarLivros(int indice, String elemento){

        //Indica que o índice informado no método é o mesmo declarado como atributo anteriormente
        this.indice = indice;

        //Checa se a posição no valor passado em índice está ocupada
        if(listaLivros[indice] != null){

            //Retorna uma mensagem avisando que está ocupada
            System.out.println("Esta posição já está ocupada, escolha outra.");
        }
        //Checa se a posição no valor passado em índice está vazia
        if(listaLivros[indice] == null){

            //Armazena o elemento na posição índice
            listaLivros[indice] = elemento;

            //Imprime o vetor listaLivros
            System.out.println(listaLivros[0] + ","+listaLivros[1] + "," + listaLivros[2] + "," + listaLivros[3] + "," + listaLivros[4]);
        }
    }

    public void removerLivros(){

    }
}
