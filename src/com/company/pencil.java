package com.company;

public class pencil {

    public String color = "Red";
    public int length = 200;
    public double price = 150.00;

    void display() {
        System.out.println("color "+" "+this.color);

        System.out.println("length "+" "+this.length);

        System.out.println("price "+" "+this.price);


    }
    public static void main (String[] args) {
        pencil pencil = new pencil();
        pencil.display();
    }
}
