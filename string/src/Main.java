import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("inverta uma palavra:");
        String input = sc.next();
        String exit = "";

        for (int i = input.length() - 1; i >= 0; i--) {

            exit += input.charAt(i);
        }
        System.out.println(input + " invertido é: " + exit);
    }
}