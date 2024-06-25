public class Main {
    public static void main(String[] args) {
        
        HotelRoom deluxeRoom = new HotelRoom.RoomBuilder("Deluxe")
                .setBeds(2)
                .setBalcony(true)
                .setSeaView(true)
                .build();

        HotelRoom standardRoom = new HotelRoom.RoomBuilder("Standard")
                .setBeds(1)
                .setBalcony(false)
                .setSeaView(false)
                .build();

        BookingFacade bookingFacade = new BookingFacade();
        bookingFacade.addRoom(deluxeRoom);
        bookingFacade.addRoom(standardRoom);

        System.out.println("Available rooms:");
        bookingFacade.showAvailableRooms();

        bookingFacade.bookRoom(0);

        System.out.println("Available rooms after booking:");
        bookingFacade.showAvailableRooms();

        HotelRoomCollection roomCollection = new HotelRoomCollection();
        roomCollection.addRoom(deluxeRoom);
        roomCollection.addRoom(standardRoom);

        RoomIterator iterator = roomCollection.iterator();
        System.out.println("Iterating through available rooms:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
