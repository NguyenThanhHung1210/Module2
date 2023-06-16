package vonglap.bai_tap.hien_thi_cac_loai_hinh;

import java.util.Scanner;

public class HienThiCacLoaiHinh3 {
    static Scanner sc = new Scanner(System.in);
    public static void isoscelesTriangle(){
        int canh;
        System.out.print("nhập chiều canh: ");
        canh = sc.nextInt();
        for (int i = canh; i >= 1 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        isoscelesTriangle();
    }
}
