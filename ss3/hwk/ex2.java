import java.util.Scanner;
import java.util.ArrayList;

public class ex2 {
  static void Solver() {
    ArrayList<Integer> a = new ArrayList<Integer>();
    int max = (int) -1e9;
    int n = new Scanner(System.in).nextInt();
    int tmp = n;
    while (n-- > 0) {
      int x = new Scanner(System.in).nextInt();
      a.add(x);
      if (max < x) {
        max = x;
      }
    }
    if (max == tmp) {
      System.out.println("YES");
    } else {
      int[] b = new int[max];
      for (int i = 0; i < max; i++) {
        b[i] = i + 1;
      }
      int i = 0, j = 0;
      while (i < a.size() && j < b.length) {
        if (a.get(i) < b[j]) {
          i++;
        } else if (a.get(i) > b[j]) {
          System.out.println(b[j] + " ");
          j++;
        } else {
          i++;
          j++;
        }
      }
    }
  }

  public static void main(String[] args) {
    Solver();
  }
}
