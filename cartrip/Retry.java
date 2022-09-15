package oop.homework1.cartrip;

import java.util.Scanner;

public class Retry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập só lượng chuyến xe ngoại thành :");
        int inputNumberSuburban = scanner.nextInt();
        System.out.println("Nhập só lượng chuyến xe nội thành :");
        int inputNumberInner = scanner.nextInt();
        SuburbanCarTrip[] suburbanCarTrip;
        InnerCarTrip[] innerCarTrip;
        double totalRevenueSub = 0;
        double totalRevenueInn = 0;
        suburbanCarTrip = new SuburbanCarTrip[inputNumberSuburban];
        innerCarTrip = new InnerCarTrip[inputNumberInner];

        System.out.println("Nhập thông tin các chuyến ngoại thành :");
        for (int i = 0;i < suburbanCarTrip.length; i++) {
            System.out.println("Chuyến ngoại thành thứ " + (i + 1));
            suburbanCarTrip[i] = new SuburbanCarTrip();
            suburbanCarTrip[i].input();
        }
        System.out.println("---------------------------------------");
        System.out.println("Nhập thông tin các chuyến nội thành :");
        for (int i = 0;i < innerCarTrip.length; i++) {
            System.out.println("Chuyến nội thành thứ " + (i + 1));
            innerCarTrip[i] = new InnerCarTrip();
            innerCarTrip[i].input();
        }
        System.out.println("Xe ngoại thành");
        for (SuburbanCarTrip element : suburbanCarTrip) {
            System.out.println(element);
            totalRevenueSub += element.getRevenue();
        }
        System.out.println("----------------");
        System.out.println("Xe nội thành");
        for (InnerCarTrip element : innerCarTrip) {
            System.out.println(element);
            totalRevenueInn += element.getRevenue();
        }
        System.out.println();
        System.out.print("Tổng doanh thu của các xe ngoại thành là : " + totalRevenueSub);
        System.out.print("\nTổng doanh thu của các xe nội thành là : " + totalRevenueInn);
    }
}
