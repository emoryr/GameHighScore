package com.sinch.gamehighscore.controllers;

import org.junit.jupiter.api.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


public class CategoryControllerTest extends AbstractRestApiTest {

    @Test
    public void should_return_200() throws Exception {
        mockMvc.perform(get("/category/all"))
                .andDo(print())
                .andExpect(status().isOk());
    }
    
}
