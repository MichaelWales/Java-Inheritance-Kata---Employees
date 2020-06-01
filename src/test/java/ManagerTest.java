import org.junit.Before;
import org.junit.Test;

import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Stevie", "AB123456C", 29000.00, "HR");
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(32000, manager.raiseSalary(3000.00), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(290, manager.payBonus(), 0.01);
    }

}