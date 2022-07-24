package lk.ijse.spring.service;

import lk.ijse.spring.dto.BookingDTO;

import java.util.ArrayList;
import java.util.Date;

public interface BookingService {
    public void addBooking(BookingDTO bookingDTO);

    public void updateBooking(BookingDTO bookingDTO);

    public void deleteBooking(String id);

    public BookingDTO searchBooking(String id);

    ArrayList<BookingDTO> getAllBookings();

    Long countDate(Date date, Date date1);

    String getLastID();
}
