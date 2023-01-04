package com.assignment.question2;

public class Fish {
    String name;
    int psauce, msauce, ssauce;

    public Fish(String name, int psauce, int msauce, int ssauce) {
        this.name = name;
        this.psauce = psauce;
        this.msauce = msauce;
        this.ssauce = ssauce;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPsauce() {
        return psauce;
    }

    public void setPsauce(int psauce) {
        this.psauce = psauce;
    }

    public int getMsauce() {
        return msauce;
    }

    public void setMsauce(int msauce) {
        this.msauce = msauce;
    }

    public int getSsauce() {
        return ssauce;
    }

    public void setSsauce(int ssauce) {
        this.ssauce = ssauce;
    }

    public String showDescription() {
        return "\nFish: " + getName() +
                "\nP-Sauce: " + getPsauce() +
                "\nM-Sauce: " + getMsauce() +
                "\nS-Sauce: " + getSsauce();
    }

    public String calculateBill() {

        double bill = 0;
        if (name.equals("Mullee")) {
            bill = 15 + ((3) * (getSsauce() + getPsauce() + getMsauce()));
        }
        if (name.equals("Rohu")) {
            bill = 15 + ((3) * (getSsauce() + getPsauce() + getMsauce()));
        }
        if (name.equals("Theila")) {
            bill = 15 + ((3) * (getSsauce() + getPsauce() + getMsauce()));
        }
        return "Total Bill: " + bill;
    }
}