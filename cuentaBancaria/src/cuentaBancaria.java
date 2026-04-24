public class cuentaBancaria {
    private String titular;
    private double saldo;
    private String numeroCuenta;

    public cuentaBancaria() {
    }

    public cuentaBancaria(String titular, double saldo, String numeroCuenta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String describir() {
        return "Cuenta " + numeroCuenta + " Titular: " + titular + " Saldo: $" + saldo;
    }

    public double calcularComision() {
        return 0.0;
    }

    public void realizarRetiro(double monto) {
        setSaldo(getSaldo() - monto);
    }
}
