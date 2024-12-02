package generalisering;

public class Teacher extends Person{
    private double salary;

    public Teacher(String name, String address, String qualifications, double salary){
        super(name, address, qualifications);
        setSalary(salary);
    }

    public void setSalary(double salary){
        this.salary = yearSalary(salary);
    }

    public void printPerson(){
        super.printPerson();
        System.out.println("Yearly salary: " + salary);
    }

    public double yearSalary(double salary){
        return (salary * 12) * 1.125;
    }
}
