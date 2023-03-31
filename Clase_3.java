import java.util.Locale;
import java.util.Scanner;

public class Clase_3 {
    public static void main(String arg[]){
        int Precio=45;
        double Distancia,Resultado;

        Scanner leer = new Scanner (System.in);
        System.out.println("Escriba a distancia que esta por recorrer, se cobrara 45$ pero según la distancia este monto se multiplicara.");
        Distancia=leer.nextDouble();

        Resultado=Precio*Distancia;

                System.out.print("Usted debe pagar: $"+Resultado);
    }
}
