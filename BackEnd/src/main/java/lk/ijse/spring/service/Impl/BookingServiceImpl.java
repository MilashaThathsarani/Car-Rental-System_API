package lk.ijse.spring.service.Impl;

import lk.ijse.spring.dto.AdminAccountDTO;
import lk.ijse.spring.dto.BookingDTO;
import lk.ijse.spring.entity.AdminAccount;
import lk.ijse.spring.entity.Booking;
import lk.ijse.spring.repo.BookingRepo;
import lk.ijse.spring.service.BookingService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingRepo bookingRepo;

    @Autowired
    ModelMapper modelMapper;
    @Override
    public void addBooking(BookingDTO bookingDTO) {
        if (!bookingRepo.existsById(bookingDTO.getRequestNumber())) {
            bookingRepo.save(modelMapper.map(bookingDTO, Booking.class));
        } else {
            throw new RuntimeException("Customer Already Exist..!");
        }
    }

    @Override
    public void deleteBooking(String s) {
        if (bookingRepo.existsById(s)){
            bookingRepo.deleteById(s);
        }else{
            throw new RuntimeException("Please check the Customer ID.. No Such Customer..!");
        }
    }

    @Override
    public BookingDTO searchBooking(String s) {
        if (bookingRepo.existsById(s)){
            return modelMapper.map(bookingRepo.findById(s).get(), BookingDTO.class);
        }else{
            throw new RuntimeException("No Customer For "+s+" ..!");
        }
    }

    @Override
    public ArrayList<BookingDTO> getAllBookings() {
        List<Booking> all = bookingRepo.findAll();
        return modelMapper.map(all,new TypeToken<List<BookingDTO>>(){
        }.getType());
    }

    @Override
    public void updateBooking(BookingDTO bookingDTO) {
        if (bookingRepo.existsById(bookingDTO.getRequestNumber())) {
            bookingRepo.save(modelMapper.map(bookingDTO,Booking.class));
        } else {
            throw new RuntimeException("No Such Customer To Update..! Please Check the ID..!");
        }
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
