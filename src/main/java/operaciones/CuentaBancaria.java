package operaciones;

public class CuentaBancaria {
    private String nombre, numeroCuenta;
    private static double interes, saldo;
    
    private static double interes2, saldo2;
    
    public CuentaBancaria(){
    }

    public CuentaBancaria(String nombre, String numeroCuenta) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
    }

    
    public static double getInteres2() {
        return interes2;
    }
    public static void setInteres2(double interes2) {
        CuentaBancaria.interes2 = interes2;
    }
    public static double getSaldo2() {
        return saldo2;
    }
    public static void setSaldo2(double saldo2) {
        CuentaBancaria.saldo2 = saldo2;
    }
    public static double getInteres() {
        return interes;
    }
    public static void setInteres(double interes) {
        CuentaBancaria.interes = interes;
    }
    public static double getSaldo() {
        return saldo;
    }
    public static void setSaldo(double saldo) {
        CuentaBancaria.saldo = saldo;
    }
    
}