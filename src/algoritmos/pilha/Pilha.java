package algoritmos.pilha;

public class Pilha {
    int [] v1 = new int [3];
    int top = 0;

    public void push(int elemento){
        if(top<=v1.length) {
            v1[top] = elemento;
            System.out.println(v1[0] + ","+ v1[1] + "," + v1[2]);
        }
        top++;
    }
    public int pop(){
        return 0;
    }
}
