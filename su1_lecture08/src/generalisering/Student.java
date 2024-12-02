package generalisering;

public class Student extends Person{
    private double averageGrade;

    public Student(String name, String address, String qualifications, double averageGrade){
        super(name, address, qualifications);
        setAverageGrade(averageGrade);
    }

    public void setAverageGrade(double averageGrade){
        this.averageGrade = averageGrade;
    }

    public void printAddress(){
        System.out.println("Address information: " + address);
    }
    public void printPerson(){
        super.printPerson();
        System.out.println("Average grade: " + averageGrade);
    }

}
