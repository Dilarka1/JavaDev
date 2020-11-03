package com.cybertek.services.carpet;

import com.cybertek.enums.City;
import com.cybertek.interfaces.carpetPrices.Carpet;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class CarpetTX implements Carpet {

    private static final Map<City, BigDecimal> sqFtForCity = new HashMap<>();

    static {
        sqFtForCity.put(City.DALLAS, new BigDecimal(4.35));
        sqFtForCity.put(City.SAN_ANTONIO, new BigDecimal(4.25));
        sqFtForCity.put(City.AUSTIN, new BigDecimal(4.18));
    }

    @Override
    public BigDecimal getSqFtPrice(City city) {

        BigDecimal defaultValue = BigDecimal.ZERO;

        Optional<Map.Entry<City, BigDecimal>> collect = sqFtForCity.entrySet().stream().filter(x -> x.getKey() == city).findFirst();

        return collect.isPresent() ? collect.get().getValue() : defaultValue;
    }
}