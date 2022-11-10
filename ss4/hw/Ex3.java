import java.util.Scanner;

public class Ex3 {

  static void solve() {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int sum = 0, cnt = 0;
    for (int i = 0; i < s.length(); i++) {
      if (Character.isDigit(s.charAt(i))) {
        sum += (s.codePointAt(i) - 48);
        ++cnt;
      }
    }
    if (cnt == 0) {
      System.out.println("false");
    } else {
      System.out.printf("true\n%.3f", sum * 1.0 / cnt);
    }
  }

  public static void main(String[] args) {
    solve();
  }
}
