package ru.taxi.orderprocessor.logic;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.taxi.orderprocessor.dao.DriverOperationsRepository;
import ru.taxi.orderprocessor.dto.DriverDto;
import ru.taxi.orderprocessor.entity.DriverEntity;
import ru.taxi.orderprocessor.mapper.DriverMapper;

@Slf4j
@Service
@RequiredArgsConstructor
public class DriverOperationsService {

    private final DriverOperationsRepository driverOperationsRepository;
    private final CarOperationsService carOperationsService;
    private final DriverMapper driverMapper;

    public DriverEntity create(DriverDto dto) {
        DriverEntity driverEntity = driverMapper.map(dto);
        var car = carOperationsService.findByNumberInternal(dto.getCarNumber());
        driverEntity.setCar(car);
        return driverOperationsRepository.save(driverEntity);
    }
}
