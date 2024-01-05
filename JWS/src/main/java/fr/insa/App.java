package fr.insa;
import fr.insa.service.UserServiceImpl;

import javax.xml.ws.Endpoint;

public class App {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        String address = "http://localhost:9999/userService";
        Endpoint.publish(address, userService);
        System.out.println("Service is running at " + address);
    }
}
