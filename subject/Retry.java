package oop.subject;

public class Retry {
    public static void main(String[] args) {
        InformationTechnology aI = new AI();
        aI.setName("AI");
        InformationTechnology computerScience = new ComputerScience();
        computerScience.setName("computer science");
        InformationTechnology softwareTechnology = new SoftwareTechnology();
        softwareTechnology.setName("software technology");
        System.out.println( aI.getName() + " : " + aI.calculateTuition() + " " + aI.nameSchool());
        System.out.println(computerScience.getName() + " : " + computerScience.calculateTuition() + " " + aI.nameSchool());
        System.out.println(softwareTechnology.getName() + " : " + softwareTechnology.calculateTuition() + " " + aI.nameSchool());

        AI aI2 = new AI(4, "AI 2", "Đây là môn trí tuệ nhân tạo");
        System.out.println(aI2.getAI());
    }
}
