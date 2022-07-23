package lk.ijse.spring.service.Impl;

import lk.ijse.spring.dto.CarDTO;
import lk.ijse.spring.repo.CarRepo;
import lk.ijse.spring.service.CarService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CarServiceImpl implements CarService {

    @Autowired
    CarRepo carRepo;

    @Autowired
    ModelMapper modelMapper;
    @Override
    public void saveCar(CarDTO dto) {

    }

    @Override
    public void deleteCar(String id) {

    }

    @Override
    public void updateCar(CarDTO dto) {

    }

    @Override
    public CarDTO searchCar(String id) {
        return null;
    }

    @Override
    public List<CarDTO> getAllCars() {
        return null;
    }

    @Override
    public CarDTO findBrand(String id) {
        return null;
    }
}
