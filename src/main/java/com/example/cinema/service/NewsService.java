package com.example.cinema.service;

import com.example.cinema.dto.NewsDTO;
import com.example.cinema.dto.NewsDetailsDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Collections;

/**
 * @author <a href="mailto:andrew.guselnikov@test.com">Andrew Guselnikov</a>
 */
@Service
public class NewsService {

    public Page<NewsDTO> getNews(Pageable pageable, String searchText) {
        return new PageImpl<>(Collections.singletonList(new NewsDTO()));
    }

    public NewsDetailsDTO getNewsDetails(String id) {
        return new NewsDetailsDTO();
    }

    public void deleteNewsDetails(String id) {

    }

    public NewsDetailsDTO updateNewsDetails(String id, NewsDetailsDTO newsDetailsDTO) {
        return newsDetailsDTO;
    }

    public NewsDetailsDTO createNewsDetails(NewsDetailsDTO newsDetailsDTO) {
        return newsDetailsDTO;
    }
}
