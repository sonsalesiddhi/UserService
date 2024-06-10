package com.example.userservice.external.services;

import com.example.userservice.entity.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Service
@FeignClient(name = "RATING-SERVICE")
public interface RatingService {
    //get
    //POST
    @PostMapping("/ratings")
    public Rating createRating(Rating values);

    //PUT
    @PutMapping("/ratings/{ratingId}")
    public Rating UpdateRating(@PathVariable("ratingId")String ratingId, Rating rating);


}
