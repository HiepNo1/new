package oop.subject;

public class SoftwareTechnology extends InformationTechnology {
    private double softwareTechnology;
    @Override
    public int calculateTuition() {
        return 2000;
    }

    public SoftwareTechnology() {
    }

    public SoftwareTechnology(double softwareTechnology) {
        this.softwareTechnology = softwareTechnology;
    }

    public SoftwareTechnology(int quantityYear, String name, double softwareTechnology) {
        super(quantityYear, name);
        this.softwareTechnology = softwareTechnology;
    }

    public double getSoftwareTechnology() {
        return softwareTechnology;
    }

    public void setSoftwareTechnology(double softwareTechnology) {
        this.softwareTechnology = softwareTechnology;
    }
}
