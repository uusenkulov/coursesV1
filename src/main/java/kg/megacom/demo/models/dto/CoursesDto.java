package kg.megacom.demo.models.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
public class CoursesDto {

    private Long id;
    private String name;
    private Date startDate;
    private Date endDate;

    private Teachers teacher;

      private List<Students> studentsList;
}
