package de.tiupe.oauth2client.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.security.Principal;

@Controller
public class WebController {

    @RequestMapping(value = "securedPage")
    public String securedPage(Model model, Principal principal) {
        System.out.println(principal.getName());
        return "securedPage";
    }

    @RequestMapping(value = "/")
    public String index(Model model, Principal principal) {
        return "index";
    }

}
