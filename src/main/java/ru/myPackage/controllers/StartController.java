package ru.myPackage.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.myPackage.services.SensorService;

@Controller
@RequestMapping("/start")
@RequiredArgsConstructor
public class StartController {

    private final SensorService sensorService;

    @GetMapping
    public String getAllSensors(Model model) {
        model.addAttribute("sensors", sensorService.getAllSensors());

        return "start/index";
    }
}
