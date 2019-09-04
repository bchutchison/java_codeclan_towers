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
    private Booking booking;

    @Before
    public void setUp() {
        hotel = new Hotel(10, 2);
        bedroom1 = new Bedroom(1, 2, "double", false, 20.00);
        bedroom2 = new Bedroom(2, 1, "single", false, 50.00);
        bedroom3 = new Bedroom(3, 2, "double", false, 90.00);
        conferenceRoom1 = new ConferenceRoom(5, "The Mars Suite");
        conferenceRoom2 = new ConferenceRoom(9, "The Jupiter Suite");
        guest1 = new Guest("Ben", 2);
        guest2 = new Guest("Crawford", 1);
        guest3 = new Guest("Dave", 5);
        booking = new Booking(4, bedroom1);
    }

    @Test
    public void checkInGuestToBedroom() {
        hotel.checkInGuestToBedroom(guest1, bedroom1);
        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void cantCheckInGuestToBedroom() {
        hotel.checkInGuestToBedroom(guest1, bedroom1);
        hotel.checkInGuestToBedroom(guest2, bedroom1);
        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void checkInGuestToConferenceRoom() {
        hotel.checkInGuestToConferenceRoom(guest1, conferenceRoom1);
        assertEquals(1, conferenceRoom1.guestCount());
    }

    @Test
    public void checkOutGuestFromConferenceRoom() {
        hotel.checkInGuestToConferenceRoom(guest1, conferenceRoom1);
        hotel.checkOutGuestFromConferenceRoom(conferenceRoom1);
        assertEquals(0, conferenceRoom1.guestCount());
    }

    @Test
    public void checkOutGuestFromBedroom() {
        hotel.checkInGuestToBedroom(guest1, bedroom1);
        hotel.checkOutGuestFromBedroom(bedroom1);
        assertEquals(0, bedroom1.guestCount());
    }

    @Test
    public void checkinChangesOccupied() {
        hotel.checkInGuestToBedroom(guest1, bedroom1);
        assertEquals(true, bedroom1.setToOccupied() );
    }

    @Test
    public void bookRoom() {
        Booking booking = hotel.bookRoom(4, bedroom1);
        assertEquals(4, booking.getNumOfNights());
    }

    @Test
    public void calculateTotalBillForBooking() {
        assertEquals(80.00, hotel.calculateTotalBill(booking), 0.01);
    }

}
