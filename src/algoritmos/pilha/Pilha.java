package algoritmos.pilha;

import java.awt.*;

//Criando classe pilha
public class Pilha {

    //Vetor de inteiros com tamanho 3
    int [] v1 = new int [3];

    //Ponteiro
    int top = 0;

    //Método de inserção no vetor (pede como parâmetro um elemento inteiro
    public void push(int elemento){

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
    public void pop(){

        //Atribuindo o valor de top como sendo a última posição do vetor (no caso o vetor de tamanho 3 tem - 0,1 e 2)
        top = v1.length -1;

        //laço para percorrer o vetor, de trás para frente
        for (int i = top; i<v1.length && i>=0; i--){

            //Limpando as posições do vetor
            v1[i] = 0;

            //Imprimindo o vetor após as mudanças
            System.out.println(v1[0]+","+v1[1]+","+v1[2]);
        }
        //Se a primeira posição do vetor for igual à 0 (que no caso seria a última após percorrer de trás para a frente), o vetor estará vazio
        if(v1[0] == 0){
            System.out.println("Pilha está vazia, não será possível remover mais elementos.");
        }
    }
}
