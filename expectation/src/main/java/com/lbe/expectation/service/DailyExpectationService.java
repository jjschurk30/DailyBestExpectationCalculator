package com.lbe.expectation.service;

import com.lbe.expectation.models.DailyExpectationDetails;
import org.springframework.stereotype.Service;


@Service
public class DailyExpectationService {


    public float average(DailyExpectationDetails dailyExpectationDetails) {

        final float hours = 24;


        float averageDBE = (dailyExpectationDetails.getWorking() + dailyExpectationDetails.getReading() + dailyExpectationDetails.getExercising() + dailyExpectationDetails.getCoding() + dailyExpectationDetails.getDrumming() + dailyExpectationDetails.getWriting()) / hours;

        float DailyBestExpectation = averageDBE * 100;

        return DailyBestExpectation;
    }

}




