import java.util.Scanner;
public class JogoProg2 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(" UMA HISTÓRIA SOBRE DECISÕES");
        System.out.println();
        Personagem adriano = new Personagem("Adriano", 100);
        Personagem jose = new Personagem ( "jose", 50);

        //adriano.alterarEnergia(-200);
        //jose.alterarEnergia(-150);

        //Capitulo 1 
        String nomeCapitulo1 = "A PRIMEIRA ESCOLHA";
        String textoCapitulo1 = "Olá, me chamo Adriano; e estou aqui para lhe orientar nessa aventura." +
                                " José está em uma floresta, e perto de tomar uma decisão, pois está em uma bifurcação," +
                                " então escolha para onde quer seguir:  ";
        //decisões CAP 1
        String escolha1Capitulo1 = "direita";
        String escolha2Capitulo1 = "esquerda";
        //Capitulo 2
        String nomeCapitulo2 = "UM FIM EMINENTE";
        String textoCapitulo2 = "Ao escolher o lado direito, josé acorda no meio da noite em sua cama." +
                                " E então passa a acreditar que tudo aquilo foi um sonho, fruto de sua imaginação, " +
                                "que é constantemente alimentada por filmes de ficção cientifica. FIM";
        //CAP 3
        String nomeCapitulo3 = " ENCONTRO DO TESOURO";
        String textoCapitulo3 = "Após escolher o lado esquerdo, jose encontra um precipicio e deve escolher se: ";
        //decisões CAP3
        String escolha1Capitulo3 = " 1";
        String escolha2Capitulo3 = " 2 ";
         String escolha3Capitulo3 = " 3 ";
        // CAP 4 
         String nomeCapitulo4 = "MERCENARIOS";
         String textoCapitulo4 = " jose encontra um grupo de mercenarios e é morto. FIM";
        //CAP 5
         String nomeCapitulo5 = " CAMINHO DO BEM";
        String textoCapitulo5 = " jose percebeu que era alto, mas mesmo assim pulou;" +
                                        "e encontrou um caminho que o levará para casa. FIM";

        //CAP 6 
        String nomeCapitulo6 = " DESISTENTE";
        String textoCapitulo6 = " Por não pular, jose se mostra um covarde. FIM";
        System.out.println( "\n . . . \n");
        System.out.println(nomeCapitulo1);
        System.out.println(textoCapitulo1);
        System.out.println("-" + escolha1Capitulo1) ;
        System.out.println("-" + escolha2Capitulo1 );

        Scanner escaneador = new Scanner(System.in);
        String escolha = escaneador.nextLine();

        if ( escolha.equals(escolha1Capitulo1))
        {
            System.out.println("\n . . . \n");
            System.out.println(nomeCapitulo2);
            System.out.println(textoCapitulo2);
            adriano.alterarEnergia(-100);
        }
        else if(escolha.equals(escolha2Capitulo1))
        {

            System.out.println("\n . . . \n");
            System.out.println(nomeCapitulo3);
            System.out.println(textoCapitulo3);
            System.out.println("-" + escolha1Capitulo3) ;
            System.out.println("-" + escolha2Capitulo3) ;
            System.out.println("-" + escolha3Capitulo3) ;
            escolha = escaneador.nextLine();
            if(escolha.equalsIgnoreCase(escolha1Capitulo3))
            {
                    System.out.println("\n . . .\n") ;
                    System.out.println(nomeCapitulo4) ;
                    System.out.println(textoCapitulo4) ;


            }
            else if ( escolha.equals(escolha2Capitulo3))
            {
                
                    System.out.println("\n . . . \n") ;
                    System.out.println(nomeCapitulo5) ;
                    System.out.println(textoCapitulo5) ;
                    adriano.alterarEnergia(-15);
            }
            else if ( escolha.equals(escolha3Capitulo3))
            {
                

                    System.out.println("\n  . . . \n" ) ;
                    System.out.println(nomeCapitulo6) ;
                    System.out.println(textoCapitulo6) ;
            }

        }
    }
}
