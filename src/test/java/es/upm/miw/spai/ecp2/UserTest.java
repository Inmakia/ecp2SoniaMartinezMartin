package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {

    User user;

    @Before
    public void dataUser() {
        user = new User(23, "Perico", "el de los palotes");
    }

    @Test
    public void testUser() {
        assertEquals(23, user.getNumber());
        assertEquals("Perico", user.getName());
        assertEquals("El de los palotes", user.getFamilyName());
    }

    @Test
    public void testFullName() {
        assertEquals("Perico El de los palotes", user.fullName());
    }

    @Test
    public void testInitials() {
        assertEquals("P.", user.initials());
    }

}
