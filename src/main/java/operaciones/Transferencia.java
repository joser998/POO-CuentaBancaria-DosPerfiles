package operaciones;
import java.util.Scanner;
public class Transferencia extends CuentaBancaria{
    Scanner sc  = new Scanner (System.in);
    boolean bandera;
    public void Transferencia() {
        do {
            bandera = false;
            System.out.println("¿Cuanto dinero deseas transferir a segunda cuenta?");
            int transferencia = sc.nextInt();
            if (transferencia > getSaldo() || transferencia < 0) {
                bandera = true;
                System.out.println("Cantidad no valida, intente nuevamente.\n");
            } else {
                setSaldo2(transferencia);
                setSaldo(getSaldo() - transferencia);
                System.out.println("\nSaldo actual segunda cuenta: " + getSaldo2());
            }
        } while (bandera != false);
    }          
}