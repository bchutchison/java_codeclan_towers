import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;

    @Before
    public void setUp() {
        guest1 = new Guest("Ben", 2);
    }

    @Test
    public void getName() {
        assertEquals("Ben", guest1.getName()) ;
    }
}
