import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private String type;
    private boolean occupied;
    private ArrayList<Guest> bedroomGuests;


    public Bedroom(int roomNumber, int capacity, String type, boolean occupied) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.occupied = occupied;
        this.bedroomGuests = new ArrayList<Guest>();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }


    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void addGuest(Guest guest) {
        if(this.occupied != true) {
            if (this.capacity > this.bedroomGuests.size())
                this.bedroomGuests.add(guest);
        }
    }

    public int guestCount() {
        return bedroomGuests.size();
    }

    public void removeGuest() {
        this.bedroomGuests.remove(0);
    }

    public boolean setToOccupied() {
        return this.occupied = true;

    }
}
