/*
Escribe una clase Cuenta para representar una cuenta bancaria. Los datos de la cuenta son: 
nombre del cliente (String), número de cuenta (String), tipo de interés (double) y saldo (double).
La clase contendrá los siguientes métodos:
Constructor por defecto
Constructor con todos los parámetros
Constructor copia.
Métodos setters/getters para asignar y obtener los datos de la cuenta.
Métodos ingreso y reintegro. Un ingreso consiste en aumentar el saldo en la cantidad que se indique. 
Esa cantidad no puede ser negativa. 
Un reintegro consiste en disminuir el saldo en una cantidad pero antes se debe comprobar que hay saldo suficiente. 
La cantidad no puede ser negativa. Los métodos ingreso y reintegro devuelven true si la operación se ha podido realizar 
o false en caso contrario.
Método transferencia que permita pasar dinero de una cuenta a otra siempre que en la cuenta de origen haya dinero 
suficiente para poder hacerla. Ejemplo de uso del método transferencia:
cuentaOrigen.transferencia(cuentaDestino, importe);
que indica que queremos hacer una transferencia desde cuentaOrigen a cuentaDestino del importe indicado.   */
package control;
import java.util.Scanner;
import operaciones.CuentaBancaria;
import operaciones.Ingreso;
import operaciones.SaldoActual;
import operaciones.Reintegro;
import operaciones.Transferencia;
import operaciones.SaldoCuenta2;
public class Control {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int opc=0;
        String nombre, numeroCuenta;
        double interes, saldo;
        
        String nombre2, numeroCuenta2;
        double interes2, saldo2;
        
        CuentaBancaria ob = new CuentaBancaria();
        
        System.out.println("Bievenido a Cuenta Bancaria.");
        System.out.println("\nDatos Perfil Bancario: 1\n");
        System.out.print("Nombre: ");
        nombre=sc.nextLine();
        System.out.print("No. Cuenta: ");
        numeroCuenta=sc.nextLine();
        System.out.print("Interes: ");
        interes=sc.nextDouble();
        System.out.print("Saldo: ");
        saldo=sc.nextDouble();
        ob.setSaldo(saldo);     //para establecer el saldo como estatico
        
        
        System.out.println("\nCuenta Bancaria Extra\n");
        System.out.print("Nombre: ");
        sc.nextLine();
        nombre2=sc.nextLine();
        System.out.print("No. Cuenta: ");
        numeroCuenta2=sc.nextLine();
        System.out.print("Interes: ");
        interes2=sc.nextDouble();
        System.out.print("Saldo: ");
        saldo2=sc.nextDouble();
        ob.setSaldo2(saldo2);   //para establecer el saldo como estatico
        
        System.out.println("Datos Guardados Correctamente...");
        
        do{
            System.out.println("\nSelecciona una Opcion: \n"
                    + "1.-Saldo Actual.\n"
                    + "2.-Ingreso.\n"
                    + "3.-Reintegro.\n"
                    + "4.-Transferencia.\n"
                    + "5.-Saldo Actual Segunda Cuenta.\n"
                    + "6.-Salir.\n");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                        SaldoActual ob3 = new SaldoActual();
                        ob3.Actual();
                    break;
                case 2:
                        Ingreso ob2 = new Ingreso();
                        ob2.Ingreso();
                    break;
                case 3:
                        Reintegro ob4 = new Reintegro();
                        ob4.Reintegro();
                    break;
                case 4:
                        Transferencia ob5 = new Transferencia ();
                        ob5.Transferencia();
                    break;
                case 5:
                        SaldoCuenta2 ob6 = new SaldoCuenta2();
                        ob6.SaldoSegundaCuenta();
                    break;
                case 6:
                    System.out.println("Fin del Programa.\n");
                    break;
                default:
                    System.out.println("Opcion no valida, intenta nuevamente.\n");
            }
        } while (opc != 6);
    }
}
