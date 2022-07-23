//package lk.ijse.spring.service.Impl;
//import lk.ijse.spring.dto.VehicleDTO;
//import lk.ijse.spring.entity.Vehicle;
//import lk.ijse.spring.repo.VehicleRepo;
//import lk.ijse.spring.service.VehicleService;
//import org.modelmapper.ModelMapper;
//import org.modelmapper.TypeToken;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//import java.util.List;
//
//@Service
//@Transactional
//public class VehicleServiceImpl implements VehicleService {
//
//    @Autowired
//    private VehicleRepo vehicleRepo;
//
//    @Autowired
//    private ModelMapper modelMapper;
//
//    @Override
//    public void saveVehicle(VehicleDTO dto) {
//        if (!vehicleRepo.existsById(dto.getVehicleId())) {
//            vehicleRepo.save(modelMapper.map(dto, Vehicle.class));
//        } else {
//            throw new RuntimeException("Customer Already Exist..!");
//        }
//    }
//
//    @Override
//    public void deleteVehicle(String id) {
//        if (vehicleRepo.existsById(id)){
//            vehicleRepo.deleteById(id);
//        }else{
//            throw new RuntimeException("Please check the Customer ID.. No Such Customer..!");
//        }
//    }
//
//    @Override
//    public void updateVehicle(VehicleDTO dto) {
//        if (vehicleRepo.existsById(dto.getVehicleId())) {
//            vehicleRepo.save(modelMapper.map(dto,Vehicle.class));
//        } else {
//            throw new RuntimeException("No Such Customer To Update..! Please Check the ID..!");
//        }
//    }
//
//    @Override
//    public VehicleDTO searchVehicle(String id) {
//        if (vehicleRepo.existsById(id)){
//            return modelMapper.map(vehicleRepo.findById(id).get(), VehicleDTO.class);
//        }else{
//            throw new RuntimeException("No Customer For "+id+" ..!");
//        }
//    }
//
//    @Override
//    public List<VehicleDTO> getAllVehicles() {
//        List<Vehicle> all = vehicleRepo.findAll();
//        return modelMapper.map(all,new TypeToken<List<VehicleDTO>>(){
//        }.getType());
//    }
//
//}
