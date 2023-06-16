package vonglap.bai_tap.hien_thi_cac_loai_hinh;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    static Scanner sc = new Scanner(System.in);

    public static void rectangle() {
        int dai;
        int rong;
        System.out.print("nhập chiều dài: ");
        dai = sc.nextInt();
        System.out.print("nhập chiều rộng: ");
        rong = sc.nextInt();
        for (int i = 1; i <= dai ; i++) {
            for (int j = 1; j <= rong ; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        rectangle();
    }

}
