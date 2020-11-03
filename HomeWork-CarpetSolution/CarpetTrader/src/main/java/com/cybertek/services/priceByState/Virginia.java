package com.cybertek.services.priceByState;

import com.cybertek.interfaces.price.State;

public class Virginia implements State {
    static double sq_ft_VA = 3.5;

    @Override
    public void getPriceByState() {
        System.out.println("price for sq.ft in Virginia : " + sq_ft_VA);

    }
}
