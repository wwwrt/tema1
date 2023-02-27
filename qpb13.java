import java.util.Scanner;

public class qpb13{
  public static void main(String[] args) {
	  System.out.print("Perechile de numere care satisfac cerinta sunt: ");
      for(int i = 17; i < 1000; i += 17) {
          if((1000 - i) % 19 == 0) {
              System.out.print("(" + i + ", " + (1000 - i) + ") ");
          }
      }
  }
}