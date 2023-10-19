public class Bedroom extends Room{

    public int roomNumber;

    public double nightlyRate;

    public Bedroom(RoomType roomType, int roomNumber, double nightlyRate) {
        super(roomType);
        this.roomNumber = roomNumber;
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }

    public void setNightlyRate(double nightlyRate) {
        this.nightlyRate = nightlyRate;
    }
}
