import java.util.Scanner;

public class pb9{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduceti un numar: ");
    int n = scanner.nextInt();
    boolean isPrime = true;
    if (n > 1) {
      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
          isPrime = false;
          break;
        }
      }
    } else {
      isPrime = false;
    }
    if (isPrime) {
      System.out.println(n + " este un numar prim.");
    } else {
      System.out.println(n + " nu este un numar prim.");
    }
  }
}
