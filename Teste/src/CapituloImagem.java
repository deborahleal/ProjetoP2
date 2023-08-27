import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class CapituloImagem extends Capitulo{
    private String imagem;
    public CapituloImagem(HashMap<String, Personagem> personagens, 
        Scanner escaneadorConsole, 
        Scanner escaneadorArquivoCapitulos)
        {
            this.ler ( personagens, escaneadorConsole,escaneadorArquivoCapitulos);
            this.escolhas = new ArrayList<Escolha>();

        }

        @Override
        public void mostrar()
        {
            System.out.println();
             System.out.println(imagem);
              System.out.println();
              super.mostrar();
        }
        @Override
        protected void ler(HashMap<String, Personagem> personagens, 
        Scanner escaneadorConsole, 
        Scanner escaneadorArquivoCapitulos)
        {
            String linha = escaneadorArquivoCapitulos.nextLine(); //IMAGEM
             linha = escaneadorArquivoCapitulos.nextLine();
             this.imagem = linha;
             linha = escaneadorArquivoCapitulos.nextLine();
            while(!linha.equals("FIM_DA_IMAGEM"))
            {
               
                    this.imagem = this.imagem + "\n" + linha;
                    linha = escaneadorArquivoCapitulos.nextLine();
                
                
                
            }
            
            super.ler(personagens, escaneadorConsole, escaneadorArquivoCapitulos);
        }

}


