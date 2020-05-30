package algoritmos.pilha;

//Classe teste (Principal)
public class PilhaTeste {

    //Método de execução dos programas
    public static void main (String[] args){

        //Inicializando um objeto que aponta para a classe Pilha
        Pilha pilha1 = new Pilha();


        //Adicionando elementos ao vetor através do método push
        pilha1.push(7);
        pilha1.push(2);
        pilha1.push(1);
        //Removendo elementos da pilha
        pilha1.pop();
    }
}
