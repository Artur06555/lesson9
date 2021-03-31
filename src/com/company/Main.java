package com.company;

public class Main {

    public static void main(String[] args) {
        Underground underground = new Underground("red", 1934);
        Bus bus = new Bus(45, "Germany", 54, "Doubledecker", underground);
        Car car = new Car("Toyota", 70, underground, "Black", "Japen");
        Car car2 = new Car("Mitsubishi", 77, underground, "Black", "China");
        System.out.println(bus.getInfo());
    }

}



