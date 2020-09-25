package algoritmos.buscaBinaria;

public class Pessoa {
    int identificador;
    String nome;

    public Pessoa(int identificador, String nome){
        this.identificador = identificador;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
}
