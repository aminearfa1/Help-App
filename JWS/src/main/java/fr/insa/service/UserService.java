package fr.insa.service;


import fr.insa.model.User;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "UserService", targetNamespace = "http://service.insa.fr/")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL)
public interface UserService {
    @WebMethod
    void addUser(User user);
}
