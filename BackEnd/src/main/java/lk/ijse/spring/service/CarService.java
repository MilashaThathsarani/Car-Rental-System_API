package lk.ijse.spring.service;

import lk.ijse.spring.dto.CarDTO;

import java.util.List;

public interface CarService {
    public void saveCar(CarDTO carDTO);

    public void updateCar(CarDTO carDTO);

    public void deleteCar(String id);

    public CarDTO searchCar(String id);

    public List<CarDTO> getAllCars();

    CarDTO findBrand(String id);
}
