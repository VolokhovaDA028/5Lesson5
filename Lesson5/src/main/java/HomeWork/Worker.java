package HomeWork;

import java.text.MessageFormat;

public class Worker {

    public static void main(String[] args) {
        Worker[] workers = new Worker[5];
        workers[0] = new Worker("Borisov Evgeny", "Programmer", "borisov@mail.com", "89146665334",100000,47);
        workers[1] = new Worker("Bylka Semen", "Designer", "petrov@mail.com", "89363376437",80000,27);
        workers[2] = new Worker("Vinni Pyh", "Architect", "sidorov@mail.com", "89684543257",60000,55);
        workers[3] = new Worker("Lubimov Vacily", "Document expert", "pupkina@mail.com", "89167879898",50000,31);
        workers[4] = new Worker("Kluev Jora", "Engineer", "juk@mail.com", "89246675713",30000,40);
    }
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
