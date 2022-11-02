import java.util.Scanner;

public class tmp {

  // [modifier] type [static] fncName(){}

  // return trong hàm void là kết thúc hàm

  // method: public

  // prop: private

  /*
   * modifier:
   * public: everywhere
   * default: cung package
   * private:
   */

  // ko cho static vào thì nó sẽ hiểu là đối tượng của một lớp

  // Khai báo hằng số: final

  // final Y = 3;

  public int tinhtong(int a, int b) {
    return a + b;
  }

  public static void input(int[] arr, int n) {
    for (int i = 0; i < n; i++) {
      arr[i] = new Scanner(System.in).nextInt();
    }
  }

  public static void output(int[] arr, int n) {
    for (int i = 0; i < n; i++) {
      System.out.printf("arr[%d]= ", arr[i]);
    }
  }

  public static void main(String[] args) {
    // int n = new Scanner(System.in).nextInt();
    // for (int i = 1; i < n; i++) {
    // if (i % 2 == 0)
    // ++n;
    // }
    // System.out.println(n);
    // }

    // khai bao
    int[] arr = new int[100];
    long[] arr2 = new long[200];

    int[] arr3 = new int[] { 2, 2, 3, 4, 5, 6 };

    // xuat mang
    for (int i = 0; i < arr3.length; i++) {
      System.out.println(arr3[i]);
    }

    // nhap mang
    for (int i = 0; i < arr.length; i++) {
      arr[i] = new Scanner(System.in).nextInt();
    }

    // for each
    for (long x : arr) {
      System.out.println(x);
    }

    // printf: dùng để xuất dữ liệu dạng bảng

  }

}
