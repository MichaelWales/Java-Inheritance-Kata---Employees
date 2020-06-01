import org.junit.Before;
import org.junit.Test;

import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Big Jim", "AB123456C", 100000.00, "Executive", 50000.00);
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(103000, director.raiseSalary(3000.00), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(1000, director.payBonus(), 0.01);
    }
}
