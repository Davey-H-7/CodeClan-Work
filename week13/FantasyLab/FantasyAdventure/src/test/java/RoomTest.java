import models.rooms.Room;
import org.junit.Test;

public class RoomTest {

    Room room;

    @Test
    public void test(){
        room = new Room();
        System.out.println(room.getExits());

    }
}
