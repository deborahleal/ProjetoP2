import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner bola = new Scanner(System.in);
        
        System.out.println("Olá, escolha uma opção que irá definir seu futuro!");

        String escolha1 = "1. Escolha 1";
        escolha1 += System.lineSeparator() +"2. Escolha 3";
        escolha1 += System.lineSeparator() +"3. Escolha 3;";

        System.out.println(escolha1);

       int escolhausuario = bola.nextInt();

       if(escolhausuario == 1){

        System.out.println("Você morreu!");



       }

       if (escolhausuario == 2){

        System.out.println("VOCE TOMOPU NO CU");
       }

}


}