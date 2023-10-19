import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

public Manager manager;

@Before
    public void before(){
    manager = new Manager("Deborah", "0123456", 30000, "HR");
}

@Test
    public void hasName(){
    assertEquals("Deborah", manager.getName());
}

    @Test
    public void hasDeptName(){
        assertEquals("HR", manager.getDeptName());
    }

@Test
    public void canRaiseSalary(){
    manager.raiseSalary(5000);
    assertEquals(35000, manager.getSalary(), 0);
}

@Test
    public void canGetPayBonus(){
    assertEquals(300, manager.payBonus(), 0);
}

}
