import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void setUp() {
        conferenceRoom = new ConferenceRoom(5, "The Mars Suite");
        guest1 = new Guest("Ben");
        guest2 = new Guest("Crawford");
        guest3 = new Guest("Dave");
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

    @Test
    public void canRemoveGuest() {
        conferenceRoom.addGuest(guest1);
        conferenceRoom.removeGuest();
        assertEquals(0, conferenceRoom.guestCount());
    }

    @Test
    public void doesNotAddGuest() {
        conferenceRoom.addGuest(guest1);
        conferenceRoom.addGuest(guest2);
        conferenceRoom.addGuest(guest3);
        conferenceRoom.addGuest(guest3);
        conferenceRoom.addGuest(guest3);
        conferenceRoom.addGuest(guest3);
        assertEquals(5, conferenceRoom.guestCount());
    }



}
