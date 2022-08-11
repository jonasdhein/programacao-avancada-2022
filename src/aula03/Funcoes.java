package aula03;

import aula02.Exercicios;
import ferramentas.Entrada;

/**
 *
 * @author jdhein
 */
public class Funcoes {
    
    public static void main(String[] args) {
        
        double valorEstacionamento = 0;
        double valorMinutoAdicional = 1.0 / 60;
        
        int horas = Entrada.leiaInt("Horas");
        int minutos = Entrada.leiaInt("Minutos");
        
        
        int totalMinutos = (horas * 60) + minutos;
        
        if(totalMinutos <= 60){
            valorEstacionamento = 2;
        }else if(totalMinutos <= 120){
            valorEstacionamento = 2 + 1.5;
        }else{
            valorEstacionamento = 2 + 1.5;
            totalMinutos = totalMinutos - 120;
            
            valorEstacionamento += (totalMinutos * valorMinutoAdicional);
        }
        
        System.out.println("Total a pagar: R$ " + valorEstacionamento);
        
    }
    
    private static void chamarTabuada(){
        int tab = Entrada.leiaInt("Informe um número");
        Exercicios.tabuada(tab);
    }
    
}
