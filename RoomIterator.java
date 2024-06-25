import java.util.Iterator;
import java.util.List;

public class RoomIterator implements Iterator<HotelRoom> {
    private List<HotelRoom> rooms;
    private int position = 0;

    public RoomIterator(List<HotelRoom> rooms) {
        this.rooms = rooms;
    }

    @Override
    public boolean hasNext() {
        return position < rooms.size();
    }

    @Override
    public HotelRoom next() {
        return rooms.get(position++);
    }
}