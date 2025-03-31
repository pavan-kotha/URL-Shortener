package com.pavankotha.url_shortener;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("title","URL Shortener!");
        return "index";
    }
    // adding comments to check the git status

    @GetMapping("/about")
    public String about(){
        return "about";
    }
}
