import java.util.Scanner;

public class pb8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduceti un numar: ");
    int n = scanner.nextInt();
    int factorial = 1;
    for (int i = 1; i <= n; i++) {
      factorial *= i;
    }
    System.out.println("Factorialul numarului " + n + " este " + factorial);
  }
}
