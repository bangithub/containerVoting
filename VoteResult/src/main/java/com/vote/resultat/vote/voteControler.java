package com.vote.resultat.vote;

import com.fasterxml.jackson.annotation.JsonGetter;
import jdk.nashorn.api.scripting.JSObject;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import sun.misc.Regexp;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class voteControler {

    @Autowired
    private ResultatService resultatService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(ModelMap model) {
        model.addAttribute("now", LocalDateTime.now().getDayOfWeek());

        List<votes> obj= resultatService.findAll();
        Regexp regexp = new Regexp("([DOG])|([CAT])\\w+");
        String choice = null;
        for (int i= 0; i < obj.size(); i++){
            System.err.println(obj.get((obj.size()-1)));
            choice = String.valueOf(obj.get((obj.size()-1)));
        }
        model.addAttribute("result", choice);
        return "result";
    }

/*
    @RequestMapping(value = "/test0", method = RequestMethod.GET)
    public String test(@ModelAttribute votes votes, ModelMap modelMap) {
        ModelAndView result = new ModelAndView("index");
        result.addObject("now", this.resultatService.findAll());

        return "index";
    }


    @RequestMapping(value = "/test1", method = RequestMethod.POST)
    public String test0(Model model) {
        votes avote = null;
        avote.setId(10);
        avote.setVote("RABBIT");
        model.addAttribute("now", resultatService.saveAndFlush(avote));

        return "index";
    }

    @RequestMapping(name = "/resultat", method = RequestMethod.GET)
    public String getVote(ModelMap modelMap){
        modelMap.addAttribute("result",  resultatService.findAll());
        return "result";
    }*/
}

