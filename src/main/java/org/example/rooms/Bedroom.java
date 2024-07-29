package org.example.rooms;

public class Bedroom extends Room {

    private Integer roomNumber;

    public Bedroom(Integer roomNumber) {
        super(roomType, capacity, guests);
        this.roomNumber = roomNumber;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }
}
