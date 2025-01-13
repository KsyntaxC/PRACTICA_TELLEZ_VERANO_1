import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del archivo en Megabytes: ");
        int T = sc.nextInt();
        System.out.print("Ingrese la velocidad de descarga en megabits por segundo: ");
        int V = sc.nextInt();
        int Tm = (T * 8) / V;
        int m = Tm / 60;
        int s = Tm % 60;
        System.out.println("El tiempo de descarga será de " + m + " minutos y " + s + " segundos");
    }
}
