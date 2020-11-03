package com.cybertek.services.priceByState;

import com.cybertek.interfaces.Rooms.Room;
import com.cybertek.interfaces.price.State;

public class Texas implements State {
    static double sq_ft_TX = 3.3;

    @Override
    public void getPriceByState() {
        System.out.println("price for sq.ft in Texas : " + sq_ft_TX);
    }
}
