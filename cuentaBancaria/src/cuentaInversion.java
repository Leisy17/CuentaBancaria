public class cuentaInversion extends cuentaBancaria {
    private double tasa;
    private int plazo;
    private double penalizacion;

    public cuentaInversion(String titular, double saldo, String numeroCuenta, double tasa, int plazo, double penalizacion) {
        super(titular, saldo, numeroCuenta);
        this.tasa = tasa;
        this.plazo = plazo;
        this.penalizacion = penalizacion;
    }
    @Override
    public String describir() {
        return super.describir() + " Plazo: " + plazo + " meses, Tasa anual: " + tasa + "%";
    }

    @Override
    public double calcularComision() {
        return penalizacion;
    }

    @Override
    public void realizarRetiro(double monto) {
        double total = monto + penalizacion;
        setSaldo(getSaldo() - total);
    }

    public double calcularComision(int mesesTranscurridos) {
        if (mesesTranscurridos >= plazo) {
            return 0.0;
        }
        return penalizacion;
    }
}
