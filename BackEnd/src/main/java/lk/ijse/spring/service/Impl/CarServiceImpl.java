package lk.ijse.spring.service.Impl;
import lk.ijse.spring.dto.CarDTO;
import lk.ijse.spring.entity.Car;
import lk.ijse.spring.repo.CarRepo;
import lk.ijse.spring.service.CarService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CarServiceImpl implements CarService {

    @Autowired
    CarRepo carRepo;

    @Autowired
    ModelMapper modelMapper;
    @Override
    public void saveCar(CarDTO carDTO) {
        if (!carRepo.existsById(carDTO.getCarNumber())) {
            carRepo.save(modelMapper.map(carDTO, Car.class));
        } else {
            throw new RuntimeException("Customer Already Exist..!");
        }
    }

    @Override
    public void updateCar(CarDTO carDTO) {
        if (carRepo.existsById(carDTO.getCarNumber())) {
            carRepo.save(modelMapper.map(carDTO,Car.class));
        } else {
            throw new RuntimeException("No Such Customer To Update..! Please Check the ID..!");
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
    public CarDTO findBrand(String brand) {
        Optional<Car> carBrand = carRepo.findByBrand(brand);
        if (carBrand.isPresent()) {
            return modelMapper.map(carBrand.get(), CarDTO.class);
        }
        return null;
    }
}
