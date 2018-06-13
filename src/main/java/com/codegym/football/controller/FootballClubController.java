package com.codegym.football.controller;

import com.codegym.football.model.FootballClub;
import com.codegym.football.service.FootballService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FootballClubController {

    @Autowired
    private FootballService footballService;

    @GetMapping("/footballclub")
    public ModelAndView listFootball(){
        Iterable<FootballClub> footballClubs = footballService.findAll();
        ModelAndView modelAndView = new ModelAndView("/club/list");
        modelAndView.addObject("footballClubs",footballClubs);
        return modelAndView;
    }

    @GetMapping("/create-footballclub")
    public ModelAndView createForm(){

        ModelAndView modelAndView = new ModelAndView("/club/create");
        modelAndView.addObject("footballclub",new FootballClub());
        return modelAndView;
    }

    @PostMapping("/create-footballclub")
        public ModelAndView createFootballClub(@ModelAttribute("footballClub") FootballClub footballClub){
        footballService.save(footballClub);
        ModelAndView modelAndView = new ModelAndView("/club/create");
        modelAndView.addObject("footballclub", footballClub);
        modelAndView.addObject("message","Create new Football Club successFully");
        return modelAndView;
    }

    @GetMapping("/edit-footballclub/{id}")
    public ModelAndView editForm(@PathVariable ("id") Long id){
        FootballClub footballClub = footballService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/club/edit");
        modelAndView.addObject("footballclub",footballClub);
        return modelAndView;
    }

    @PostMapping("/edit-footballclub/{id}")
    public ModelAndView edit (@ModelAttribute ("footballclub") FootballClub footballClub){
        footballService.save(footballClub);
        ModelAndView modelAndView = new ModelAndView("/club/edit");
        modelAndView.addObject("fooballClub",footballClub);
        modelAndView.addObject("message", "update footballclub");
        return modelAndView;
    }

    @GetMapping("/delete-footballclub/{id}")
    public ModelAndView deleteForm (){

    }
}
