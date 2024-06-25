import java.util.ArrayList;
import java.util.List;

public class HotelRoomCollection {
    private List<HotelRoom> rooms;

    public HotelRoomCollection() {
        rooms = new ArrayList<>();
    }

    public void addRoom(HotelRoom room) {
        rooms.add(room);
    }

    public RoomIterator iterator() {
        return new RoomIterator(rooms);
    }
}