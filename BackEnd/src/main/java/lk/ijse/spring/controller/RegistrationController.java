package lk.ijse.spring.controller;

import lk.ijse.spring.dto.RegistrationDTO;
import lk.ijse.spring.service.RegistrationService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/api/v1/regisration")
@CrossOrigin
public class RegistrationController {

    @Autowired
    RegistrationService registrationService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllRegistrations() {
        return new ResponseUtil(200, "Ok", registrationService.getAllRegistrations());
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveRegistration(@ModelAttribute RegistrationDTO registrationDTO) {
        registrationService.saveRegistration(registrationDTO);
        return new ResponseUtil(200, "Ok", null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateRegistration(@RequestBody RegistrationDTO registrationDTO) {
        registrationService.updateRegistration(registrationDTO);
        return new ResponseUtil(200, "Ok", null);
    }

    @DeleteMapping(params = {"id"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteRegistration(@RequestParam String id) {
        registrationService.deleteRegistration(id);
        return new ResponseUtil(200, "Ok", null);
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchAdmin(@PathVariable String id) {
        return new ResponseUtil(200, "Ok", registrationService.searchRegistration(id));
    }

    @GetMapping(path = "/{nic}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil findNic(@PathVariable String nic) {
        RegistrationDTO registrationDTO = registrationService.findNic(nic);
        return new ResponseUtil(200, "Done", registrationDTO);
    }

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveFile(@RequestPart("myFile") MultipartFile myFile) {

        System.out.println(myFile.getOriginalFilename());

        try {
            String projectPath = new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile().getParentFile().getAbsolutePath();
            File uploadsDir = new File(projectPath + "/uploads");
            uploadsDir.mkdir();
            myFile.transferTo(new File(uploadsDir.getAbsolutePath() + "/" + myFile.getOriginalFilename()));
            return true;
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    @GetMapping(path = "/email/{email}/{password}", produces = MediaType.APPLICATION_JSON_VALUE)
    public RegistrationDTO findEmailAndPassword(@PathVariable String email, @PathVariable String password) {
        if (!email.equals("") && !password.equals("")) {
            if (email.equals(password)) {
                return registrationService.findEmailAndPassword(email, password);
            }
        }
        return null;
    }


    @PostMapping(path = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil findEmailAndPassword(@RequestBody RegistrationDTO user) {
        if (!user.getEmail().equals("") && !user.getPassword().equals("")) {
            RegistrationDTO dto = registrationService.findEmailAndPassword(user.getEmail(), user.getPassword());
            return new ResponseUtil(200, "done", dto);
        }
        return null;
    }
}

//    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity findUser(@RequestBody RegistrationDTO user) {
//        if (user.getEmail().trim().length() <= 0) {
//            throw new NotFoundException("No email");
//        }
//        regSrevice.findUser(user.getEmail());
//        return new ResponseEntity(new StandradResponse("200", "Done", user.getEmail()), HttpStatus.OK);
//    }
//

