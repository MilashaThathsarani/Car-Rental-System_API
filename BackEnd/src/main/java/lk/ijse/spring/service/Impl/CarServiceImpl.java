package lk.ijse.spring.service.Impl;
import lk.ijse.spring.dto.CarDTO;
import lk.ijse.spring.entity.Car;
import lk.ijse.spring.repo.CarRepo;
import lk.ijse.spring.service.CarService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CarServiceImpl implements CarService {

    @Autowired
    CarRepo carRepo;

    @Autowired
    ModelMapper modelMapper;
    @Override
    public void saveCar(CarDTO dto) {
        if (!carRepo.existsById(dto.getCarNumber())) {
            carRepo.save(modelMapper.map(dto, Car.class));
        } else {
            throw new RuntimeException("Customer Already Exist..!");
        }
    }

    @Override
    public void deleteCar(String id) {
        if (carRepo.existsById(id)){
            carRepo.deleteById(id);
        }else{
            throw new RuntimeException("Please check the Customer ID.. No Such Customer..!");
        }
    }

    @Override
    public void updateCar(CarDTO dto) {
        if (carRepo.existsById(dto.getCarNumber())) {
            carRepo.save(modelMapper.map(dto,Car.class));
        } else {
            throw new RuntimeException("No Such Customer To Update..! Please Check the ID..!");
        }
    }

    @Override
    public CarDTO searchCar(String id) {
        if (carRepo.existsById(id)){
            return modelMapper.map(carRepo.findById(id).get(),CarDTO .class);
        }else{
            throw new RuntimeException("No Customer For "+id+" ..!");
        }
    }

    @Override
    public List<CarDTO> getAllCars() {
        List<Car> all = carRepo.findAll();
        return modelMapper.map(all,new TypeToken<List<CarDTO>>(){
        }.getType());
    }

    @Override
    public CarDTO findBrand(String id) {
        return null;
    }
}
