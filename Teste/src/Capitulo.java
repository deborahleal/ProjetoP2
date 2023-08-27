import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Capitulo {
     private String nome;
     private String texto;
     protected ArrayList<Escolha>  escolhas; //objeto
     private  Personagem personagem;
     private int variacaodeEnergia;
     private Scanner escaneador;

     protected Capitulo(){}


    public Capitulo( String nome, 
                    String texto,
                    Personagem personagem,
                    int variacaodeEnergia, 
                    Scanner escaneador )
            {
                this.nome = nome;
                this.texto = texto;
                this.personagem = personagem;
                this.variacaodeEnergia = variacaodeEnergia;
                this.escaneador = escaneador;
                this.escolhas = new ArrayList<Escolha> (); //tem que criar uma parte pra caixa magica
            }

            public Capitulo(
            HashMap<String, Personagem> personagens, 
            Scanner escaneadorConsole,
            Scanner escaneadorArquivoCapitulos) 
            {
                this.ler(personagens, escaneadorConsole, escaneadorArquivoCapitulos);
                this.escolhas = new ArrayList<Escolha>();
    }

            public void mostrar () //ajuda no reuso do código
            {
                System.out.println( "\n . . . \n");
                System.out.println(this.nome);
                System.out.println(this.texto);
                this.personagem.alterarEnergia(this.variacaodeEnergia);

                if(this.escolhas.size() > 0)
                {
                    for(Escolha escolha : escolhas)
                    {
                        System.out.println("-" + escolha.getTexto());
                    }
                    System.out.println();

                     int idEscolha = escolher();
                     this.escolhas.get(idEscolha).getProximo().mostrar();
                }
                
                
               
            }
            private int escolher() {
                int idEscolha = -1;

                if ( escolhas != null ) {
                    while(idEscolha == -1) 
                    {
                         System.out.println(" Digite sua escolha: ");
                        String escolhaDigitada = escaneador.nextLine();

                        
                        for(int i = 0; i<escolhas.size();i++){
                            if(escolhaDigitada.equals(escolhas.get(i).getTexto()))
                        {
                            idEscolha = i;
                        }
                        
                        } 
                    }

                    System.out.println();
                   
                    
                }
                return idEscolha;
            }
            protected void ler(HashMap<String, Personagem> personagens, 
                             Scanner escaneadorConsole,
                             Scanner escaneadorArquivoCapitulos) {
                     
                        
                        String linhaEscaneada;

                        this.escaneador = escaneadorConsole;
                       
                        linhaEscaneada = escaneadorArquivoCapitulos.nextLine(); // NOME
                        this.nome = escaneadorArquivoCapitulos.nextLine(); 

                        linhaEscaneada = escaneadorArquivoCapitulos.nextLine(); // texto
                        this.texto = escaneadorArquivoCapitulos.nextLine();

                        linhaEscaneada = escaneadorArquivoCapitulos.nextLine(); // personagem
                        this.personagem = personagens.get(escaneadorArquivoCapitulos.nextLine());
                        
                        linhaEscaneada = escaneadorArquivoCapitulos.nextLine(); // variação de ENERGIA
                        this.variacaodeEnergia = Integer.parseInt(escaneadorArquivoCapitulos.nextLine()); 
                        
                        }

            public void adicionarEscolha( Escolha escolha )
            {
                this.escolhas.add(escolha);
            }

            public String getNome() {
                return this.nome;
            }

}