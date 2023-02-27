import java.util.Scanner;

public class pb7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
       
        double s=0;

        for (int i = 1; i <= n; i++) {
        	s=s+i;
            
        }
        double media = s/n;
        System.out.println("Media aritmetica a primelor " + n + " numere este " + media);
    }
}
