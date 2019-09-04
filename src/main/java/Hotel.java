import java.util.ArrayList;

public class Hotel {

    private int totalBedrooms;
    private int totalConferenceRooms;
    private ArrayList<Bedroom> bedroomArrayList;
    private ArrayList<ConferenceRoom> conferenceRoomArrayList;


    public Hotel(int totalBedrooms, int totalConferenceRooms) {
        this.totalBedrooms = totalBedrooms;
        this.totalConferenceRooms = totalConferenceRooms;
    }

    public static void checkInGuestToBedroom(Guest guest, Bedroom bedroom) {
        bedroom.addGuest(guest);
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
}


