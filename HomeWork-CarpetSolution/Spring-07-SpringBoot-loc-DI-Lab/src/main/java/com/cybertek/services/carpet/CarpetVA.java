package com.cybertek.services.carpet;

import com.cybertek.enums.City;
import com.cybertek.interfaces.carpetPrices.Carpet;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


    @Component
    public class CarpetVA implements Carpet {

        private static final Map<City, BigDecimal> sqFtForCity = new HashMap<>();

        static {
            sqFtForCity.put(City.ARLINGTON, new BigDecimal(4.75));
            sqFtForCity.put(City.MCLEAN, new BigDecimal(4.45));
            sqFtForCity.put(City.FAIRFAX, new BigDecimal(4.77));
        }

        @Override
        public BigDecimal getSqFtPrice(City city) {

            BigDecimal defaultValue = BigDecimal.ZERO;

            Optional<Map.Entry<City, BigDecimal>> collect = sqFtForCity.entrySet().stream().filter(x -> x.getKey() == city).findFirst();

            return collect.isPresent() ? collect.get().getValue() : defaultValue;
        }
    }
