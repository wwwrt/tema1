import java.util.Scanner;

public class qpb20 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduceti un numar: ");
    int n = sc.nextInt();
    int original = n;
    int reversed = 0;
    while(n > 0) {
        int digit = n % 10;
        reversed = reversed * 10 + digit;
        n /= 10;
    }
    if(original == reversed) {
        System.out.println(original + " este un numar palindrom.");
    } else {
        System.out.println(original + " nu este un numar palindrom.");
    }
}
}
