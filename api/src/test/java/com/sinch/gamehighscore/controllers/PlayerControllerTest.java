package com.sinch.gamehighscore.controllers;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


public class PlayerControllerTest extends AbstractRestApiTest {

    @Test
    public void should_return_pong_when_get_request_is_made_to_ping() throws Exception {
        mockMvc.perform(get("/player/Leroy"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(equalTo("1")));
    }
    
}