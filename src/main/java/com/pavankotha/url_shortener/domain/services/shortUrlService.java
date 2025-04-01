package com.pavankotha.url_shortener.domain.services;

import com.pavankotha.url_shortener.domain.entities.ShortUrl;
import com.pavankotha.url_shortener.domain.repositories.ShortUrlRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class shortUrlService {

    private final ShortUrlRepository shortUrlRepository;
    public  shortUrlService(ShortUrlRepository shortUrlRepository){
        this.shortUrlRepository=shortUrlRepository;
    }
    public List<ShortUrl> findAllShortUrls(){
        return shortUrlRepository.findPublicShortUrls();
    }

}
