import java.util.Scanner;

public class ex4 {

  static boolean isDigitPrime(int n) {
    int r = n % 10;
    while (n != 0) {
      if (r != 2 && r != 3 && r != 5 && r != 7)
        return false;
      n /= 10;
      r = n % 10;
    }
    return true;
  }

  static boolean isPrime(int n) {
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0)
        return false;
    }
    return true;
  }

  static void Solver() {
    int n = new Scanner(System.in).nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = new Scanner(System.in).nextInt();
    }
    int cnt = 0;
    for (int i = 0; i < n; i++) {
      if (isDigitPrime(a[i]) && isPrime(a[i])) {
        ++cnt;
        System.out.println(a[i] + " ");
      }
    }
    if (cnt == 0)
      System.out.println("NO");
  }

  public static void main(String[] args) {
    Solver();
  }
}
