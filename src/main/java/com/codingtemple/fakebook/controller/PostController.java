package com.codingtemple.fakebook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PostController {
    @RequestMapping("/")
    public String listPosts() {
        return "home";
    }
}
