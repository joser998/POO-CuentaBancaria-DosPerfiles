package operaciones;
import java.util.Scanner;
public class Ingreso extends CuentaBancaria{
    Scanner sc = new Scanner (System.in);
    boolean bandera;
    public void Ingreso(){
        
        do{
            bandera=false;
        System.out.println("¿Cuanto dinero deseas ingresar?");
        int ingreso=sc.nextInt();
        if(ingreso < 0){
            bandera=true;
            System.out.println("Cantidad no valida, intente nuevamente.\n");
        }else{
            setSaldo(getSaldo() + ingreso);
            System.out.println("\nTu Saldo actual es: "+getSaldo());
        }
        }while(bandera!=false);
    }
}
