import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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

        Imposto imposto = new Imposto(rendaSalarioAnual, rendaServicosAnual, rendaCapitalAnual, gastosMedicos, gastosEducacionais);

        CalculadoraImposto calculadora = new CalculadoraImposto(imposto);
        calculadora.gerarRelatorio();
        scanner.close();
    }
}