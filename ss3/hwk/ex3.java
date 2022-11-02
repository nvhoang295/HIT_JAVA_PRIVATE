import java.util.Scanner;

public class ex3 {

  static void Solver() {
    int n = new Scanner(System.in).nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = new Scanner(System.in).nextInt();
    }
    int rec = 0, cnt = 1;
    for (int i = 0; i < n - 1; i++) {
      if (arr[i] <= arr[i + 1]) {
        ++cnt;
      } else if (arr[i] > arr[i + 1]) {
        cnt = 1;
      }
      if (cnt > rec) {
        rec = cnt;
      }
    }
    System.out.println(rec);
  }

  public static void main(String[] args) {
    Solver();
  }
}
