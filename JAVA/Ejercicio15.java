import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Intro N: ");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            } else {
                System.out.print((i * -1) + ", ");
            }
        }
    }
}