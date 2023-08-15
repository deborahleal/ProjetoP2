import java.util.HashMap;
import java.util.Scanner;
public class Jogo2{

    public static void main(String[] args) {
        Scanner leitor = new Scanner ( System.in);
        Leitor leitorcarre = new Leitor ();
        HashMap < String, Personagem> personagens = leitorcarre.lerpersonagens("rsc/personagens");

        HashMap < String, Personagem> capitulos = leitorcarre.lerpersonagens("rsc/capitulos"); 
        Capitulos raiz = capitulos.get("ESCOLHAS");
        System.out.println("BEM VINDO AO JOGO VIDA DE BRASA -------------- O JOGO DE ESCOLHAS");
        System.out.println(" O objetivo do jogo é terminar o personagem com 50 ou mais de felicidade ");
        raiz.mostrar();
        leitor.close();



    }
}
