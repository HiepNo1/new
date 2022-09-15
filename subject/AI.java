package oop.subject;

public class AI extends InformationTechnology {
    private String aI;
    @Override
    public int calculateTuition() {
        return 1000;
    }

    public AI() {
    }
    public AI(String aI) {
        this.aI = aI;
    }

    public AI(int quantityYear, String name, String aI) {
        super(quantityYear, name);
        this.aI = aI;
    }

    public String getAI() {
        return aI;
    }

    public void setAI(String aI) {
        this.aI = aI;
    }
}
