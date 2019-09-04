import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest1;
    Guest guest2;

    @Before
    public void setUp() {
        conferenceRoom = new ConferenceRoom(5, "The Mars Suite");
        guest1 = new Guest("Ben");
        guest2 = new Guest("Crawford");
    }

    @Test
    public void getConferenceRoomCapacity() {
        assertEquals(5, conferenceRoom.getCapacity());
    }

    @Test
    public void canAddGuest() {
        conferenceRoom.addGuest(guest1);
        assertEquals(1, conferenceRoom.guestCount());
    }



}