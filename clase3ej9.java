import java.util.Scanner;

public class clase3ej9 {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de hombres cursando:");

        int cantH = scanner.nextInt();

        System.out.println("Ingrese la cantidad de mujeres cursando:");

        int cantM = scanner.nextInt();

        double promH = (cantH/3);

        double promM = (cantM/3);

        double porcH = ((cantH*100)/(cantH + cantM));

        double porcM = ((cantM*100)/(cantH + cantM));

        System.out.println("Promedio de hombres: "+promH+"\nPromedio de mujeres: "+promM);

        System.out.println("Porcentaje de hombres: "+porcH+"%"+"\nPorcentaje de mujeres: "+porcM+"%");

    }
}
