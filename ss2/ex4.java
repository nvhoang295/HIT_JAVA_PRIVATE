public class ex4 {

  public static boolean isSquareNumber(int n) {
    return Math.sqrt(n) * Math.sqrt(n) == n;
  }

  public static void main(String[] args) {
    int cnt = 0;
    int n;
    int[] a = new int[100];
    int idx = 0;
    do {
      n = new java.util.Scanner(System.in).nextInt();
      if (n <= 0) {
        System.out.println("Nhập lại n");
      }
    } while (n <= 0);
    while (n != 0) {
      int r = n % 10;
      if (isSquareNumber(r)) {
        ++cnt;
        a[idx++] = r;
      }
      n /= 10;
    }
    if (cnt == 0) {
      System.out.println("No");
    } else {
      for (int i = a.length - 1; i >= 0; i--) {
        if (a[i] != 0) {
          System.out.println(a[i] + " ");
        }
      }
    }
  }
}
