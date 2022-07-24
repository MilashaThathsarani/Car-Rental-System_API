package lk.ijse.spring.controller;

import lk.ijse.spring.dto.BookingDTO;
import lk.ijse.spring.service.BookingService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/admin")
@CrossOrigin
public class BookingController {
    @Autowired
    BookingService bookingService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllBookings() {
        return new ResponseUtil(200,"Ok",bookingService.getAllBookings());
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveBooking(@ModelAttribute BookingDTO bookingDTO) {
        bookingService.addBooking(bookingDTO);
        return new ResponseUtil(200,"Ok",null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateBooking(@RequestBody BookingDTO bookingDTO) {
        bookingService.updateBooking(bookingDTO);
        return new ResponseUtil(200,"Ok",null);
    }

    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteBooking(@RequestParam String id) {
        bookingService.deleteBooking(id);
        return new ResponseUtil(200,"Ok",null);
    }

    @GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchBooking(@PathVariable String id) {
        return new ResponseUtil(200,"Ok",bookingService.searchBooking(id));
    }
}
