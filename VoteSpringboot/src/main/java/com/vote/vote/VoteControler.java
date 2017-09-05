package com.vote.vote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.Objects;

@Controller
public class VoteControler {

    Cookie cookies = new Cookie("foo","default");

   private int set_voter_id(String choice){
        int voter_id = 0;
        if (Objects.equals(choice, "CAT")) {
            voter_id = 1;
        }else if (Objects.equals(choice, "DOG")){
            voter_id = 2;
        }
        return voter_id;
    }

    @Autowired
    VoteRepository voteRepository;

    @RequestMapping(value = "/")
    String home(Model model) {
        model.addAttribute("now", LocalDateTime.now().getDayOfWeek());
        return "index";
    }

    @RequestMapping(value = "/vote", method = RequestMethod.GET)
    public String voteForm(HttpServletRequest httpServletRequest, Model model){
        model.addAttribute(httpServletRequest.getContextPath());

        return "voteModel";
    }


    @RequestMapping(value = "/vote", method = RequestMethod.POST)
    public String voteFormResult(HttpServletRequest request, Model model){
        String choice = request.getParameter("choice");
        cookies.getValue();
        model.addAttribute("choix", choice);
        model.addAttribute("cookie", cookies);
        VoteModel voteModel = new VoteModel(set_voter_id(choice), choice);
        voteRepository.save(voteModel);
        cookies.setValue(choice);
        return "voteModelResult";
    }

    @RequestMapping(value = "/vote/create", method = RequestMethod.POST)
    public String createVote(Model model){
        model.addAttribute("choix", new VoteModel());
        return "voteModelResult";
    }
}
