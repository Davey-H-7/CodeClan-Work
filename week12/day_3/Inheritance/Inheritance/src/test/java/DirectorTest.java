import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    public Director director;

    @Before
    public void before(){
        director = new Director("Big John", "999999", 80000, "Marketing", 1000000);
    }

    @Test
    public void hasName(){
        assertEquals("Big John", director.getName());
    }

    @Test
    public void hasDeptName(){
        assertEquals("Marketing", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(1000000, director.getBudget(), 0);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(100000);
        assertEquals(180000, director.getSalary(), 0);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(1600, director.payBonus(), 0);
    }

}

