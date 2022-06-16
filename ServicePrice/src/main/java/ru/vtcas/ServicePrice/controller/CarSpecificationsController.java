package ru.vtcas.ServicePrice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vtcas.ServicePrice.refs.domain.specification.BodyType;
import ru.vtcas.ServicePrice.refs.domain.specification.DrivetrainType;
import ru.vtcas.ServicePrice.refs.domain.specification.EngineType;
import ru.vtcas.ServicePrice.refs.domain.specification.TransmissionType;
import ru.vtcas.ServicePrice.refs.service.CarSpecificationsService;

import java.util.List;

@RestController
@RequestMapping("/car-specifications")
@RequiredArgsConstructor
public class CarSpecificationsController {

    private final CarSpecificationsService service;

    @GetMapping("/transmission-types")
    public List<TransmissionType> getAllTransmissionTypes() {
        return service.getAllTransmissionTypes();
    }

    @GetMapping("/body-types")
    public List<BodyType> getAllBodyTypes() {
        return service.getAllBodyTypes();
    }

    @GetMapping("/engine-types")
    public List<EngineType> getAllEngineTypes() {
        return service.getAllEngineTypes();
    }

    @GetMapping("/drivetrain-types")
    public List<DrivetrainType> getAllDrivetrainTypes() {
        return service.getAllDrivetrainTypes();
    }

}
