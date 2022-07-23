package lk.ijse.spring.service;

import lk.ijse.spring.dto.BookingDTO;

import java.util.Date;

public interface BookingService {
    public void addBooking(BookingDTO bookingDTO);

    public void deleteBooking(String s);

    public BookingDTO searchBooking(String s);

    java.util.ArrayList<BookingDTO> getAllBookings();

    void updateBooking(BookingDTO bookingDTO);

    Long countDate(Date date, Date date1);

    String getLastID();
}
