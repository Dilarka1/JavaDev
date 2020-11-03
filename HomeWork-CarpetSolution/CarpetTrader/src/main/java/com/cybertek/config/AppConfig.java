package com.cybertek.config;

import com.cybertek.interfaces.Rooms.Room;
import com.cybertek.interfaces.price.State;
import com.cybertek.services.calculator.TotalPrice;
import com.cybertek.services.priceByState.Texas;
import com.cybertek.services.priceByState.Virginia;
import com.cybertek.services.roomType.Bedroom;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.cybertek")
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Bean
    public TotalPrice totalPrice() {
        return new TotalPrice();
    }

    @Bean
    public State state() {
        return new Texas();
    }

    @Bean
    public State state1() {
        return new Virginia();
    }

    @Bean
    public Room room() {
        return new Bedroom();
    }
}