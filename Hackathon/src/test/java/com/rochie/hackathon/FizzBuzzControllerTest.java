package com.rochie.hackathon;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rochie.hackathon.controller.FizzBuzzController;


@WebMvcTest(FizzBuzzController.class)
class FizzBuzzControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void fizzBuzzEndpointTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/fizzbuzz")
                .param("int1", "3")
                .param("int2", "5")
                .param("limit", "15")
                .param("str1", "Fizz")
                .param("str2", "Buzz")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(15));
    }


    @Test
    void statisticsEndpointTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/statistics")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.['3-5-Fizz-Buzz']").exists());
        // Adjust the key based on your expected statistics key
    }

    // Add more tests as needed
}