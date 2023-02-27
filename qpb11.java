import java.util.Scanner;

public class qpb11{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti un numar: ");
        int n = sc.nextInt();
        System.out.print("Divizorii numarului " + n + " sunt: ");
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}