package ru.vtcas.ServicePrice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vtcas.ServicePrice.refs.dto.CarMakeDto;
import ru.vtcas.ServicePrice.refs.service.CarMakeService;

import java.util.List;

@RestController
@RequestMapping("/car-makes")
public class CarMakeController {

    private final CarMakeService service;

    public CarMakeController(CarMakeService service) {
        this.service = service;
    }

    @GetMapping
    public List<CarMakeDto> getAll() {
        return service.getAll();
    }
}
