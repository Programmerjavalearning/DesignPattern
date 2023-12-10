package org.example;

public class pcImaginaire extends ComputerFactory{

    private String ram;

    private String hdd;
    private String cpu;

    public pcImaginaire(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }


    public String getRam() {
        return this.ram;
    }

    public String getHdd() {
        return this.hdd;
    }

    public String getCpu() {
        return this.cpu;
    }

    @Override
    public String toString() {
        return "Ma configuration : RAM" +getRam() + "HDD :" + getHdd() + "Cpu" + getCpu();
    }
}
