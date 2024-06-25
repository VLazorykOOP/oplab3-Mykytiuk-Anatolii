import java.util.ArrayList;
import java.util.List;

public class BookingFacade {
    private List<HotelRoom> availableRooms;

    public BookingFacade() {
        this.availableRooms = new ArrayList<>();
    }

    public void addRoom(HotelRoom room) {
        availableRooms.add(room);
    }

    public void bookRoom(int roomIndex) {
        if (roomIndex >= 0 && roomIndex < availableRooms.size()) {
            HotelRoom room = availableRooms.get(roomIndex);
            System.out.println("Room booked: " + room);
            availableRooms.remove(roomIndex);
        } else {
            System.out.println("Invalid room index");
        }
    }

    public void showAvailableRooms() {
        for (int i = 0; i < availableRooms.size(); i++) {
            System.out.println("Room " + i + ": " + availableRooms.get(i));
        }
    }
}
