package comlearnjwt.learnjwt.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private Role role;

}
