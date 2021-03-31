package com.company;

public final class Bus extends Transport {

    private int numberOfSeats;
    private String production;


    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getProduction() {
        return production;
    }

    public Bus(int volume, String production, int numberOfSeats, String model, Underground underground) {
        super(model, volume, underground);
        this.numberOfSeats = numberOfSeats;
        this.production=production;
    }

    public Bus(String model, int volume, Underground underground, int numberOfSeats, String production) {
        super(model, volume, underground);
        this.numberOfSeats = numberOfSeats;
        this.production = production;
    }

    public  Bus(int volume, String model, Underground underground, String production) {
        super(model, volume, underground);
        this.production = production;

    }

    @Override
    public String getInfo() {
        return "Crip="+numberOfSeats+"\nHJU="+production+"\nDTU="+getModel()+"\n"+getUnderground().getColor()+"\n"+getUnderground().getYer()+
                "\n"+getVolume();
    }
}



