import java.util.Scanner;

public class qpb15{
  public static void main(String[] args) {
      System.out.print("Numerele de forma 3a2b care se divid cu 9 sunt: ");
      for(int a = 0; a <= 9; a++) {
          for(int b = 0; b <= 9; b++) {
              int number = 3000 + a * 100 + b * 10;
              if(number % 9 == 0) {
                  System.out.print(number + " ");
              }
          }
      }
  }
}