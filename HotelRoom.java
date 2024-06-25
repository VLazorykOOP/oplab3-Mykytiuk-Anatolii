public class HotelRoom {
    private String type;
    private int beds;
    private boolean hasBalcony;
    private boolean hasSeaView;

    private HotelRoom(RoomBuilder builder) {
        this.type = builder.type;
        this.beds = builder.beds;
        this.hasBalcony = builder.hasBalcony;
        this.hasSeaView = builder.hasSeaView;
    }

    public static class RoomBuilder {
        private String type;
        private int beds;
        private boolean hasBalcony;
        private boolean hasSeaView;

        public RoomBuilder(String type) {
            this.type = type;
        }

        public RoomBuilder setBeds(int beds) {
            this.beds = beds;
            return this;
        }

        public RoomBuilder setBalcony(boolean hasBalcony) {
            this.hasBalcony = hasBalcony;
            return this;
        }

        public RoomBuilder setSeaView(boolean hasSeaView) {
            this.hasSeaView = hasSeaView;
            return this;
        }

        public HotelRoom build() {
            return new HotelRoom(this);
        }
    }

    @Override
    public String toString() {
        return "HotelRoom [type=" + type + ", beds=" + beds + ", hasBalcony=" + hasBalcony + ", hasSeaView=" + hasSeaView + "]";
    }
}
