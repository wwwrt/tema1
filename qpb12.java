import java.util.Scanner;

public class qpb12{
	public static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti un numar: ");
        int n = sc.nextInt();
        System.out.print("Divizorii primi ai numarului " + n + " sunt: ");
        for(int i = 2; i <= n; i++) {
            if(n % i == 0 && isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}