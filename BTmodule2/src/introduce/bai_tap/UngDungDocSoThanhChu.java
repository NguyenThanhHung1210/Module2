package introduce.bai_tap;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Số cần đọc: ");
        int donVi;
        int chuc;
        int tram;
        int soCanDoc = Integer.parseInt(number.nextLine());
        if (soCanDoc >= 0 && soCanDoc < 10) {
            getGiaTriDonVi(soCanDoc);
        } else if (soCanDoc < 20) {
            soCanDoc = soCanDoc % 10;
            switch (soCanDoc) {
                case 0:
                    System.out.print("ten");
                    break;
                case 1:
                    System.out.print("eleven");
                    break;
                case 2:
                    System.out.print("twelf");
                    break;
                case 3:
                    System.out.print("Thirteen");
                    break;
                case 4:
                    System.out.print("fourteen");
                    break;
                case 5:
                    System.out.print("fifteen");
                    break;
                case 6:
                    System.out.print("sixteen");
                    break;
                case 7:
                    System.out.print("seventeen");
                    break;
                case 8:
                    System.out.print("eighteen");
                    break;
                case 9:
                    System.out.print("nineteen");
                    break;
            }
        } else if (soCanDoc < 100) {
            donVi = soCanDoc % 10;
            chuc = soCanDoc / 10;
            getGiaTriChuc(chuc);
            System.out.print(" ");
            getGiaTriDonVi(donVi);
        } else if (soCanDoc < 1000) {
            tram = soCanDoc / 100 ;
            chuc = (soCanDoc / 10)%10;
            donVi = soCanDoc % 10;
            getGiaTriTram(tram);
            System.out.print(" and ");
            getGiaTriChuc(chuc);
            System.out.print(" ");
            getGiaTriDonVi(donVi);
        }else {
            System.out.println("out of ability");
        }
    }

    public static void getGiaTriDonVi(int number) {
        switch (number) {
            case 1:
                System.out.print("one");
                break;
            case 2:
                System.out.print("two");
                break;
            case 3:
                System.out.print("three");
                break;
            case 4:
                System.out.print("four");
                break;
            case 5:
                System.out.print("five");
                break;
            case 6:
                System.out.print("six");
                break;
            case 7:
                System.out.print("seven");
                break;
            case 8:
                System.out.print("eight");
                break;
            case 9:
                System.out.print("nine");
                break;
        }
    }

    public static void getGiaTriChuc(int number) {
        switch (number) {
            case 2:
                System.out.print("twenty");
                break;
            case 3:
                System.out.print("thirty");
                break;
            case 4:
                System.out.print("forty");
                break;
            case 5:
                System.out.print("fifty");
                break;
            case 6:
                System.out.print("sixty");
                break;
            case 7:
                System.out.print("seventy");
                break;
            case 8:
                System.out.print("eighty");
                break;
            case 9:
                System.out.print("ninety");
                break;
        }

    }

    public static void getGiaTriTram(int number) {
        switch (number) {
            case 1:
                System.out.print("one hundred");
                break;
            case 2:
                System.out.print("two hundred");
                break;
            case 3:
                System.out.print("three hundred");
                break;
            case 4:
                System.out.print("four hundred");
                break;
            case 5:
                System.out.print("five hundred");
                break;
            case 6:
                System.out.print("six hundred");
                break;
            case 7:
                System.out.print("seven hundred");
                break;
            case 8:
                System.out.print("eight hundred");
                break;
            case 9:
                System.out.print("nine hundred");
                break;
        }
    }
}
