package com.example.servermonitor;

import com.example.servermonitor.service.MonitorService;
import com.example.servermonitor.model.Server;
import com.example.servermonitor.status.ServerStatus;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ServermonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServermonitorApplication.class, args);
    }

    @Bean
    CommandLineRunner run(MonitorService monitorService) {
        return args -> {
            //We make a list of diffrent servers testing Server Enums
            List<Server> servers = List.of (
                    new Server("User1", 82, 65),
                    new Server("User2", 45,30),
                    new Server("User3",95,88)
            );

            //Simple loop to go through all the servers
            for (Server server : servers){
                ServerStatus status = monitorService.check(server);
                System.out.println(server + " => " + status);
            }
        };
    }
}
