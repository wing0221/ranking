package com.springproject01.demo.web.ranking;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/ranking")
@RequiredArgsConstructor
public class RankingContoller {

    @GetMapping("/new")
    public String UserNew() {
        return "/ranking/new";
    }

}
