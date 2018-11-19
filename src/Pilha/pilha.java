package Pilha;

/**
 * @author rodri
 */

public class pilha  {
    int elementos[];
    int topo;
    
    public pilha(){
        elementos = new int[10];
        topo = -1; // posição inválida do vetor
    }
    
    public void push(int e){
        if(isFull()){
            throw new RuntimeException("Stack Overflow!");
        }
        topo++;
        elementos[topo] = e;
    }
    
    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Empty Stack!");
        }
        int e;
        e = elementos[topo];
        topo--;
        return e;
    }
    
    public boolean isEmpty(){
        return(topo == -1);
    }
    
    public boolean isFull(){
        return (topo == this.elementos.length-1);
    }
    public int top(){
        if(isEmpty()){
            throw new RuntimeException("Empty Stack!");
        }
        return elementos[topo];
    }
    
}
