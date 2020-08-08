package com.lbe.expectation.models;


import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Data
public class DailyExpectationDetails {
    private Long id;
    private Date day;
    private float working;
    private float drumming;
    private float reading;
    private float writing;
    private float coding;
    private float exercising;
    private float dailyBestExpectation;
}
