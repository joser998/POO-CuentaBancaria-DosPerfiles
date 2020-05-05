package operaciones;
import java.util.Scanner;
public class Reintegro extends CuentaBancaria{
    Scanner sc = new Scanner (System.in);
    boolean bandera;
    public void Reintegro(){
        
        bandera=false;
        System.out.println("¿Cuanto dinero deseas sacar?");
        int reintegro=sc.nextInt();
        if(reintegro < 0    || reintegro > getSaldo()){
            bandera=true;
            System.out.println("Cantidad no valida, intente nuevamente.\n");
        }else{
            setSaldo(getSaldo()  - reintegro);
            System.out.println("Tu Saldo actual es: "+getSaldo());
        }
        
        
        
        
        
        
        
        
        
    }
}
