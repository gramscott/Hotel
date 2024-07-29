package org.example.rooms;

import org.example.guests.Guest;

import java.util.ArrayList;

public abstract class Room {
    private RoomType roomType;

    private Integer capacity;

    private ArrayList <Guest> guests;

    protected Room(RoomType roomType, Integer capacity, ArrayList<Guest> guests) {
        this.roomType = roomType;
        this.capacity = capacity;
        this.guests = guests;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }
}
