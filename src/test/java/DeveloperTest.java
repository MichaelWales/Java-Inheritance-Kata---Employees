import org.junit.Before;
import org.junit.Test;

import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Greig", "AB123456C", 37000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Greig", developer.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("AB123456C", developer.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(37000.00, developer.getSalary(), 0.01);
    }

}
