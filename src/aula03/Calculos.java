package aula03;

/**
 *
 * @author jdhein
 */
public class Calculos {
    
    public static void main(String[] args) {
        
        calcularArea(5, 10);
    }
    
    private static void calcularArea(double b, double a){
        double area = b * a;
        System.out.println("ÁREA = " + area);
    }
    
}
