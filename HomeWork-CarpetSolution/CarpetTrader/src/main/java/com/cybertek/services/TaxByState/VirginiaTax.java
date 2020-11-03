package com.cybertek.services.TaxByState;

import com.cybertek.interfaces.tax.Tax;

public class VirginiaTax implements Tax {

    static double tax_VA = 6.0;

    @Override
    public void getTax() {
        System.out.println("Virginia tax  rate : " + tax_VA);

    }
}
