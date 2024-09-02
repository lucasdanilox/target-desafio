//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k < indice){
            k += 1;
            soma += k;
        }
        System.out.println("SOMA: " + soma);
    }
}