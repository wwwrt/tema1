import java.util.Scanner;

public class qpb14{
  public static void main(String[] args) {
	  System.out.print("Perechile de numere care satisfac cerinta sunt: ");
      for(int i = 1; i <= 1000; i++) {
          if((i % 17 == 0 || i % 13 == 0) && (1000 - i) % 19 == 0 || (1000 - i) % 7 == 0) {
              System.out.print("(" + i + ", " + (1000 - i) + ") ");
          }
      }
  }
}