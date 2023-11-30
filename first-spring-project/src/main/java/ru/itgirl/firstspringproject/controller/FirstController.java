package ru.itgirl.firstspringproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/dayOfWeek")
    public String writeDayOfWeek(@RequestParam(value = "name", defaultValue = "День Недели") String name) {
        name = switch (name) {
            case ("MONDAY") -> "понедельник";
            case ("TUESDAY") -> "вторник";
            case ("WEDNESDAY") -> "среда";
            case ("THURSDAY") -> "четверг";
            case ("FRIDAY") -> "пятница";
            case ("SATURDAY") -> "суббота";
            case ("SUNDAY") -> "воскресенье";
            default -> "День Недели";
        };
        return String.format("Сегодня %s!", name);
    }
}

