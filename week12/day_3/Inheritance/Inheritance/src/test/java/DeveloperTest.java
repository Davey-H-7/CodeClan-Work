
import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    public Developer developer;

    @Before
    public void before(){
        developer = new Developer("Mike", "654321", 35000);
    }

    @Test
    public void hasName(){
        assertEquals("Mike", developer.getName());
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(5000);
        assertEquals(40000, developer.getSalary(), 0);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(350, developer.payBonus(), 0);
    }

    @Test
    public void canChangeEmployeeName(){
        developer.setName("Bill");
        assertEquals("Bill", developer.getName());
    }

    @Test
    public void cannotChangeEmployeeNameIfNull(){
        developer.setName(null);
        assertEquals("Mike", developer.getName());
    }

    @Test
    public void cannotUpdateSalaryWithANegative(){
        developer.raiseSalary(-5000);
        assertEquals(35000,developer.getSalary(),0);
    }

}
