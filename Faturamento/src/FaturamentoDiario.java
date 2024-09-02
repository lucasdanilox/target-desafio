import java.util.Arrays;

public class FaturamentoDiario {

    public static void main(String[] args) {

        double[] faturamentoDiario = {15000.0, 20000.0, 0.0, 30000.0, 25000.0, 0.0, 22000.0, 0.0, 17000.0, 19000.0, 0.0, 21000.0, 23000.0, 0.0, 25000.0, 0.0, 27000.0, 0.0, 30000.0, 0.0, 15000.0, 17000.0, 18000.0, 0.0, 20000.0, 22000.0, 24000.0, 0.0, 25000.0, 27000.0, 0.0, 29000.0, 0.0, 30000.0};


        double menorFaturamento = Arrays.stream(faturamentoDiario).filter(valor -> valor > 0).min().orElse(0);
        double maiorFaturamento = Arrays.stream(faturamentoDiario).filter(valor -> valor > 0).max().orElse(0);


        double somaFaturamento = Arrays.stream(faturamentoDiario).filter(valor -> valor > 0).sum();
        long diasComFaturamento = Arrays.stream(faturamentoDiario).filter(valor -> valor > 0).count();
        double mediaMensal = somaFaturamento / diasComFaturamento;


        long diasAcimaMedia = Arrays.stream(faturamentoDiario).filter(valor -> valor > mediaMensal).count();


        System.out.println("Menor valor de faturamento diário: R$" + menorFaturamento);
        System.out.println("Maior valor de faturamento diário: R$" + maiorFaturamento);
        System.out.println("Número de dias com faturamento acima da média mensal: " + diasAcimaMedia);
    }
}

