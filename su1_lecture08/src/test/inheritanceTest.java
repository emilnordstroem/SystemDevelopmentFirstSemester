package test;

import generalisering.*;

public class inheritanceTest {
    public static void main(String[] args) {
        Person student = new Student("Emil", "Bernhardt Jensens Boulevard 95", "AP in Cumputer Science", 7);
        Person teacher = new Teacher("Kell", "VejNavn", "Datalog", 100000);

        student.printPerson();
        student.printPerson();
        teacher.printPerson();
        System.out.println(student.getName());
    }
}
