public class cuentaCorriente extends cuentaBancaria {
    double limiteSobregiro;
    double comisionPorTransaccion;

    public cuentaCorriente() {
    }

    public cuentaCorriente(String titular, double saldo, String numeroCuenta, double limiteSobregiro, double comisionPorTransaccion) {
        super(titular, saldo, numeroCuenta);
        this.limiteSobregiro = limiteSobregiro;
        this.comisionPorTransaccion = comisionPorTransaccion;
    }

    public double getLimiteSobregiro() {
        return limiteSobregiro;
    }

    public void setLimiteSobregiro(double limiteSobregiro) {
        this.limiteSobregiro = limiteSobregiro;
    }

    public double getComisionPorTransaccion() {
        return comisionPorTransaccion;
    }

    public void setComisionPorTransaccion(double comisionPorTransaccion) {
        this.comisionPorTransaccion = comisionPorTransaccion;
    }

    @Override
    public String describir() {
        return super.describir() + " Comisión por transacción: $" + comisionPorTransaccion;
    }

    @Override
    public double calcularComision() {
        return comisionPorTransaccion;
    }

    @Override
    public void realizarRetiro(double monto) {
        double saldoActual = getSaldo();
        double total = monto + comisionPorTransaccion;
        double nuevoSaldo = saldoActual - total;
        if (nuevoSaldo < -limiteSobregiro) {
            System.out.println("No puedes retirar, excede el sobregiro.");
            return;
        }

        setSaldo(nuevoSaldo);
    }
}
