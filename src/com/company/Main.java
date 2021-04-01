package com.company;

public class Main {

    public static void main(String[] args) {
        Underground underground = new Underground("red", 1934);
        Bus bus = new Bus(Model.DOUBLEDECKER, 54,underground, "Germany",54);

        Car car = new Car(Model.TOYOTA, 70, underground,  "Japen");
        Car car2 = new Car(Model.TOYOTA, 77, underground, "Black");
        System.out.println(bus.getInfo());
        car.Bus2("VHBJ",34,345,"DDHGF");
        car.Bus2("VHBJ",34,345,"DDHGF",54);
        car.Bus2("VHBJ",34,345,"DDHGF",456,3456);

    }

}



