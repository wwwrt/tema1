import java.util.Scanner;

public class pb1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numar = scanner.nextInt();

        if (numar > 5 && numar <=10) {
            System.out.println("ADMIS");
        } else if (numar < 1 || numar > 10) {
            System.out.println("INVALID");
        } else {
            System.out.println("RESPINS");
        }
    }
}

