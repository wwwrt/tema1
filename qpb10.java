public class qpb10 {
  public static void main(String[] args) {
    int n = 1001;
    while (!isPrime(n)) {
      n++;
    }
    System.out.println("Cel mai mic numar prim mai mare ca 1000 este: " + n);
  }

  public static boolean isPrime(int n) {
    if (n <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
