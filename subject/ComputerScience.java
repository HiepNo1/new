package oop.subject;

public class ComputerScience extends InformationTechnology {
    private int computerScience;
    @Override
    public int calculateTuition() {
        return 3000;
    }

    public ComputerScience() {
    }

    public ComputerScience(int computerScience) {
        this.computerScience = computerScience;
    }

    public ComputerScience(int quantityYear, String name, int computerScience) {
        super(quantityYear, name);
        this.computerScience = computerScience;
    }

    public int getComputerScience() {
        return computerScience;
    }

    public void setComputerScience(int computerScience) {
        this.computerScience = computerScience;
    }
}
