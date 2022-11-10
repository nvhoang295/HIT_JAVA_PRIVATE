import java.util.Scanner;
import java.util.ArrayList;

public class Ex4 {

  static String removeDigit(String s) {
    String res = "";
    for (int i = 0; i < s.length(); i++) {
      if (!Character.isDigit(s.charAt(i))) {
        res += s.charAt(i);
      }
    }
    return res;
  }

  static ArrayList removeNumerousSpace(String s) {
    ArrayList<String> al = new ArrayList<>();
    int j = 0;
    String tmp = "";
    while (j < s.length()) {
      if (s.charAt(j) != ' ') {
        tmp += s.charAt(j);
        if (j == s.length() - 1) {
          al.add(tmp);
        }
        j++;
      } else {
        if (tmp != "") {
          al.add(tmp);
        }
        tmp = "";
        j++;
        continue;
      }
    }
    return al;
  }

  static String capitalizeWords(String s) {
    s = s.substring(0, 1).toUpperCase() + s.substring(1, s.length());
    return s;
  }

  static void solve() {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String res = "";
    ArrayList<String> al = new ArrayList<>();
    s = s.trim().toLowerCase();
    res = removeDigit(s);
    al = removeNumerousSpace(res);
    for (int i = 0; i < al.size(); i++) {
      String tmp = capitalizeWords(al.get(i));
      al.set(i, tmp);
      System.out.print(al.get(i) + " ");
    }
  }

  public static void main(String[] args) {
    solve();
  }
}
