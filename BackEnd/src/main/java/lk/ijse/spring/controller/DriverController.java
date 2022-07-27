package lk.ijse.spring.controller;

import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.service.DriverService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/driver")
@CrossOrigin
public class DriverController {

    @Autowired
    private DriverService driverService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllDrivers() {
        return new ResponseUtil(200,"Ok",driverService.getAllDrivers());
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveDriver(@ModelAttribute DriverDTO driverDTO) {
        driverService.saveDriver(driverDTO);
        return new ResponseUtil(200,"Ok",null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateDriver(@RequestBody DriverDTO driverDTO) {
        driverService.updateDriver(driverDTO);
        return new ResponseUtil(200,"Ok",null);
    }

    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteDriver(@RequestParam String id) {
        driverService.deleteDriver(id);
        return new ResponseUtil(200,"Ok",null);
    }

    @GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchDriver(@PathVariable String id) {
        return new ResponseUtil(200,"Ok",driverService.searchDriver(id));
    }

    @GetMapping(path = "/name/{dName}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil findName(@PathVariable String dName) {
        DriverDTO driverDTO = driverService.findName(dName);
        return new ResponseUtil(200, "Done", driverDTO);
    }

}
