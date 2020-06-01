import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin dbAdmin;

    @Before
    public void before() {
        dbAdmin = new DatabaseAdmin("Tam", "AB123456C", 35000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Tam", dbAdmin.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("AB123456C", dbAdmin.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(35000.00, dbAdmin.getSalary(), 0.01);
    }

}
