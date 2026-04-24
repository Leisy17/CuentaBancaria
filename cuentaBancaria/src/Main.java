public class Main {
    public static void main(String[] args) {

        cuentaBancaria c1 = new cuentaAhorros("Ana",1000000, "001", 5.0, 200000);
        System.out.println(c1.describir());
        System.out.println("C1: " + c1.calcularComision());
        c1.realizarRetiro(500000.0);
        System.out.println("Saldo C1: " + c1.getSaldo());
        cuentaBancaria c2 = new cuentaCorriente("Luis", 500000, "002", 300000, 3000);
        System.out.println(c2.describir());
        System.out.println("C2: " + c2.calcularComision());
        c2.realizarRetiro(500000.0);
        System.out.println("Saldo C2: " + c2.getSaldo());
        cuentaBancaria c3 = new cuentaInversion("Maria", 2000000,"003", 2.5, 12, 2.5);
        System.out.println(c3.describir());
        System.out.println("C3: " + c3.calcularComision());
        c3.realizarRetiro(500000.0);
        System.out.println("Saldo C3: " + c3.getSaldo());

        /*
        usar cuentaBancaria permite aplicar polimorfismo.
        La ventaja es que puedo tratar todas las cuentasde la misma forma, aunque cada una ejecuta su propio comportamiento real.
        Esto hace el código más flexible y extensible.
        */
    }
}