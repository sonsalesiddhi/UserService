package com.example.userservice.external.services;


import com.example.userservice.entity.Hotel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "HOTEL-SERVICE")
public interface HotelService {
    @GetMapping("/hotels/{hotelId}")
     Hotel getHotel(@PathVariable("hotelId") String hotelId);
}
