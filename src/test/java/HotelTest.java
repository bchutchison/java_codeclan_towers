import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;

    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Bedroom bedroom3;

    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;

    private Guest guest1;
    private Guest guest2;
    private Guest guest3;

    @Before
    public void setUp() {
        hotel = new Hotel(10, 2);
        bedroom1 = new Bedroom(1, 2, "double");
        bedroom2 = new Bedroom(2, 1, "single");
        bedroom3 = new Bedroom(3, 2, "double");
        conferenceRoom1 = new ConferenceRoom(5, "The Mars Suite");
        conferenceRoom2 = new ConferenceRoom(9, "The Jupiter Suite");
        guest1 = new Guest("Ben");
        guest2 = new Guest("Crawford");
        guest3 = new Guest("Dave");
    }

    @Test
    public void checkInGuestToBedroom() {
        Hotel.checkInGuestToBedroom(guest1, bedroom1);
        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void checkInGuestToConferenceRoom() {
        Hotel.checkInGuestToConferenceRoom(guest1, conferenceRoom1);
        assertEquals(1, conferenceRoom1.guestCount());
    }

}
