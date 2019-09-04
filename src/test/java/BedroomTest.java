import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest1;
    Guest guest2;

    @Before
    public void setUp() {
        bedroom = new Bedroom(1, 2, "double");
        guest1 = new Guest("Ben");
        guest2 = new Guest("Crawford");
    }


    @Test
    public void getRoomNumber() {
        assertEquals(1, bedroom.getRoomNumber());
    }


}
