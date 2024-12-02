package generalisering;

public class Person {
    private String name;
    protected String address;
    private String qualification;

    public Person (String name, String address, String qualification){
        setName(name);
        setAddress(address);
        setQualification(qualification);
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setQualification(String qualification){
        this.qualification = qualification;
    }

    public String getName (){
        return this.name;
    }

    public void printPerson(){
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Qualifications: " + qualification);
    }

}
