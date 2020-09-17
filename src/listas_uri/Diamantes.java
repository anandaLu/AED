package listas_uri;

import java.util.ArrayList;
import java.util.List;

public class Diamantes {
    String diamantesAreia;

    //método que recebe a sentença contendo os diamantes "<>" e a areia "."
    public void extrairDiamante(String diamantesAreia) {
        this.diamantesAreia = diamantesAreia;

        //limpando a areia
        String diamantes = diamantesAreia.replace(".", "");

        //adicionando os diamantes a um array de tipo String
        String[] array = diamantes.split("");
        List <String> arr = new ArrayList<String>();

        //criando e inicializando a variável responsável por contar os diamantes
        int contadorDiamantes = 0;

        //percorrendo o array
        for(int i = 0; i < array.length; i++){
            //adicionando os elementos do array à uma lista
            arr.add(array[i]);

            //checando se contém diamante no array
            if(arr.contains("<") && arr.contains(">")){

                //removendo o diamante
                arr.remove("<");
                arr.remove(">");

                //somando um diamante ao contador
                contadorDiamantes++;
            }
        }
        System.out.println(contadorDiamantes);
    }
}