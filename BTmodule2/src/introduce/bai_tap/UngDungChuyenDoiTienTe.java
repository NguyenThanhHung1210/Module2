package introduce.bai_tap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Số Tiền Cần Đổi : ");
        usd = sc.nextDouble();
        double result = usd * vnd ;
        System.out.print("Số Tiền Sau Khi Đổi Là : " +result + "VNĐ ");
    }
}
