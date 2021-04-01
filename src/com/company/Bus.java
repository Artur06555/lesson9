package com.company;

public final class Bus extends Car {



    private int numberOfSeats;
    private String production;


    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getProduction() {
        return production;
    }

    public Bus(Model model, int volume,Underground underground, String production,int numberOfSeats) {
        super(model, volume, underground,production);
        this.numberOfSeats = numberOfSeats;
        this.production = production;

    }


    @Override
    public String getInfo() {
        return "Crip="+numberOfSeats+"\nHJU="+production+"\nDTU="+getModel()+"\n"+getUnderground().getColor()+"\n"+getUnderground().getYer()+
                "\n"+getVolume();
    }
}



