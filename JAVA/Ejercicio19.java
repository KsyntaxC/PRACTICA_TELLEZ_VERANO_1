import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Intro n: ");
        int n = sc.nextInt();
        int p = 2;
        for (int i = 1; i <= n; i++) {
            System.out.print(p + ", ");
            p++;
            int sw = 0;
            while (sw == 0) {
                int s = 1;
                int c2 = 0;
                while (s <= p) {
                    if (p % s == 0) {
                        c2++;
                    }
                    s++;
                }
                if (c2 == 2) {
                    sw = 1;
                    c2 = 0;
                } else {
                    p++;
                }
            }
        }
    }
}
