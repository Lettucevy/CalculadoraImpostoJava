
public class CalculadoraImposto {

        private Imposto imposto;
        public CalculadoraImposto(Imposto imposto) {
            this.imposto = imposto;
        }
    
        public double calcularImpostoSalario() {
            double rendaMensal = imposto.getRendaSalarioAnual() / 12;
            if (rendaMensal < 3000) {
                return 0;
            } else if (rendaMensal < 5000) {
                return rendaMensal * 0.10 * 12; 
            } else {
                return rendaMensal * 0.20 * 12; 
            }
        }
    
        public double calcularImpostoServicos() {
            return imposto.getRendaServicosAnual() * 0.15;
        }
    
        public double calcularImpostoCapital() {
            return imposto.getRendaCapitalAnual() * 0.20;
        }
    
        public double calcularImpostoBrutoTotal() {
            return calcularImpostoSalario() + calcularImpostoServicos() + calcularImpostoCapital();
        }
    
        public double calcularAbatimento() {
            double impostoBrutoTotal = calcularImpostoBrutoTotal();
            double maximoDedutivel = impostoBrutoTotal * 0.30;
            double gastosDedutiveis = imposto.getGastosMedicos() + imposto.getGastosEducacionais();
            return Math.min(maximoDedutivel, gastosDedutiveis);
        }
    
        public double calcularImpostoDevido() {
            return calcularImpostoBrutoTotal() - calcularAbatimento();
        }
    
        public void gerarRelatorio() {
            System.out.println("\n|||RELATÓRIO DE IMPOSTO DE RENDA|||");
            System.out.printf("Imposto sobre salário: %.2f%n", calcularImpostoSalario());
            System.out.printf("Imposto sobre serviços: %.2f%n", calcularImpostoServicos());
            System.out.printf("Imposto sobre ganho de capital: %.2f%n", calcularImpostoCapital());
            System.out.println("||DEDUÇÕES||:");
            double impostoBrutoTotal = calcularImpostoBrutoTotal();
            double maximoDedutivel = impostoBrutoTotal * 0.30;
            System.out.printf("Máximo dedutível: %.2f%n", maximoDedutivel);
            double gastosDedutiveis = imposto.getGastosMedicos() + imposto.getGastosEducacionais();
            System.out.printf("Gastos dedutíveis: %.2f%n", gastosDedutiveis);
            System.out.println("||RESUMO||:");
            System.out.printf("Imposto bruto total: %.2f%n", impostoBrutoTotal);
            System.out.printf("Abatimento: %.2f%n", calcularAbatimento());
            System.out.printf("Imposto devido: %.2f%n", calcularImpostoDevido());
        }
    
}
