package com.example.servermonitor.model;

public class Server {

    private String hostname;
    private int cpuUsage;
    private int memoryUsage;

    public Server(String hostname, int cpuUsage, int memoryUsage){
        this.hostname = hostname;
        this.cpuUsage = cpuUsage;
        this.memoryUsage = memoryUsage;
    }

    public String getHostname() {
        return hostname;
    }

    public int getCpuUsage() {
        return cpuUsage;
    }

    public int getMemoryUsage() {
        return memoryUsage;
    }
    @Override
    public String toString(){
        return hostname + "[CPU=" + cpuUsage + "%, MEM=" + memoryUsage + "%]";
    }
}
