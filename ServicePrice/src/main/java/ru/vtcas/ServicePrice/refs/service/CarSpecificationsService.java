package ru.vtcas.ServicePrice.refs.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.vtcas.ServicePrice.refs.domain.specification.BodyType;
import ru.vtcas.ServicePrice.refs.domain.specification.DrivetrainType;
import ru.vtcas.ServicePrice.refs.domain.specification.EngineType;
import ru.vtcas.ServicePrice.refs.domain.specification.TransmissionType;
import ru.vtcas.ServicePrice.refs.repository.specification.BodyTypeRepository;
import ru.vtcas.ServicePrice.refs.repository.specification.DrivetrainTypeRepository;
import ru.vtcas.ServicePrice.refs.repository.specification.EngineTypeRepository;
import ru.vtcas.ServicePrice.refs.repository.specification.TransmissionTypeRepository;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class CarSpecificationsService {

    private final TransmissionTypeRepository transmissionTypeRepository;
    private final BodyTypeRepository bodyTypeRepository;
    private final EngineTypeRepository engineTypeRepository;
    private final DrivetrainTypeRepository drivetrainTypeRepository;

    public List<TransmissionType> getAllTransmissionTypes() {
        log.info("[Tech] [Info] Getting all transmission types");
        return transmissionTypeRepository.findAll();
    }

    public List<BodyType> getAllBodyTypes() {
        log.info("[Tech] [Info] Getting all body types");
        return bodyTypeRepository.findAll();
    }

    public List<EngineType> getAllEngineTypes() {
        log.info("[Tech] [Info] Getting all engine types");
        return engineTypeRepository.findAll();
    }

    public List<DrivetrainType> getAllDrivetrainTypes() {
        log.info("[Tech] [Info] Getting all drivetrain types");
        return drivetrainTypeRepository.findAll();
    }

}
