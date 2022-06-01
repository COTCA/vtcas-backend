package ru.vtcas.ServicePrice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.vtcas.ServicePrice.refs.dto.CarDto;
import ru.vtcas.ServicePrice.refs.service.CarService;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarService service;

    public CarController(CarService service) {
        this.service = service;
    }

    @GetMapping("/models")
    public List<CarDto> getModelsByMake(@RequestParam String make) {
        return service.getModelsByMake(make);
    }
}
