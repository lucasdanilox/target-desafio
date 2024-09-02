import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um numero a ser verificado: ");
        int number = sc.nextInt();

        int a = 0;
        int b = 1;

        while (a <= number) {
            if (a == number) {
                System.out.println(number + " pertence à sequência de Fibonacci.");
                return;
            }
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println(number + " não pertence à sequência de Fibonacci.");
    }
}