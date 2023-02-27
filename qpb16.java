import java.util.Scanner;

public class qpb16{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Introduceti un numar: ");
      int n = sc.nextInt();
      System.out.print("Cifrele numarului " + n + " sunt: ");
      while(n > 0) {
          int digit = n % 10;
          System.out.print(digit + " ");
          n /= 10;
      }
  }
}