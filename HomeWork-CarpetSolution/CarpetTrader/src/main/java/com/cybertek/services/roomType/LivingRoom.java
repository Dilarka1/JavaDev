package com.cybertek.services.roomType;

import com.cybertek.interfaces.Rooms.Room;

import java.util.Scanner;

public class LivingRoom extends Room {
    double length = 12;
    double width = 10;


    public double roomArea() {

        //Area = length*width;
        double areaLivingRoom = length * width;
        return areaLivingRoom;
    }
}