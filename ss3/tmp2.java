import java.util.Scanner;

public class tmp2 {

  public static void input(int[] arr, int n) {
    for (int i = 0; i < n; i++) {
      arr[i] = new Scanner(System.in).nextInt();
    }
  }

  public static void output(int[] arr, int n) {
    for (int i = 0; i < n; i++) {
      System.out.printf("arr[%d]= %d   ", i, arr[i]);
    }
  }

  // khởi tạo mảng mới để trả về
  public static int[] insert(int[] arr, int pos, int val, int n) {
    int[] arr2 = new int[arr.length + 1];

    return arr2;
  }

  // không có tham chiếu tham trị thì ko giảm được kích thước n của mảng, vậy nên
  // bắt buộc phải copy ra một mảng mới
  // mọi đối tượng trong java đều hiểu là string, nên phải dùng dấu enter thay vì
  // dấu cách
  // Java không có con trỏ, ko có tham chiếu, tham trị
  public static void main(String[] args) {
    int n = new Scanner(System.in).nextInt();
    int[] arr = new int[n];
    input(arr, n);
    output(arr, n);
  }

}
