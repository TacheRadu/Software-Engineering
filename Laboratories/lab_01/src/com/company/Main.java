package com.company;
import java.util.Random;

abstract class Hardware {
    /* Abstract methods */
    abstract void run();
    abstract void checkTemperature();
    abstract void getSpecs();
}

class Cpu extends Hardware{
    private int quantity = 0;
    private int price = 0;
    void run(){
        System.out.println("[CPU]I'm running.");
    }
    void checkTemperature(){
        double temperature = Math.random()*100%70+30;
        System.out.println("[CPU]My temperature is " + temperature + "°C.");
    }
    void getSpecs(){
        System.out.println("[CPU]I'm an Intel Core i9-9900k.");
    }
    void setQuantity(int quantity){
        this.quantity = quantity;
    }
    void getQuantity(){
        System.out.println("[CPU]My quantity is " + this.quantity);
    }
    void setPrice(int price){
        this.price = price;
    }
    void getPrice(){
        System.out.println("[CPU]My price is " + this.price);
    }
}

class Motherboard extends Hardware{
    private int quantity = 0;
    private int price = 0;
    void run(){
        System.out.println("[MOBO]I'm running.");
    }
    void checkTemperature(){
        double temperature = Math.random()*100%70+30;
        System.out.println("[MOBO]My temperature is " + temperature + "°C");
    }
    void getSpecs(){
        System.out.println("[MOBO]I'm an ASUS PRIME H310M-K R2.0.");
    }
    void setQuantity(int quantity){
        this.quantity = quantity;
    }
    void getQuantity(){
        System.out.println("[MOBO]My quantity is " + this.quantity);
    }
    void setPrice(int price){
        this.price = price;
    }
    void getPrice(){
        System.out.println("[MOBO]My price is " + this.price);
    }
}

class RAM extends Hardware {
    private int price = 100;
    private int quantity = 15;
    private int frequency = 3200;
    private int memory = 8192;
    private int latency = 17;

    void run() {
        System.out.println("[ RAM ]: I'm running.");
    }

    void checkTemperature() {
        Random rand = new Random();
        int min = 25;
        int max = 65;
        int temp = rand.nextInt((max - min) + 1) + min;
        System.out.printf("[ RAM ]: I'm %d°C hot!\n", temp);
    }

    void getSpecs() {
        System.out.printf("[ RAM ]: Specs (Frequency: %d MHZ | Memory: %d MB | Latency: CL%d)\n", frequency, memory, latency);
    }

    int getFrequency() {
        return frequency;
    }

    int getMemory() {
        return memory;
    }

    int getLatency() {
        return latency;
    }

    int getPrice() {
        return price;
    }

    int getQuantity() {
        return quantity;
    }

    void setFrequency(int freq) {
        frequency = freq;
    }

    void setMemory(int mem) {
        memory = mem;
    }

    void setLatency(int lat) {
        latency = lat;
    }

    void setPrice(int how_much) {
        price = how_much;
    }

    void setQuantity(int how_many) {
        quantity = how_many;
    }
}

class GPU extends Hardware {
    private int price = 300;
    private int quantity = 10;
    private double frequency = 1.49;
    private int memory = 4096;
    private int cuda_cores = 1024;
    private int compute_units = 16;

    void run() {
        System.out.println("[ GPU ]: I'm running.");
    }

    void checkTemperature() {
        Random rand = new Random();
        int min = 35;
        int max = 90;
        int temp = rand.nextInt((max - min) + 1) + min;
        System.out.printf("[ GPU ]: I'm %d°C hot!\n", temp);
    }

    void getSpecs() {
        System.out.printf("[ GPU ]: Specs (Frequency: %g GHZ | Memory: %d MB | Cuda Cores: %d | Compute Units: %d)\n", frequency, memory, cuda_cores, compute_units);
    }

    double getFrequency() {
        return frequency;
    }

    int getMemory() {
        return memory;
    }

    int getCudaCores() {
        return cuda_cores;
    }

    int getComputeUnits() {
        return compute_units;
    }

    int getPrice() {
        return price;
    }

    int getQuantity() {
        return quantity;
    }

    void setFrequency(double freq) {
        frequency = freq;
    }

    void setMemory(int mem) {
        memory = mem;
    }

    void setCudaCores(int cores) {
        cuda_cores = cores;
    }

    void setComputeUnits(int units) {
        compute_units = units;
    }

    void setPrice(int how_much) {
        price = how_much;
    }

    void setQuantity(int how_many) {
        quantity = how_many;
    }
}

public class Main {
    public static void main(String[] args){
        Cpu myCpu = new Cpu();
        myCpu.checkTemperature();
        myCpu.setPrice(100);
        myCpu.getPrice();

        RAM ram_comp = new RAM();
        ram_comp.run();
        ram_comp.getSpecs();
        ram_comp.checkTemperature();
        int price = ram_comp.getPrice();
        int quantity = ram_comp.getQuantity();
        System.out.printf("[ RAM ]: Price: %d | Quantity: %d\n", price, quantity);

        GPU gpu_comp = new GPU();
        gpu_comp.run();
        gpu_comp.getSpecs();
        gpu_comp.checkTemperature();
        price = ram_comp.getPrice();
        quantity = ram_comp.getQuantity();
        System.out.printf("[ GPU ]: Price: %d | Quantity: %d\n", price, quantity);
    }
}