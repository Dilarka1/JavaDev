package com.cybertek.services.roomType;

import com.cybertek.interfaces.Rooms.Room;

import java.util.Scanner;

public class Bedroom extends Room {

    static double length = 13;
    static double width = 8.8;


    public double roomArea() {

        //Area = length*width;
        double areaBedroom = length * width;
        return areaBedroom;
        //System.out.println("Area of the bedroom is:" + areaBedroom);
    }
}
