import java.util.Scanner;

public class qpb17{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Introduceti un numar: ");
      int n = sc.nextInt();
      int maxDigit = 0;
      while(n > 0) {
          int digit = n % 10;
          if(digit > maxDigit) {
              maxDigit = digit;
          }
          n /= 10;
      }
      System.out.println("Cifra maxima a numarului este: " + maxDigit);
  }
}