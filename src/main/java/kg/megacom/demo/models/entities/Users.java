package kg.megacom.demo.models.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String login;
    private String password;
    @OneToOne
    @JoinColumn(name = "roles_id")
    private Roles role;

}
