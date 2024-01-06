package fr.insa;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;

public class App {
    public static void main(String[] args) {
        // Définir l'URI de base pour le serveur Grizzly
        URI baseUri = UriBuilder.fromUri("http://localhost/").port(8080).build();

        // Configuration des ressources REST
        ResourceConfig config = new ResourceConfig().packages("fr.insa.rest");

        // Démarrer le serveur Grizzly avec les ressources configurées
        GrizzlyHttpServerFactory.createHttpServer(baseUri, config);

        System.out.println("Server started at: " + baseUri);
    }
}
