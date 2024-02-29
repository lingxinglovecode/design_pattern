package org.example;

public class Computer {
    private int cpu;
    private int ram;
    private int hdd;
    private int gpu;
    public Computer(Builder builder){
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.hdd = builder.hdd;
        this.gpu = builder.gpu;
    }

    public static class Builder{
        private int cpu;
        private int ram;
        private int hdd;
        private int gpu;

        public Builder(int cpu,int ram){
            this.cpu = cpu;
            this.ram = ram;
        }



        public Builder buildHdd(int hdd){
            this.hdd = hdd;
            return this;
        }

        public Builder buildGpu(int gpu){
            this.gpu = gpu;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

    public static void main(String[] args) {
        Computer computer = new Builder(2, 20)
                .buildHdd(500)
                .buildGpu(200)
                .build();
        System.out.println(computer);


    }
}
