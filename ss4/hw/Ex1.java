import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Ex1 {

  static void solve() {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    HashMap<Character, Integer> hashMap = new HashMap<>();
    ArrayList<Character> arrayList = new ArrayList<>();
    s = s.toLowerCase();
    s = s.replaceAll(" ", "");
    for (int i = 0; i < s.length(); i++) {
      if (hashMap.containsKey(s.charAt(i))) {
        hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) + 1);
      } else {
        hashMap.put(s.charAt(i), 1);
        arrayList.add(s.charAt(i));
      }
    }
    for (char x : arrayList) {
      System.out.println(x + ": " + hashMap.get(x));
    }
  }

  public static void main(String[] args) {
    solve();
  }
}
