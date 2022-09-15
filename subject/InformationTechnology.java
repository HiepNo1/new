package oop.subject;

public abstract class InformationTechnology {
    private int quantityYear;
    private String name;
    public abstract int calculateTuition();

    public String nameSchool() {
        return "UTC";
    }

    public InformationTechnology() {
    }

    public InformationTechnology(int quantityYear, String name) {
        this.quantityYear = quantityYear;
        this.name = name;
    }

    public int getQuantityYear() {
        return quantityYear;
    }

    public void setQuantityYear(int quantityYear) {
        this.quantityYear = quantityYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
