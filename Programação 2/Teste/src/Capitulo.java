import java.util.ArrayList;
import java.util.Scanner;


public class Capitulo {
    String nome;
    String texto;
    ArrayList<Escolha>  escolhas; //objeto
    Personagem personagem;
    int alteraçãoEnergia;
    Scanner escaneador;

    Capitulo( String nome, String texto,Personagem personagem,int alteraçãoEnergia, Scanner escaneador )
            {
                this.nome = nome;
                this.texto = texto;
                this.personagem = personagem;
                this.alteraçãoEnergia = alteraçãoEnergia;
                this.escaneador = escaneador;
                this.escolhas = new ArrayList<Escolha> ();
            }

            void mostrar () //ajuda no reuso do código
            {
                System.out.println( "\n . . . \n");
                System.out.println(this.nome);
                System.out.println(this.texto);
                this.personagem.alterarEnergia(this.alteraçãoEnergia);

                if(this.escolhas.size() > 0)
                {
                    for(Escolha escolha : escolhas)
                    {
                        System.out.println("-" + escolha.texto);
                    }
                    System.out.println();

                     int idEscolha = escolher();
                     this.escolhas.get(idEscolha).proximo.mostrar();
                }
                
                
               
            }
            int escolher() {
                int idEscolha = -1;

                if ( escolhas != null ) {
                    while(idEscolha == -1) 
                    {
                         System.out.println(" Digite sua escolha: ");
                        String escolhaDigitada = escaneador.nextLine();

                        
                        for(int i = 0; i<escolhas.size();i++){
                            if(escolhaDigitada.equals(escolhas.get(i).texto))
                        {
                            idEscolha = i;
                        }
                        
                        } 
                    }

                    System.out.println();
                   
                    
                }
                return idEscolha;
            }
}
