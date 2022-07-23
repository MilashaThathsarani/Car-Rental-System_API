//package lk.ijse.spring.service.Impl;
//
//import lk.ijse.spring.dto.PaymentDTO;
//import lk.ijse.spring.entity.Payment;
//import lk.ijse.spring.repo.PaymentRepo;
//import lk.ijse.spring.service.PaymentService;
//import org.modelmapper.ModelMapper;
//import org.modelmapper.TypeToken;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.List;
//
//public class PaymentServiceImpl implements PaymentService {
//
//    @Autowired
//    PaymentRepo paymentRepo;
//
//    @Autowired
//    ModelMapper modelMapper;
//
//    @Override
//    public void savePayment(PaymentDTO dto) {
//        if (!paymentRepo.existsById(dto.getPaymentId())) {
//            paymentRepo.save(modelMapper.map(dto, Payment.class));
//        } else {
//            throw new RuntimeException("Payment Already Exists...");
//        }
//    }
//
//    @Override
//    public void deletePayment(String id) {
//        if (paymentRepo.existsById(id)) {
//            paymentRepo.deleteById(id);
//        } else {
//            throw new RuntimeException("No Such Payment To Delete");
//        }
//    }
//
//    @Override
//    public void updatePayment(PaymentDTO dto) {
//        if (paymentRepo.existsById(dto.getPaymentId())) {
//            paymentRepo.save(modelMapper.map(dto, Payment.class));
//        } else {
//            throw new RuntimeException("No Such Payment To Update");
//        }
//    }
//
//    @Override
//    public PaymentDTO searchPayment(String id) {
//        if (paymentRepo.existsById(id)) {
//            return modelMapper.map(paymentRepo.findById(id).get(), PaymentDTO.class);
//        } else {
//            throw new RuntimeException("Payment Not Found...");
//        }
//    }
//
//    @Override
//    public List<PaymentDTO> getAllPayments() {
//        return modelMapper.map(paymentRepo.findAll(), new TypeToken<List<PaymentDTO>>() {
//        }.getType());
//    }
//
////    @Override
////    public List<PaymentDTO> getAllDrivers() {
////        return modelMapper.map(paymentRepo.getAllPaymentsByCustomerId(customerId), new TypeToken<List<PaymentDTO>>() {
////        }.getType());
////    }
//}
