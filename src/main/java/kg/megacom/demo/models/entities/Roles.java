package kg.megacom.demo.models.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "role")
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String role;
}
