package main.entity;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Admin {
    @Id
    private String adminId;
    private String name;
    private String address;
    private String contact;
    private String email;
    private String username;
    private String password;
}
