import java.util.ArrayList;

public class ConferenceRoom {

    private String name;
    private int capacity;
    private ArrayList<Guest> conferenceRoomGuests;

    public ConferenceRoom(int capacity, String roomName) {
        this.capacity = capacity;
        this.name = roomName;
        this.conferenceRoomGuests = new ArrayList<Guest>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void addGuest(Guest guest) {
        if(this.capacity > conferenceRoomGuests.size())
        this.conferenceRoomGuests.add(guest);
    }

    public int guestCount() {
        return this.conferenceRoomGuests.size();
    }
}
