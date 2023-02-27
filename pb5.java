import java.util.Scanner;

public class pb5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int s = 0;
        for (int i = 2; i <= 2*n; i += 2) {
            s = s+i;
        }

        System.out.println("Suma primelor " + n + " numere pare este " + s);
    }
}
