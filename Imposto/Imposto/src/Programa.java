import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dados fornecidos pelo usuário
        System.out.print("Renda anual com salário: ");
        double rendaSalarioAnual = scanner.nextDouble();

        System.out.print("Renda anual com prestação de serviço: ");
        double rendaServicosAnual = scanner.nextDouble();

        System.out.print("Renda anual com ganho de capital: ");
        double rendaCapitalAnual = scanner.nextDouble();

        System.out.print("Gastos médicos: ");
        double gastosMedicos = scanner.nextDouble();

        System.out.print("Gastos educacionais: ");
        double gastosEducacionais = scanner.nextDouble();

        // Criação de objeto Pessoa com os dados fornecidos
        Imposto imposto = new Imposto(rendaSalarioAnual, rendaServicosAnual, rendaCapitalAnual, gastosMedicos, gastosEducacionais);

        // Cálculo do imposto usando a classe CalculadoraImposto
        CalculadoraImposto calculadora = new CalculadoraImposto(imposto);
        calculadora.gerarRelatorio();

        scanner.close();
    }
}