import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    public DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Greg", "111111", 35000);
    }

    @Test
    public void hasName(){
        assertEquals("Greg", databaseAdmin.getName());
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(5000);
        assertEquals(40000, databaseAdmin.getSalary(), 0);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(350, databaseAdmin.payBonus(), 0);
    }

    @Test
    public void canChangeEmployeeName(){
        databaseAdmin.setName("Bill");
        assertEquals("Bill", databaseAdmin.getName());
    }

    @Test
    public void cannotChangeEmployeeNameIfNull(){
        databaseAdmin.setName(null);
        assertEquals("Greg", databaseAdmin.getName());
    }

    @Test
    public void cannotUpdateSalaryWithANegative(){
        databaseAdmin.raiseSalary(-5000);
        assertEquals(35000,databaseAdmin.getSalary(),0);
    }
}
