import java.util.HashMap;
import java.util.Scanner;
public class JogoProg2 {
    public static void main(String[] args) {
        System.out.println();
      
        System.out.println(); 
        Scanner escaneador = new Scanner(System.in);

        LeitorCarregador leitor = new LeitorCarregador();
          HashMap<String,Personagem> personagens = leitor.lerPersonagens("rsc/personagens.txt");
         HashMap<String, Capitulo> capitulos = leitor.lerCapitulos("rsc/capitulos.txt", 
                                                                    personagens, 
                                                                    escaneador);

        
        Capitulo raiz = capitulos.get("A PRIMEIRA ESCOLHA");
        System.out.println(" UMA HISTÓRIA SOBRE DECISÕES");
        System.out.println( "\n . . . \n");
        raiz.mostrar();
        escaneador.close();
    }
}