public class Booking {

    private Bedroom bedroom;
    private int numOfNights;

    public Booking(int numOfNights, Bedroom bedroom) {
        this.bedroom = bedroom;
        this.numOfNights = numOfNights;
    }

    public int getNumOfNights() {
        return numOfNights;
    }

    public void setNumOfNights(int numOfNights) {
        this.numOfNights = numOfNights;
    }



}
