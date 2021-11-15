package HomeWork;

import java.text.MessageFormat;

public class Worker {
    // Объекты класса
     String fullName;
     String position;
     String email;
     String phoneNumber;
     int salary;
     int age;

    // Конструктор
    public Worker(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    // Метод
    public String infoWorker() {
        String pattern = "fullName: {0}, position: {1}, email: {2}, phone: {3}, salary: {4}, age: {5}";
        return MessageFormat.format(pattern, this.fullName, this.position, this.email, this.phoneNumber, this.salary, this.age);
    }
}
