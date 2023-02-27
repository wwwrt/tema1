import java.util.Scanner;

public class pb4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numar1 = scanner.nextInt();
        int numar2 = scanner.nextInt();
        int numar3 = scanner.nextInt();
        
        if ((numar1 < numar2) && (numar1 < numar3)) {
        	System.out.println(numar1);
        }
        
        else if ((numar2 < numar1) && (numar2 < numar3)) {
        	System.out.println(numar2);
        }
        
        else if ((numar3 < numar1) && (numar3 < numar2)) {
        	System.out.println(numar3);
        }
    }
   
}
        
    