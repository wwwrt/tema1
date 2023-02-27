import java.util.Scanner;

public class pb2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numar = scanner.nextInt();

        if (numar >= 1 && numar <= 5) {
            switch(numar) {
                case 1:
                    System.out.println("UNU");
                    break;
                case 2:
                    System.out.println("DOI");
                    break;
                case 3:
                    System.out.println("TREI");
                    break;
                case 4:
                    System.out.println("PATRU");
                    break;
                case 5:
                    System.out.println("CINCI");
                    break;
            }
        } else {
            System.out.println("INVALID");
        }
    }
}