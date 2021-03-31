package com.company;

public class Transport {
    private String model;
    private int volume;
    private Underground underground;

    public Transport(String model, int volume, Underground underground) {
        this.underground = underground;
        this.volume = volume;
        this.model = model;
    }

    public String Transport(int volume, String model, int underground, String production) {
        return getModel();
    }


    public String getModel() {
        return model;
    }

    public int getVolume() {
        return volume;
    }

    public void transport(String model, int volume, Underground underground) {
        this.model = model;
        this.volume = volume;
        this.underground = underground;
    }

    public Underground getUnderground() {
        return underground;

    }

    public String getInfo() {
        return "Crip=" + model + "\nHJU=" + volume + "\n+ghviu=" + underground;
    }
}


