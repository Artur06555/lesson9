package com.company;

public class Transport {
    private Model model;
    private int volume;
    private Underground underground;

    public Transport(Model model, int volume, Underground underground) {
        this.underground = underground;
        this.volume = volume;
        this.model = model;
    }

    public Model getModel() {
        return model.DOUBLEDECKER;
    }

    public int getVolume() {
        return volume;
    }

    public Underground getUnderground() {
        return underground;

    }

    public String getInfo() {
        return "Crip=" + model + "\nHJU=" + volume + "\n+ghviu=" + underground;
    }
}


