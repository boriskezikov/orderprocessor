package ru.taxi.orderprocessor.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.taxi.orderprocessor.dto.CarCreateUpdateOperationDto;
import ru.taxi.orderprocessor.dto.CarDto;
import ru.taxi.orderprocessor.logic.CarOperationsService;

import javax.validation.Valid;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/cars")
public class CarOperationsController {

    private final CarOperationsService carOperationsService;

    @PostMapping
    public CarDto createCar(@Valid @RequestBody CarCreateUpdateOperationDto carCreateUpdateOperationDto) {
        log.debug("createCar.in - dto: {}", carCreateUpdateOperationDto);
        var carEntity = carOperationsService.create(carCreateUpdateOperationDto);
        log.debug("createCar.out - response: {}", carEntity);
        return carEntity;
    }

    @PutMapping
    public CarDto updateCar(@Valid @RequestBody CarCreateUpdateOperationDto carDto) {
        log.debug("updateCar.in - dto: {}", carDto);
        var carEntity = carOperationsService.update(carDto);
        log.debug("updateCar.out - response: {}", carEntity);
        return carEntity;
    }

}
