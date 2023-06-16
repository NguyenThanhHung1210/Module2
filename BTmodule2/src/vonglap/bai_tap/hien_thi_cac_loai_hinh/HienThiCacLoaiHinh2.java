package vonglap.bai_tap.hien_thi_cac_loai_hinh;

import java.util.Scanner;

public class HienThiCacLoaiHinh2 {
    static Scanner sc = new Scanner(System.in);
    public static void squaretriangle(){
        int canh;
        System.out.print("Nhập cạnh của tam giác vuông: ");
        canh = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= canh ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(" * ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        squaretriangle();
    }
}
