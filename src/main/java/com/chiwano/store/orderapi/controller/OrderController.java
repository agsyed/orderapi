package com.chiwano.store.orderapi.controller;

import com.chiwano.store.orderapi.domain.Order;
import com.chiwano.store.orderapi.domain.ShippingAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class OrderController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/order/{id}")
    public Order getOrderById(@PathVariable String id) {
        return new Order() {{
            setId(id);
            setFirstName("Syed");
            setLastName("Ali");
            setShippingAddress(new ShippingAddress() {{
                setStreetLine1("413 Tanner Square");
                setCity("McKinney");
                setState("TX");
                setZipCode("75072");
            }});
        }};
      //  String result = restTemplate.getForObject("https://samples.openweathermap.org/data/2.5/weather?zip=75070&appid=e213c176f32b286f63425463f29ab9c6", String.class);
    }
}
