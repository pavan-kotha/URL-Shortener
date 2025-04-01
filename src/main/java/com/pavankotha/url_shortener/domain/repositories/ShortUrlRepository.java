package com.pavankotha.url_shortener.domain.repositories;

import com.pavankotha.url_shortener.domain.entities.ShortUrl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ShortUrlRepository extends JpaRepository<ShortUrl,Long> {
        @Query("select su from ShortUrl su where su.isPrivate=false order by su.createdAt DESC")
        List<ShortUrl> findPublicShortUrls();
}
