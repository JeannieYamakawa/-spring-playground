package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



@RunWith(SpringRunner.class)
@WebMvcTest(HelloController.class)
public class HelloControllerTest {
    @Autowired
    MockMvc mvc;

    @Test
    public void testHomepage() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/hello");
        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("Booyah. Hello World."));


    };
    @Test
    public void testHomepageGet() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.post("/hello");
        this.mvc.perform(request)
                .andExpect(status().isOk());

    };

};

//shift ctrl R runs whatever your cursor is on
//opt enter will show whatever i need to do
//ctrl R reruns the last thing that was run
//go to run menu and rerun when have made change and want to see in browser
//note there are multiple tabs in the run window
//VCS has multiple tabs too
//underlined numbers -- press command + that number to get to that tab
//computer icon in lower left shows tabs on left and right of idea
//opt cmd L gives default indentation