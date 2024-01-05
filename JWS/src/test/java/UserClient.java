
import fr.insa.model.User;
import fr.insa.service.UserService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class UserClient {

    public static void main(String[] args) {
        try {
            // Spécifiez l'URL du service web
            URL url = new URL("http://localhost:9999/userService?wsdl");

            // Spécifiez le nom du service web et du port
            QName qname = new QName("http://service.insa.fr/", "UserServiceImplService");

            // Créez un service à partir de l'URL et du nom du service
            Service service = Service.create(url, qname);

            // Obtenez le port du service
            UserService userService = service.getPort(UserService.class);

            // Créez un utilisateur
            User user = new User("arfa amine", "arfaamine@gmail.com", "Need assistance");

            // Appelez la méthode addUser pour ajouter l'utilisateur
            userService.addUser(user);

            // Affichez un message de confirmation
            System.out.println("User added successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
