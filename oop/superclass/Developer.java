package oop.superclass;

public class Developer extends Person {
    String role;
    int exp;
    String company;
    public Developer(String firstName,String lastName,int age,String role,int exp,String company){
        super(firstName,lastName,age);
        this.role=role;
        this.exp=exp;
        this.company=company;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Role: "+role);
        System.out.println("Exp: "+exp);
        System.out.println("Company: "+company);
    }

    public static void main(String[] args) {
        Developer developer = new Developer("Izzatbek","Abdusharipov",22,"Frontend Developer",1,"Scale TMS Group");
        developer.display();
    }
}
