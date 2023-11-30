package ru.itgirl.firstspringproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.itgirl.firstspringproject.model.DayOfWeek;

@RestController
public class FirstController {
    @GetMapping("/dayOfWeek")
    public String writeDayOfWeek(@RequestParam(required = false) String name) {
        DayOfWeek day = DayOfWeek.NOT_FOUND;
        if (name != null){
            day = DayOfWeek.valueOf(name);
        };
        return String.format("Сегодня %s!", day);
    }
}

