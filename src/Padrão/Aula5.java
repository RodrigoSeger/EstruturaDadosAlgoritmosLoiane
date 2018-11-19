package Padrão;

/**
 * @author rodri
 */
public class Aula5 {
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(10); // cria vetor de 5 posições
        
        vetor.adiciona2("elemento 1"); // adiciona na primeira posição nula
        vetor.adiciona2("elemento 2"); // adiciona na proxima posição nula
        vetor.adiciona2("elemento 3");
        
        System.out.println(vetor.busca(4)); // busca o elemento da posicao
    }
}
