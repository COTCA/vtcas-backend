package ru.vtcas.ServicePrice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.vtcas.ServicePrice.refs.service.CarService;

import java.util.List;

@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor
public class CarController {

    private final CarService service;

    @GetMapping("/makes")
    public List<String> getAllMakes() {
        return service.getAllMakes();
    }

    @GetMapping("/models")
    public List<String> getModelsByMake(@RequestParam String make) {
        return service.getModelsByMakes(make);
    }

}
