package kg.megacom.demo.models.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@lombok.Data
@Entity
@Table(name = "courses")
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Date startDate;
    private Date endDate;

    @ManyToOne
    @JoinColumn(name = "students_id")
    private Teachers teachers;
}
