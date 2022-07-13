package main.entity;


@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Driver {
    @Id
    private String licenceNo;
    private String name;
    private String address;
    private int contactNo;
    private String nicNo;
    private String username;
    private String password;
    private final boolean availability = true;

    @OneToMany(mappedBy = "driver",cascade = CascadeType.ALL)
    private List<CarRent> rentals = new ArrayList<>();
}

