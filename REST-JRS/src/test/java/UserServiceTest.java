
import fr.insa.model.User;
import fr.insa.rest.UserResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.TestProperties;
import org.junit.Test;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static org.junit.Assert.*;

public class UserServiceTest extends JerseyTest {

    @Override
    protected Application configure() {
        enable(TestProperties.LOG_TRAFFIC);
        enable(TestProperties.DUMP_ENTITY);
        return new ResourceConfig(UserResource.class);
    }

    @Test
    public void testAddUser() {
        User user = new User("arfa", "arfa@exemple.fr", "Ntest from Java client Rest");

        Response response = target("/users").request()
                .post(Entity.entity(user, MediaType.APPLICATION_JSON));

        assertEquals("Should return status 201", 201, response.getStatus());
        assertNotNull("Should return user", response.getEntity());
    }

    // Vous pouvez ajouter d'autres méthodes de test pour GET, PUT, DELETE, etc.
}
