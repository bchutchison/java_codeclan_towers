import java.util.ArrayList;

public class Hotel {

    private int totalBedrooms;
    private int totalConferenceRooms;

    private ArrayList<Bedroom> bedroomArrayList;
    private ArrayList<ConferenceRoom> conferenceRoomArrayList;
    private ArrayList<Booking> bookingArrayList;


    public Hotel(int totalBedrooms, int totalConferenceRooms) {
        this.totalBedrooms = totalBedrooms;
        this.totalConferenceRooms = totalConferenceRooms;
        this.bookingArrayList = new ArrayList<Booking>();
    }

    public static void checkInGuestToBedroom(Guest guest, Bedroom bedroom) {
        bedroom.addGuest(guest);
        bedroom.setToOccupied();
    }

    public static void checkInGuestToConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.addGuest(guest);
    }

    public static void checkOutGuestFromConferenceRoom(ConferenceRoom conferenceRoom) {
        conferenceRoom.removeGuest();
    }

    public static void checkOutGuestFromBedroom(Bedroom bedroom) {
        bedroom.removeGuest();
    }

    public double calculateTotalBill(Booking booking) {
        return booking.getNumOfNights() * booking.getBedroom().getRatePerNight();
    }

    public Booking bookRoom(int numOfNights, Bedroom bedroom) {
        //return Booking object
        Booking booking = new Booking(numOfNights, bedroom);
        bookingArrayList.add(booking);
        this.calculateTotalBill(booking);
        return booking;
    }

}


