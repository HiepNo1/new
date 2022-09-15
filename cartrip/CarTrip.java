package oop.homework1.cartrip;

import java.util.Scanner;

public abstract class CarTrip {
    private int id;
    private String nameDriver;
    private String licensePlate;
    private double revenue;

    static Scanner scanner = new Scanner(System.in);
    public CarTrip() {
    }
    public CarTrip(int id, String nameDriver, String licensePlate, double revenue) {
        this.id = id;
        this.nameDriver = nameDriver;
        this.licensePlate = licensePlate;
        this.revenue = revenue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameDriver() {
        return nameDriver;
    }

    public void setNameDriver(String nameDriver) {
        this.nameDriver = nameDriver;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public static void setScanner(Scanner scanner) {
        CarTrip.scanner = scanner;
    }

    public abstract void input();
    public void inputCommon() {
        System.out.println("Nhập mã chuyến xe :");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tên tài xé :");
        nameDriver = scanner.nextLine();
        System.out.println("Nhập biển số xe :");
        licensePlate = scanner.nextLine();
        System.out.println("Nhập doanh thu :");
        revenue = scanner.nextDouble();
    }
    public String toString() {
        return "Id: " + this.id + ", Name driver: " + this.nameDriver
                + ", License Plate: " + this.licensePlate + ", revenue: " + this.revenue;
    }
}
