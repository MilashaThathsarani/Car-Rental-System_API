package main.dto;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class DriverDTO {
    private String licenceNo;
    private String name;
    private String address;
    private int contactNo;
    private String nicNo;
    private String username;
    private String password;
    private final boolean availability = true;
}

