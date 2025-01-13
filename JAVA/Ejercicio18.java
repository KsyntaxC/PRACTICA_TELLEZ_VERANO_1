import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Intro N: ");
        int N = sc.nextInt();
        while (N >= 0) {
            if (N % 5 == 0) {
                System.out.print(N + ", ");
            }
            N -= 1;
        }
    }
}