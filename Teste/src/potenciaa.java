import java.util.Scanner;



public class potenciaa {

    
    
    
    public static double calculadora(double base, int expoente) { // que o ponto flutuante utilize a "calculadora" pra pegar exp e base
                                                                // esse é o método principal desse loop
        if (expoente == 0) { //se o exp for 0 vai ser sempre 1, por isso o return
            return 1;
        }

        double resultado = 1;

        if (expoente > 0) {
            for (int i = 0; i < expoente; i++) { // essa repetição so vai rolar se i< expoente e vai colocar +1 pra rodar 
               
                resultado = mult(resultado, base); // quando o expoente for maior que zero o resultado vai pro main de mult
                                                  // utilizando o resultando e a base que o usuário der.
            }
        } 
        else {
            for (int i = 0; i > expoente; i--) {
                resultado = divi(resultado, base);
            }
        }

        return resultado;
    }

    
    
    
    
    
    public static double mult(double d, double c) {
        double resultado = 0;
        boolean respos = false;

        if (d < 0) {
            d = -d;
            respos = !respos; // ! inverte o booleno
        }

        if (c < 0) {
            c = -c;
            respos = !respos;
        }

        for (int i = 0; i < c; i++) {
            resultado += d;
        }

        return respos ? -resultado : resultado; // so ira voltar se for validado
    }

    
    
    
    
    
    public static double divi(double b, double l) {
        double resultado = 0;
        boolean vari = false;

        if (b < 0) {
            b = -b;
            vari = !vari;
        }

        if (l < 0) {
            l = -l;
            vari = !vari;
        }

        while (b >= l) {
            b = sub(b, l);
            resultado++;
        }

        return vari ? -resultado : resultado;
    }

    
    
    
    
    
    
    
    public static double sub(double a, double b) {
        return a - b;
    }

    public static void main(String[] args) {
        Scanner avemaria = new Scanner(System.in);

        System.out.print("Digite a base: ");
        double base = avemaria.nextDouble();

        System.out.print("Digite o expoente: ");
        int expoente = avemaria.nextInt();

        double resultado = calculadora(base, expoente); 

        System.out.println("O resultado da potência é: " + resultado);
    }
}
