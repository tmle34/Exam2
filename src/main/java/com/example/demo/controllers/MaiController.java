package com.example.demo.controllers;

import com.example.demo.Models.ResearchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MaiController {
    @Autowired
    ResearchRepo researchRepo;

    public MaiController() {
    }

    @RequestMapping({"/"})
    public ModelAndView doHome() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("listfor", this.researchRepo.findAll());
        return mv;
    }
}
