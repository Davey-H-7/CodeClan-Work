import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    private Bedroom bedroom;
    private ConferenceRoom confRoom;

    private Guest guest;

    private Hotel hotel;

    private DiningRoom diningRoom;

    @Before
    public void before() {
        bedroom = new Bedroom(RoomType.DOUBLE, 101, 50.00);
        confRoom = new ConferenceRoom(RoomType.CONF, "Glasgow");
        guest = new Guest("Glen Michael");
        hotel = new Hotel();
        diningRoom = new DiningRoom(RoomType.DINING, "The Lunch Trough");
    }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.getBedrooms().size());
    }

    @Test
    public void canAddConfRoom(){
        hotel.addConfRoom(confRoom);
        assertEquals(1, hotel.getConfRooms().size());
    }

    @Test
    public void canAddGuestToBedroom(){
        hotel.addBedroom(bedroom);
        hotel.addGuestToBedroom(101, guest);
        assertEquals(1, hotel.getBedrooms().get(0).getGuests().size());
    }

    @Test public void canMakeBooking(){
        hotel.addBedroom(bedroom);
        Booking newBooking = hotel.bookRoom(bedroom, 2);
        assertEquals(2, newBooking.getNoOfNights());
    }

    @Test
    public void canGetTotalBill(){
        hotel.addBedroom(bedroom);
        Booking newBooking = hotel.bookRoom(bedroom, 2);
        double totalBill = newBooking.getTotalBill();
        assertEquals(100.00, totalBill, 0);

    }

    @Test
    public void canAddDiningRoom(){
        hotel.addDiningRoom(diningRoom);
        assertEquals("The Lunch Trough", hotel.getDiningRooms().get("The Lunch Trough").getName());
    }

}