package com.rochie.hackathon.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FizzBuzzController {
	
	private Map<String, Integer> statistics = new HashMap<>();

    @GetMapping("/fizzbuzz")
    public List<String> fizzBuzz(
            @RequestParam int int1,
            @RequestParam int int2,
            @RequestParam int limit,
            @RequestParam String str1,
            @RequestParam String str2) {

        List<String> result = new ArrayList<>();
        for (int i = 1; i <= limit; i++) {
            if (i % (int1 * int2) == 0) {
                result.add(str1 + str2);
            } else if (i % int1 == 0) {
                result.add(str1);
            } else if (i % int2 == 0) {
                result.add(str2);
            } else {
                result.add(String.valueOf(i));
            }
        }

     // Update statistics
        updateStatistics(int1, int2, str1, str2);
        return result;
    }
    
    @GetMapping("/statistics")
    public Map<String, Integer> getStatistics() {
        return statistics;
    }
    
    private void updateStatistics(int int1, int int2, String str1, String str2) {
        String key = int1 + "-" + int2 + "-" + str1 + "-" + str2;
        statistics.put(key, statistics.getOrDefault(key, 0) + 1);
    }
}
