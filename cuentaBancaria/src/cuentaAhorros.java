public class cuentaAhorros extends cuentaBancaria {
    double tasaInteres;
    private double saldoMinimo;

    public cuentaAhorros() {
    }

    public cuentaAhorros(String titular, double saldo, String numeroCuenta, double tasaInteres, double saldoMinimo) {
        super(titular, saldo, numeroCuenta);
        this.tasaInteres = tasaInteres;
        this.saldoMinimo = saldoMinimo;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }


    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    @Override
    public String describir() {
        return super.describir() + " Tasa mensual: " + tasaInteres + "%";
    }

    @Override
    public double calcularComision() {
        if (getSaldo() >= saldoMinimo) {
            return 0.0;
        }
        return 12000.0;
    }

    public void realizarRetiro(double monto, boolean esUrgente) {
        double nuevoSaldo = getSaldo() - monto;
        if (nuevoSaldo < 0) {
            System.out.println("No permitido: saldo insuficiente");
            return;
        }
        if (esUrgente && nuevoSaldo < saldoMinimo) {
            nuevoSaldo -= calcularComision();
        }

        setSaldo(nuevoSaldo);
    }

    public double calcularInteresMensual() {
        return getSaldo() * tasaInteres / 100;
    }
}
