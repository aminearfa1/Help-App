package fr.insa.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", namespace = "http://service.insa.fr/")
public class User {
    @XmlElement(required = true)
    private String name;

    @XmlElement(required = true)
    private String email;

    @XmlElement(name = "helpRequest", required = true)
    private String helpRequest;

    // Constructors
    public User() {
    }

    public User(String name, String email, String helpRequest) {
        this.name = name;
        this.email = email;
        this.helpRequest = helpRequest;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHelpRequest() {
        return helpRequest;
    }

    public void setHelpRequest(String helpRequest) {
        this.helpRequest = helpRequest;
    }

    // toString method (optional)
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", helpRequest='" + helpRequest + '\'' +
                '}';
    }
}
