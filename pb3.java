import java.util.Scanner;

public class pb3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numar1 = scanner.nextInt();
        int numar2 = scanner.nextInt();
        
        if (numar1 % 2 == 0 && numar2 % 2 ==0) {
        	System.out.println((numar1+numar2)/2);
        } else if (numar1 % 2 !=0 && numar2 % 2 != 0) {
        	System.out.println(numar1*numar2);
        } else if ((numar1 % 2 == 0 && numar2 % 2 !=0) || (numar1 % 2 != 0 && numar2 % 2 == 0)) {
        	System.out.println(numar1+numar2);
        }
    }
    }