package listas_uri;

import java.util.ArrayList;
import java.util.List;

public class Parenteses {
    String expressao;

    //método que recebe a expressão
    public void checarExpressao(String expressao){

        //equivlência entre o valor do atributo e o valor informado no parâmetro
       this.expressao = expressao;

       //Divide a expressão em partes e armazena no array de String
       String[] array = expressao.split("");

       //criando duas listas de tipo String
       List <String> v1 = new ArrayList <String>();
       List <String> v2 = new ArrayList<String>();

       //laço p/ percorrer o array
       for(int i = 0; i < array.length; i++){

           //checa se tem "(" em alguma das posições do array
           if(array[i].equals("(")) {

               //cria uma variável para armazenar o parentese
               String arr = array[i];

               //adiciona o valor da variável acima ao vetor 1
               v1.add(arr);
               System.out.println(v1);

           }
           //checa se tem ")" em alguma das posições do array
           if(array[i].equals(")")){

               //cria uma variável para armazenar o parentese
               String arr2 = array[i];

               //adiciona o valor da variável acima ao vetor 2
               v2.add(arr2);
               System.out.println(v2);
           }
       }
        /* se um dos vetores for maior que o outro, significa
        *  que a quantidade de parenteses na expressão é desigual.
        *  Assim, podem existir parenteses de abertura que não têm fechamento, ou
        *  parenteses de fechamento sem abertura.*/

        //checa se o vetor um é maior que o vetor dois, ou ao contrário
        if(v1.size() > v2.size() || v2.size() > v1.size()){
            System.out.println("Incorreta");
        }
        else{
            System.out.println("Correta");
        }
    }
}
