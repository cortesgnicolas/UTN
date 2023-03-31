import java.util.Scanner;

public class clase3ej8 {
    public static void main(String[] args){

        System.out.println("Ingrese la cantidad de cm a convertir");

        Scanner scanner = new Scanner(System.in);

        int cm = scanner.nextInt();

        double pulg = cm * 0.39737;

        System.out.println(""+cm+" cm equivale a "+""+pulg+" pulgadas");

    }
}
