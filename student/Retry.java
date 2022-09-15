package oop.homework1.student;

import java.util.Scanner;

public class Retry {
    public static Scanner scanner = new Scanner(System.in);
    public static void importInformation(Student student) {
        System.out.println("Nhập id : ");
        student.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nhập họ tên : ");
        student.setName(scanner.nextLine());
        System.out.println("Nhập địa chỉ : ");
        student.setAddress(scanner.nextLine());
        do {
            System.out.println("Nhập số điện thoại gồm 7 chữ số : ");
            student.setPhone(scanner.nextInt());
        } while (student.getPhone() <= 1000000 || student.getPhone() >= 9999999);
    }
    public static void exportInformation(Student student) {
        System.out.printf("%-5d %-15s %-15s %-15d \n", student.getId(), student.getName(), student.getAddress(), student.getPhone());
    }
    public static void main(String[] args) {
        Student student[];
        System.out.println("Nhập số lượng sinh viên : ");
        int inputQuantity = scanner.nextInt();
        student = new Student[inputQuantity];
        for (int i = 0; i < inputQuantity; i++) {
            System.out.println("Sinh viên thứ " + (i + 1) + " : ");
            student[i] = new Student();
            importInformation(student[i]);
        }
        System.out.println("Thông tin sinh viên vừa nhập :");
        System.out.printf("%-5s %-15s %-15s %-15s \n", "ID", "Name", "Address", "Phone");
        System.out.println("Trước khi sắp xếp :");
        for (Student element : student) {
            exportInformation(element);
        }
        System.out.println("Sau khi sắp xếp :");
        Student sort;
        for (int i = 0; i < student.length - 1; i++) {
            for (int j = i + 1; j < student.length; j++) {
                if (student[i].getId() > student[j].getId()) {
                    sort = student[j];
                    student[j] = student[i];
                    student[i] = sort;
                }
            }
        }
        for (Student element : student) {
            exportInformation(element);
        }
    }
}
