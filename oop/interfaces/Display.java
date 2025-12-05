package oop.interfaces;

public class Display implements Interface{
    @Override
    public void display() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        Display display = new Display();
        display.display();
    }
}
