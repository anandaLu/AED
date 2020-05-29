package algoritmos.fila;

public class Fila {

    //Criando um vetor de String que irá armazenar todos os elementos
    String[] fila = new String[4];

    //ponteiro resposável pelo ínicio da fila (Começando em 0)
    int cabeca = 0;

    //ponteiro responsável pelo fim da fila
    int cauda = 0;

    //Método para inserir elementos na fila
    public void inserir(String elemento){

        //Informa que é permitido inserir elementos
        System.out.println("Fila está vazia, adicione elementos.");

        //Checa se a cauda é menor que o tamanho da fila
        if(cauda<fila.length) {
                //Adiciona um elemento na posição da cauda
                fila[cauda] = elemento;

                //Incrementa a cauda para a próxima posição vazia
                cauda++;

                //Imprime a fila
                System.out.println(fila[0] + "," + fila[1] + "," + fila[2] + "," + fila[3]);
            }
        //Checa se o tamanho da fila é igual ao ponteiro
        if(cauda==fila.length) {
                //Informa que a fila está cheia
                System.out.println("Fila está cheia! impossível adicionar mais elementos.");
            }
        }
        //Método responsável por remover elementos da fila
    public void remover(){

        //Laço de repetição para percorrer a fila
        for(int i = cabeca; i<fila.length; i++){

            //limpará as posições removendo os elementos
            fila[i] = null;

            //Imprime os elementos do vetor
            System.out.println(fila[0] + "," + fila[1] + "," + fila[2] + ","+ fila[3]);
        }
        //Se não há nada para remover, significa que o vetor está vazia
        System.out.println("Fila está vazia. Adicione elementos.");
    }
}
