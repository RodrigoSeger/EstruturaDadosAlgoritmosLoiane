package Padrão;

/**
 * @author rodrigoes
 */

public class Aula4 {
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(10); // cria vetor de 5 posições
        
        vetor.adiciona2("elemento 1"); // adiciona na primeira posição nula
        vetor.adiciona2("elemento 2"); // adiciona na proxima posição nula
        vetor.adiciona2("elemento 3"); // adiciona na proxima posição nula
        
        System.out.println(vetor.tamanho());
        
        System.out.println(vetor.toString());
    }
}
