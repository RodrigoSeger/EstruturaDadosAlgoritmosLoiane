package Padrão;

/**
 * @author rodri
 */
public class Aula7 {
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(10); // cria vetor de 5 posições
        
        vetor.adiciona2("B");
        vetor.adiciona2("C");
        vetor.adiciona2("D");
        vetor.adiciona2("E");
        vetor.adiciona2("F");
        vetor.adiciona2("G");
        
        System.out.println(vetor);
        
        vetor.adiciona3(0, "A");
        
        System.out.println(vetor);


    }
}
