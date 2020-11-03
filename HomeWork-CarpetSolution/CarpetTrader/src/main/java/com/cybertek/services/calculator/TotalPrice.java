package com.cybertek.services.calculator;

import com.cybertek.enums.Cities;
import com.cybertek.interfaces.Calculator;
import com.cybertek.interfaces.Rooms.Room;
import com.cybertek.interfaces.price.State;
import com.cybertek.interfaces.tax.Tax;
import com.cybertek.services.TaxByState.TexasTax;
import com.cybertek.services.priceByState.Texas;
import com.cybertek.services.roomType.Bedroom;
import com.cybertek.services.roomType.DiningRoom;
import com.cybertek.services.roomType.HallWay;
import com.cybertek.services.roomType.LivingRoom;


public class TotalPrice implements Calculator {
    private Room room;
    private State state;
    private Tax tax;
    private Bedroom bedroom;
    private DiningRoom diningRoom;
    private HallWay hallWay;
    private LivingRoom livingRoom;
    private TexasTax texasTax;
    private Texas texas;

    public TotalPrice(Room room) {
        this.room = room;
    }

    public TotalPrice(State state) {
        this.state = state;
    }

    public TotalPrice(Tax tax) {
        this.tax = tax;
    }

    public TotalPrice(Room room, State state, Tax tax) {
        this.room = room;
        this.state = state;
        this.tax = tax;
    }

    public TotalPrice() {

    }

    public TotalPrice(Bedroom bedroom) {
        this.bedroom = bedroom;
    }

    public TotalPrice(TexasTax texasTax) {
        this.texasTax = texasTax;
    }

    public TotalPrice(Texas texas) {
        this.texas = texas;
    }

    public void totalPrice() {

        //total price = price per sq.ft * area + tax

        //  room.roomArea();
        //  state.getPriceByState();
        //  tax.getTax();

        System.out.println("Total price is: " + bedroom + " " + texas + texasTax);

       


    }
}
