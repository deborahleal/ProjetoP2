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

        //adriano.alterarEnergia(-200);
        //jose.alterarEnergia(-150);

        //Capitulo 1 
       // Capitulo capitulo1 = capitulos.get("A PRIMEIRA ESCOLHA");
        
        //Capitulo 2
       // Capitulo capitulo2 = capitulos.get("UM FIM EMINENTE");
        
        //CAP 3
        ///Capitulo capitulo3 = new Capitulo(" ENCONTRO DO TESOURO", "Após escolher o lado esquerdo, jose encontra um precipicio e deve escolher se: ", jose, 10, escaneador);
       
        // CAP 4 
        ///Capitulo capitulo4 = new Capitulo("MERCENARIOS", " jose encontra um grupo de mercenarios e é morto. FIM", jose, 20, escaneador);

        //CAP 5
        ///Capitulo capitulo5 = new Capitulo(" CAMINHO DO BEM", " jose percebeu que era alto, mas mesmo assim pulou;" +
                                //"e encontrou um caminho que o levará para casa. FIM", jose, 0, escaneador);


           //ESCOLHAS
           //capitulo1.escolhas.add(new Escolha("direita", capitulo2));
           //capitulo1.escolhas.add(new Escolha("esquerda", capitulo3));
           //capitulo3.escolhas.add(new Escolha("1", capitulo4));
           //capitulo3.escolhas.add ( new Escolha("2", capitulo5));
          //new String[]{"direita", "esquerda"}; //CAP 1 
          //null; //CAP 2 
         // new String [] {"1", "2"}; //CAP3
          //null; // CAP4
         // null; //CAP5

        Capitulo raiz = capitulos.get("A PRIMEIRA ESCOLHA");
        System.out.println(" UMA HISTÓRIA SOBRE DECISÕES");
        System.out.println( "\n . . . \n");
        raiz.mostrar();
        escaneador.close();
    }
}