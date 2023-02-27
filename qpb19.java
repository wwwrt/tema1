import java.util.Scanner;

public class qpb19{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Introduceti un numar: ");
      int n = sc.nextInt();
      int reversed = 0;
      while(n > 0) {
          int digit = n % 10;
          reversed = reversed * 10 + digit;
          n /= 10;
      }
      System.out.println("Inversul numarului este: " + reversed);
  }
}