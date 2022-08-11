package aula02;

import ferramentas.Entrada;

/**
 *
 * @author jdhein
 */
public class Exercicios {
    
    static String[] vetorCidades = new String[4];
    
    public static void main(String[] args) {
        
        /*1 - (LAÇO FOR) Criar uma função que imprime uma tabuada de um 
        determinado número;*/
        int tab = Entrada.leiaInt("Informe um número");
        tabuada(tab);
        
        /*2 - (QUALQUER LAÇO) Criar um vetor vazio de cidades de tamanho 4;
        Percorrer um laço de repetição para incluir a cidade 
        através da classe Entrada. Atenção: Você precisa validar
        se a cidade já existe no vetor, só deixando incluir nele caso 
        a cidade informada ainda não exista nele.
        Ao final, imprima as cidades do vetor*/
        preencheCidades();
        
        for(String cidade : vetorCidades){
            System.out.println(cidade);
        }
    }
    
    public static void tabuada(int tabuada){
        for (int i = 0; i <= 10; i++) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
        }
    }
    
    private static void preencheCidades(){
        String cidadeInformada = "";
        
        for (int i = 0; i < vetorCidades.length; i++) {
            
            cidadeInformada = Entrada.leiaString("Informe uma cidade");
            
            while(validaCidade(cidadeInformada)){
                cidadeInformada = Entrada.leiaString("Cidade já existe, informe outra cidade");
            }
            
            //está ok
            vetorCidades[i] = cidadeInformada;
        }
        
    }
    
    private static boolean validaCidade(String cidadeInformada){
        boolean existe = false;
        //for (int i = 0; i < vetorCidades.length; i++) {
        for(String cidade : vetorCidades){
            if(cidadeInformada.equalsIgnoreCase(cidade) && cidade != null){
                existe = true;
                break;
            }
        }
        
        return existe;        
    }
    
}
