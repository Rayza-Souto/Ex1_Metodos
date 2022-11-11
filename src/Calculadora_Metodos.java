import java.util.Scanner;

public class Calculadora_Metodos {

    public static void main(String[] args) {

            int numero1, numero2;
            int resultado;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o primeiro número:");
            numero1 = scanner.nextInt();

            System.out.println("Digite o segundo número: ");
            numero2 = scanner.nextInt();

           

            System.out.println("A soma do numero " + numero1 + " + " + numero2 + " é:" + (resultado = numero1+numero2));
            System.out.println("A subtração do numero " + numero1 + "-" + numero2 + " é: " + (resultado = numero1-numero2));
            System.out.println("A divisão do numero " + numero1 + " pelo número " + numero2 + " é: " + (resultado = numero1/numero2));
            System.out.println("A multiplicação do numero " + numero1 + " * " + numero2 + " é: " + (resultado = numero1*numero2));

    }

}
