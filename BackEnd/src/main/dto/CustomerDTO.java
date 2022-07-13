package main.dto;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class CustomerDTO {
    private String customerId;
    private String name;
    private String address;
    private int contactNo;
    private String email;
    private String nicNo;
    private String nicFrontImg;
    private String nicBackImg;
    private String licenceNo;
    private String licenceImg;
    private String username;
    private String password;
    private final String status = "Pending";
}