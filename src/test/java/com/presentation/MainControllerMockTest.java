package com.presentation;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest()
@AutoConfigureMockMvc
public class MainControllerMockTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void addingAUserShouldReturn200Ok() throws Exception {

        mockMvc.perform(post("/addUser?name=Eivind&email=testmail")
                .contentType("application/json"))
                .andExpect(status().isOk());
    }
}