package com.cybertek.services.roomType;

import com.cybertek.interfaces.Rooms.Room;

import java.util.Scanner;

public class DiningRoom extends Room {

    double length = 10;
    double width = 10;


    public double roomArea() {

        //Area = length*width;
        double areaDiningRoom = length * width;
        return areaDiningRoom;
    }
      //  System.out.println("Area of the dining room is:" + areaDiningRoom);
    }

