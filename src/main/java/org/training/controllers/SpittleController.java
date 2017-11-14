package org.training.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.training.service.SpittleService;

@Controller
public class SpittleController {
    @Autowired
    private SpittleService spittleService;

    @RequestMapping(value = "/spittles", method = RequestMethod.GET)
    public String spittles(Model model) {
        model.addAttribute("spittleList", spittleService.getSpittles(200));
        return "spittles";
    }
}
