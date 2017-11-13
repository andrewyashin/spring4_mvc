package org.training.controllers;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class HomeControllerTest {

    @Test
    public void shouldReturnRightStringWhenCallHomePageControllerMethod() {
        String expectedView = "home";
        String actualView;

        HomeController homeController = new HomeController();
        actualView = homeController.homePage();

        assertEquals(expectedView, actualView);
    }

    @Test
    public void shouldReturnRightStringWhenSendRequestToController() throws Exception {
        String expectedView = "home";

        HomeController homeController = new HomeController();

        MockMvc mockMvc = standaloneSetup(homeController).build();
        mockMvc.perform(get("/")).andExpect(view().name(expectedView));
    }


}
