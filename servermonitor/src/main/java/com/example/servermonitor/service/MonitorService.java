package com.example.servermonitor.service;

import com.example.servermonitor.model.Server;
import com.example.servermonitor.status.ServerStatus;
import org.springframework.stereotype.Service;

@Service
public class MonitorService {

    //A bunch of if commands to check the value of Server diffrent parameters
    public ServerStatus check(Server server) {
        if (server.getCpuUsage() > 90 || server.getMemoryUsage() > 90) {
            return ServerStatus.CRITICAL;
        }
        if (server.getCpuUsage() > 70 || server.getMemoryUsage() > 70) {
            return ServerStatus.WARNING;
        }
        return ServerStatus.OK;
    }
}
