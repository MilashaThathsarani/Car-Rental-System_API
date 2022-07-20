package lk.ijse.spring.service;
import lk.ijse.spring.dto.PaymentDTO;

import java.util.List;

public interface PaymentService {
    public void savePayment(PaymentDTO dto);

    public void deletePayment(String id);

    public void updatePayment(PaymentDTO dto);

    public PaymentDTO searchPayment(String id);

    public List<PaymentDTO> getAllDrivers();
}
