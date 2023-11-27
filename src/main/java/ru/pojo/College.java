package ru.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Казаков Сергей Сергеевич");
        student.setGroup("5Дм");
        student.setReceiptDate("01.10.2018");
        System.out.println(student.getName() + System.lineSeparator() + student.getGroup() + System.lineSeparator() + student.getReceiptDate());
    }
}
