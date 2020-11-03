package com.cybertek.services.roomType;

import com.cybertek.interfaces.Rooms.Room;

import java.util.Scanner;

public class HallWay extends Room {
    double length = 9.5;
    double width = 6.4;

    public double roomArea() {

        //Area = length*width;
        double areaHallway = length * width;
        return areaHallway;
    }
}