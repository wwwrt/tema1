import java.util.Scanner;

public class pb6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int s = 0;
        for (int i = 1; i <= 2*n-1; i=i+2) {
            s = s+i;
        }

        System.out.println("Suma primelor " + n + " numere impare este " + s);
    }
}
