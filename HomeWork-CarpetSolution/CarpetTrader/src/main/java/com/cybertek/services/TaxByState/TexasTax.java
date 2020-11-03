package com.cybertek.services.TaxByState;

import com.cybertek.interfaces.tax.Tax;

public class TexasTax implements Tax {
    static double tax_TX = 8.25;
    @Override
    public void getTax() {
        System.out.println("Texas tax  rate : " + tax_TX);

    }
}
