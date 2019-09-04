import org.junit.Before;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Bedroom bedroom4;


    @Before
    public void setUp() {
        hotel = new Hotel();
        bedroom1 = new Bedroom();
    }

}
