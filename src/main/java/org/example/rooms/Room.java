package org.example.rooms;

import org.example.guests.Guest;

import java.util.ArrayList;

public abstract class Room {


    private RoomType roomType;

    private Integer capacity;

    private ArrayList <Guest> guests;
}
