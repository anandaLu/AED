package algoritmos.fila;

public class Fila {

    //Criando um vetor de String que irá armazenar todos os elementos
    String[] fila = new String[4];

    //ponteiro resposável pelo ínicio da fila (Começando em 0)
    int cabeca = 0;

    //ponteiro responsável pelo fim da fila
    int cauda;

    //Método para inserir elementos na fila
    public void inserir(String elemento){

        //Informa que é permitido inserir elementos
        System.out.println("Fila está vazia, adicione elementos.");

        //Checa se a cabeca é menor que a fila
        if(cabeca<fila.length) {
                //Adiciona um elemento na posição da cabeça
                fila[cabeca] = elemento;

                //Incrementa a cabeca para a próxima posição vazia
                cabeca++;

                //Imprime a fila
                System.out.println(fila[0] + "," + fila[1] + "," + fila[2] + "," + fila[3]);
            }
        //Checa se o tamanho da fila é igual ao ponteiro
        if(cabeca==fila.length) {
                //Informa que a fila está cheia
                System.out.println("Fila está cheia! impossível adicionar mais elementos.");
            }
        }
        //Método responsável por remover elementos da pilha
    public void remover(){

    }
}
