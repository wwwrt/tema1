import java.util.Scanner;

public class qpb18{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Introduceti un numar: ");
      int n = sc.nextInt();
      int minDigit = 9;
      while(n > 0) {
          int digit = n % 10;
          if(digit < minDigit) {
              minDigit = digit;
          }
          n /= 10;
      }
      System.out.println("Cifra minima a numarului este: " + minDigit);
  }
}