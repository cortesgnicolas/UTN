import java.util.Locale;
import java.util.Scanner;

public class Clase3_act_2 {

    public static void main(String[]args){
        double Urgencias,Pediatria,Traumatologia,Presupuesto;
        Scanner leer = new Scanner(System.in);
                System.out.println("Ingrese el presupuesto anual");
        Presupuesto=leer.nextDouble();

        Urgencias=(Presupuesto*0.37);
        Pediatria=(Presupuesto*0.42);
        Traumatologia=(Presupuesto*0.21);

        System.out.print("El area de Urgencias se queda con $"+Urgencias+" del presupuesto, el area de Pediatria se lleva el $"+Pediatria+" y el area de traumatología se queda con $"+Traumatologia);
    }
}
