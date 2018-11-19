package Padrão;

import java.util.Arrays;

/**
 * @author rodrigoes
 */

public class Vetor {
    private String[] elementos; // criou um vetor de elementos
    private int tamanho;
    
    public Vetor(int capacidade){ // construtor com a acapcidade de elementos e o tamanho do vetor
        this.elementos = new String[capacidade]; // capacidade do vetor
        this.tamanho = 0; // tamanho real do vetor
    }
    
    public void adiciona(String elemento){ // método adiciona que ira incluir elementos no final do vetor
        for(int i =0; i<this.elementos.length; i++){ // for para percorrer o vetor de elementos
            if(this.elementos[i] == null){ // se elemento na posição i tiver nulo
                this.elementos[i] = elemento; // posição do vetor recebe elemento
                break; // quebra para sair do código
            }
        }
    }
    
    public void adiciona2(String elemento) throws Exception{ // método adiciona no final melhorado 
        if(this.tamanho < this.elementos.length){ // se o tamanho for menor que a capacidade de elementos
            this.elementos[this.tamanho] = elemento; // adicionou o elemento
            this.tamanho++; // e adicionou o tamanho simultaneamente
        } else { // manda uma exceção
            throw new Exception("Vetor já está cheio, não é possível adicionar novos elementos");
        }
       
    }
    
    public boolean adiciona3(int posicao, String elemento){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        // mover todos os elementos
        for(int i=this.tamanho-1; i>=posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        
        return false;
    }
    
    public void remove(int posicao){
        
    }
    
    public String busca(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao]; //retorna o elemento da classe conforme a posicao
    }
    
    public int busca(String elemento){
        for(int i=0; i<this.tamanho; i++){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }
    
    public int tamanho(){
        return this.tamanho; // retorne o tamanho da classe 'Vetor'
    }
    
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");
        
        for(int i =0; i<this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }
        
        if (this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }
        s.append("]");
        return s.toString();
    }
}
