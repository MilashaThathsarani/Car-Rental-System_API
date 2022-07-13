package main.controller;

import main.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/driver")
@CrossOrigin
public class DriverController {

    @Autowired
    DriverService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllDrivers() {
        return new ResponseUtil(200, "Ok", service.getAllDrivers());
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveDriver(DriverDTO dto) {
        service.saveDriver(dto);
        return new ResponseUtil(200, "Saved", null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateCustomer(@RequestBody DriverDTO dto) {
        service.updateDriver(dto);
        return new ResponseUtil(200, "Updated", null);
    }

    @GetMapping(path = "/getAllAvailableDrivers",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllAvailableDrivers(){
        return new ResponseUtil(200,"Ok",service.getAllAvailableDrivers());
    }

    @GetMapping(path = "/getAllNonAvailableDrivers",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllNonAvailableDrivers(){
        return new ResponseUtil(200,"Ok",service.getAllNonAvailableDrivers());
    }

    @GetMapping(path = "/count/{availability}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getCountOfCustomersByAvailability(@PathVariable boolean availability){
        return new ResponseUtil(200,"Ok",service.getCountOfDriversByStatus(availability));
    }
}
