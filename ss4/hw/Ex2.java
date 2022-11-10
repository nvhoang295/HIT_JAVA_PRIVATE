import java.util.Scanner;

public class Ex2 {

  static String findLongestSubString(String s) {
    String res = "";
    int cnt = 0, rec = 0, recIdx = -1;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != ' ') {
        ++cnt;
        if (cnt > rec) {
          rec = cnt;
          recIdx = i;
        }
      } else {
        cnt = 0;
      }
    }
    res = s.substring(rec - recIdx - 1, rec);
    return res;
  }

  static void solve() {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    s2 = findLongestSubString(s2);
    System.out.println(s1.contains(s2) ? s2.length() : 0);
  }

  public static void main(String[] args) {
    solve();
  }
}
