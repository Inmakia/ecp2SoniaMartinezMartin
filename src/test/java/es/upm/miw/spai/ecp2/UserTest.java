package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {

    User user;

    @Before
    public void dataUser() {
        user = new User(23, "Mickey", "Mouse");
    }

    @Test
    public void testUser() {
        assertEquals(23, user.getNumber());
        assertEquals("Mickey", user.getName());
        assertEquals("Mouse", user.getFamilyName());
    }

    @Test
    public void testFullName() {
        assertEquals("Mickey Mouse", user.fullName());
    }

    @Test
    public void testInitials() {
        assertEquals("M.", user.initials());
    }

}
