import java.util.Scanner;

public class tmp {

  static double p(int r) {
    return Math.PI * r * 2;
  }

  static double a(int r) {
    return r * Math.pow(Math.PI, 2);
  }

  static void solver() {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    System.out.println("Chu vi hình tròn: " + p(r));
    System.out.println("Diện tích hình tròn: " + a(r));
  }

  public static void main(String[] args) {
    solver();
  }
}
