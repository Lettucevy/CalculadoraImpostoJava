class Imposto {
    private double rendaSalarioAnual;
    private double rendaServicosAnual;
    private double rendaCapitalAnual;
    private double gastosMedicos;
    private double gastosEducacionais;

    public Imposto(double rendaSalarioAnual, double rendaServicosAnual, double rendaCapitalAnual, double gastosMedicos, double gastosEducacionais) {
        this.rendaSalarioAnual = rendaSalarioAnual;
        this.rendaServicosAnual = rendaServicosAnual;
        this.rendaCapitalAnual = rendaCapitalAnual;
        this.gastosMedicos = gastosMedicos;
        this.gastosEducacionais = gastosEducacionais;
    }

    public double getRendaSalarioAnual() {
        return rendaSalarioAnual;
    }

    public double getRendaServicosAnual() {
        return rendaServicosAnual;
    }

    public double getRendaCapitalAnual() {
        return rendaCapitalAnual;
    }

    public double getGastosMedicos() {
        return gastosMedicos;
    }

    public double getGastosEducacionais() {
        return gastosEducacionais;
    }
}
