package algoritmos.pilha;

//Criando classe pilha
public class Pilha {

    //Vetor de inteiros com tamanho 3
    int [] v1 = new int [3];

    //Ponteiro
    int top = 0;

    //Método de inserção no vetor (pede como parâmetro um elemento inteiro
    public void push(int elemento){

        //Checando se o tamanho de v1 é igual a zero
        if(v1.length == 0){
            System.out.println("A pilha está vazia! Adicione elementos.");
        }
        //Checando se o valor de top é maior ou igual que o tamanho de v1
        if(top<v1.length) {

            //Adicionando o elemento a v1 na posição atual do ponteiro
            v1[top] = elemento;

            //Imprimindo os valores armazenados em v1
            System.out.println(v1[0] + ","+ v1[1] + "," + v1[2]);

            //Incrementado o valor do ponteiro
            top++;
        }
        //Checando a última opção (Pilha cheia)
        else{
            System.out.println("Pilha está cheia! Não será possível adicionar mais elementos.");
        }
    }
    //Método para remover os elementos do vetor
    public int pop(){

        return 0;
    }
}
