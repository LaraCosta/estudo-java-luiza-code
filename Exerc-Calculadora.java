import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1, num2, soma, sub, multi, divi;

        System.out.println("Insira um número: ");
        num1 = in.nextInt();

        System.out.println("Insira outro número: ");
        num2 = in.nextInt();

        soma = num1 + num2;
        System.out.println("O resultado da soma é: " + soma);

        sub = num1 - num2;
        System.out.println("O resultado da subtração é: " + sub);

        multi = num1 * num2;
        System.out.println("O resultado da multiplicação é: " + multi);

        divi = num1 / num2;
        System.out.println("O resultado da divisão é: " + divi );


    }
}