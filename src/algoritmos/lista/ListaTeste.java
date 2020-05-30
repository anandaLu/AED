package algoritmos.lista;

//Classe Java para testar a classe Lista (principal)
public class ListaTeste {

    //Método de execução dos programas
    public static void main(String[] args){

        //Inicializando um objeto que aponta para a classe Lista
        Lista lista1 = new Lista();

        //Adicionando elementos na lista
        lista1.adicionarLivros(2, "A Sútil Arte De Ligar O F*da-se");
        lista1.adicionarLivros(3, "A Seleção");
        lista1.adicionarLivros(4, "Por Lugares Incríveis");

        //Removendo elementos da Lista
        lista1.removerLivros(3);
        lista1.removerLivros(1);
    }
}
