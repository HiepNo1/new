package oop.homework1.cartrip;

public class InnerCarTrip extends CarTrip {
    private int routeNumber;
    private double totalKm;
    public InnerCarTrip() {

    }

    public InnerCarTrip(int routeNumber, double totalKm) {
        this.routeNumber = routeNumber;
        this.totalKm = totalKm;
    }

    public InnerCarTrip(int id, String nameDriver, String licensePlate, double revenue, int routeNumber, double totalKm) {
        super(id, nameDriver, licensePlate, revenue);
        this.routeNumber = routeNumber;
        this.totalKm = totalKm;
    }

    public int getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(int routeNumber) {
        this.routeNumber = routeNumber;
    }

    public double getTotalKm() {
        return totalKm;
    }

    public void setTotalKm(double totalKm) {
        this.totalKm = totalKm;
    }
    @Override
    public void input() {
        super.inputCommon();
        System.out.println("Nhập số tuyến : ");
        routeNumber = scanner.nextInt();
        System.out.println("Nhập số km đi được : ");
        totalKm = scanner.nextDouble();
    }

    @Override
    public String toString() {
        return super.toString() + ", Route number: " +this.routeNumber + ", Total km: " + this.totalKm;
    }
}
