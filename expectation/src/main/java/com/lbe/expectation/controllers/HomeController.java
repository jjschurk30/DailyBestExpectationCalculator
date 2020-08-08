package com.lbe.expectation.controllers;

import com.lbe.expectation.models.DailyExpectationDetails;
import com.lbe.expectation.service.DailyExpectationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping
public class HomeController {


    @Autowired DailyExpectationService dailyExpectationService;
    @Autowired DailyExpectationDetails dailyExpectationDetails;

    @GetMapping("/average")
    public float getAverage() {
        return dailyExpectationService.average(dailyExpectationDetails);
    }

}
