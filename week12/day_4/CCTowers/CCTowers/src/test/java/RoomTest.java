import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    private Bedroom bedroom;
    private ConferenceRoom confRoom;

    private Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.DOUBLE, 101 );
        confRoom = new ConferenceRoom(RoomType.CONF, "Glasgow");
        guest = new Guest("Glen Michael");
    }

    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest);
        confRoom.addGuest(guest);
        assertEquals(1, bedroom.getGuests().size());
        assertEquals(1, confRoom.getGuests().size());
    }
}
