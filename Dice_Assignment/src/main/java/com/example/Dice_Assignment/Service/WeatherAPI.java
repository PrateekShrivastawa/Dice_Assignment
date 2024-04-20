package com.example.Dice_Assignment.Service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface WeatherAPI {
    public ResponseEntity<String> RapidApiGetForecastSummaryByLocationName(String name);

    public ResponseEntity<String> RapidApiGetHourlyForecastByLocationName(String Name);
}
