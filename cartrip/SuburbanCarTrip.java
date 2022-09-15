package oop.homework1.cartrip;

public class SuburbanCarTrip extends CarTrip {
    private String destination;
    private double dayNumber;
    public SuburbanCarTrip() {

    }

    public SuburbanCarTrip(String destination, double dayNumber) {
        this.destination = destination;
        this.dayNumber = dayNumber;
    }

    public SuburbanCarTrip(int id, String nameDriver, String licensePlate, double revenue, String destination, double dayNumber) {
        super(id, nameDriver, licensePlate, revenue);
        this.destination = destination;
        this.dayNumber = dayNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(double dayNumber) {
        this.dayNumber = dayNumber;
    }
    @Override
    public void input() {
        super.inputCommon();
        System.out.println("Nhập địa điểm đến : ");
        destination = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Nhập số ngày đi được : ");
        dayNumber = scanner.nextDouble();
    }

    @Override
    public String toString() {
        return super.toString() + ", Destination: " + this.destination + ", Day Number: " + this.dayNumber;
    }
}
