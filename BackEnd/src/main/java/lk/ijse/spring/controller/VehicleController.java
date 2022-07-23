//package lk.ijse.spring.controller;
//
//import lk.ijse.spring.dto.DriverDTO;
//import lk.ijse.spring.dto.VehicleDTO;
//import lk.ijse.spring.service.DriverService;
//import lk.ijse.spring.service.VehicleService;
//import lk.ijse.spring.util.ResponseUtil;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("api/v1/vehicle")
//@CrossOrigin
//public class VehicleController {
//    @Autowired
//    VehicleService vehicleService;
//
//    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseUtil getAllVehicles() {
//        return new ResponseUtil(200,"Ok",vehicleService.getAllVehicles());
//    }
//
//    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseUtil saveVehicle(@ModelAttribute VehicleDTO vehicleDTO) {
//        vehicleService.saveVehicle(vehicleDTO);
//        return new ResponseUtil(200,"Ok",null);
//    }
//
//    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseUtil updateVehicle(@RequestBody VehicleDTO vehicleDTO) {
//        vehicleService.updateVehicle(vehicleDTO);
//        return new ResponseUtil(200,"Ok",null);
//    }
//
//    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseUtil deleteVehicle(@RequestParam String id) {
//        vehicleService.deleteVehicle(id);
//        return new ResponseUtil(200,"Ok",null);
//    }
//
//    @GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseUtil searchVehicle(@PathVariable String id) {
//        return new ResponseUtil(200,"Ok",vehicleService.searchVehicle(id));
//    }
//}
