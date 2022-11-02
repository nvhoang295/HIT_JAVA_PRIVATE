import java.util.Scanner;

public class ex1 {

  static void Solver() {
    int n = new Scanner(System.in).nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = new Scanner(System.in).nextInt();
      b[a[i]]++;
    }
    for (int i = 0; i < n; i++) {
      if (b[a[i]] != 0) {
        System.out.println(a[i] + " " + b[a[i]]);
        b[a[i]] = 0;
      }
    }
  }

  public static void main(String[] args) {
    Solver();
  }
}
