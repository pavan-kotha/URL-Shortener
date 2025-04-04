package com.pavankotha.url_shortener.domain.web.contollers;

import com.pavankotha.url_shortener.domain.entities.ShortUrl;
import com.pavankotha.url_shortener.domain.services.shortUrlService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    private final shortUrlService shortUrlService;


    public HomeController(shortUrlService shortUrlService)
    {
        this.shortUrlService=shortUrlService;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<ShortUrl> shortUrls=shortUrlService.findAllShortUrls();
        model.addAttribute("shortUrls", shortUrls);
        model.addAttribute("baseUrl","http://localhost:8080");
        return "index";
    }
}