package oop.interfaces;

public class Developer implements Company{
    @Override
    public String display(String a, String b, String c, String d, String e) {
        return a+" "+b+" "+c+" "+d+" "+e;
    }

    public static void main(String[] args) {
        Developer developer = new Developer();
        System.out.println(developer.display("John","Doe","JohnDoe","Google","Senior Software Engineer"));
    }
}
