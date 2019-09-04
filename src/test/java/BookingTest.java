import org.junit.Before;

public class BookingTest {

    Booking booking;
    Bedroom bedroom;

    @Before
    public void setUp() {
        bedroom = new Bedroom(1, 2, "double", false, 20.00);
        booking = new Booking(4, bedroom);
    }



}
