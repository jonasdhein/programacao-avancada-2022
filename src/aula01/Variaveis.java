package aula01;

/**
 *
 * @author jdhein
 */
public class Variaveis {
    
    public static void main(String[] args) { 
        //calcular a média
        
        double media = calcularMedia(7, 9, 1, 0, 5);
        System.out.println("MÉDIA1 = " + media);
        
        double media2 = calcularMedia(7, 9, 1, 0);
        System.out.println("MÉDIA2 = " + media2);
        
        double[] notas = {7,9,1};
        double media3 = calcularMedia(notas);
        System.out.println("MÉDIA3 = " + media3);
        
   }
    
    private static double calcularMedia(double[] notas){
        double soma = 0;
        int tam_vetor = notas.length;
        
        for (int i = 0; i < tam_vetor; i++) {
            soma += notas[i];
        }
        
        double media = soma / tam_vetor;
        return media;
    }
    
    private static double calcularMedia(double n1, double n2, double n3, double n4){
        double media = (n1 + n2 + n3 + n4) / 4;
        return media;
    }
    
    private static double calcularMedia(double n1, double n2, double n3, double n4, double n5){
        double media = (n1 + n2 + n3 + n4 + n5) / 5;
        return media;
    }
}
