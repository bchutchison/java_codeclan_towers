import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void setUp() {
        bedroom = new Bedroom(1, 2, "double", false);
        guest1 = new Guest("Ben", 2);
        guest2 = new Guest("Crawford", 1);
        guest3 = new Guest("Dave", 5);
    }


    @Test
    public void getRoomNumber() {
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void canAddGuest() {
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void canRemoveGuest() {
        bedroom.addGuest(guest1);
        bedroom.removeGuest();
        assertEquals(0, bedroom.guestCount());
    }

    @Test
    public void doesNotAddGuest() {
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        bedroom.addGuest(guest3);
        assertEquals(2, bedroom.guestCount());
    }


}
