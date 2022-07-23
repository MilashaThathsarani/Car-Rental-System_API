package lk.ijse.spring.service.Impl;

import lk.ijse.spring.dto.BookingDTO;
import lk.ijse.spring.repo.BookingRepo;
import lk.ijse.spring.service.BookingService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;

public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingRepo bookingRepo;

    @Autowired
    ModelMapper modelMapper;
    @Override
    public void addBooking(BookingDTO bookingDTO) {

    }

    @Override
    public void deleteBooking(String s) {

    }

    @Override
    public BookingDTO searchBooking(String s) {
        return null;
    }

    @Override
    public ArrayList<BookingDTO> getAllBookings() {
        return null;
    }

    @Override
    public void updateBooking(BookingDTO bookingDTO) {

    }

    @Override
    public Long countDate(Date date, Date date1) {
        return null;
    }

    @Override
    public String getLastID() {
        return null;
    }
}
