public class ex2 {

  public static int read() {
    return (new java.util.Scanner(System.in).nextInt());
  }

  public static void main(String[] args) {
    int a = read();
    int b = read();
    int c = read();
    int d = read();
    int max1, max2;
    max1 = max2 = a;
    if (b > max1) {
      max2 = max1;
      max1 = b;
    } else if (b > max2) {
      max2 = b;
    }
    if (c > max1) {
      max2 = max1;
      max1 = c;
    } else if (c > max2) {
      max2 = c;
    }
    if (d > max1) {
      max2 = max1;
      max1 = d;
    } else if (d > max2) {
      max2 = d;
    }
    if (max1 > max2) {
      System.out.println(max2);
    } else {
      System.out.println("Không tồn tại số lớn thứ hai");
    }
  }
}
