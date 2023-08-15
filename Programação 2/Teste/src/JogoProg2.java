import java.util.Scanner;
public class JogoProg2 {
    public static void main(String[] args) {
        System.out.println();
      
        System.out.println();
        Scanner escaneador = new Scanner(System.in);
        Personagem adriano = new Personagem("Adriano", 100);
        Personagem jose = new Personagem ( "jose", 50);

        //adriano.alterarEnergia(-200);
        //jose.alterarEnergia(-150);

        //Capitulo 1 
        Capitulo capitulo1 = new Capitulo("A PRIMEIRA ESCOLHA", "Olá, me chamo Adriano; e estou aqui para lhe orientar nessa aventura." +
                                " José está em uma floresta, e perto de tomar uma decisão, pois está em uma bifurcação," +
                                " então escolha para onde quer seguir:  ", jose, 0, escaneador);
        
        //Capitulo 2
        Capitulo capitulo2 = new Capitulo("UM FIM EMINENTE","Ao escolher o lado direito, josé acorda no meio da noite em sua cama." +
                                " E então passa a acreditar que tudo aquilo foi um sonho, fruto de sua imaginação, " +
                                "que é constantemente alimentada por filmes de ficção cientifica. FIM", jose, -100, escaneador);
        
        //CAP 3
        Capitulo capitulo3 = new Capitulo(" ENCONTRO DO TESOURO", "Após escolher o lado esquerdo, jose encontra um precipicio e deve escolher se: ", jose, 10, escaneador);
       
        // CAP 4 
        Capitulo capitulo4 = new Capitulo("MERCENARIOS", " jose encontra um grupo de mercenarios e é morto. FIM", jose, 20, escaneador);

        //CAP 5
        Capitulo capitulo5 = new Capitulo(" CAMINHO DO BEM", " jose percebeu que era alto, mas mesmo assim pulou;" +
                                "e encontrou um caminho que o levará para casa. FIM", jose, 0, escaneador);


           //ESCOLHAS
           capitulo1.escolhas.add(new Escolha("direita", capitulo2));
           capitulo1.escolhas.add(new Escolha("esquerda", capitulo3));
           capitulo3.escolhas.add(new Escolha("1", capitulo4));
           capitulo3.escolhas.add ( new Escolha("2", capitulo5));
          //new String[]{"direita", "esquerda"}; //CAP 1 
          //null; //CAP 2 
         // new String [] {"1", "2"}; //CAP3
          //null; // CAP4
         // null; //CAP5

        Capitulo raiz = capitulo1;
        System.out.println(" UMA HISTÓRIA SOBRE DECISÕES");
        System.out.println( "\n . . . \n");
        raiz.mostrar();
        escaneador.close();
    }
}
