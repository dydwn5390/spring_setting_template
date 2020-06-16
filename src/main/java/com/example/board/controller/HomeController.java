package com.example.board.controller;

import com.example.board.mapper.TestMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
public class HomeController {
    private final TestMapper testMapper;

    @RequestMapping(value = {"/", ""})
    public String index() {
        int a = testMapper.test();
        log.info("{}", a);
        return "index";
    }
}
