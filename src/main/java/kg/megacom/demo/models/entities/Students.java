package kg.megacom.demo.models.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "student")
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fullName;
    @ManyToMany
    @JoinTable(name = "courses_students", joinColumns = @JoinColumn(name = "crs_crs_id"),
            inverseJoinColumns = @JoinColumn(name = "std_std_id"))
    private List<Courses> coursesList;

}
