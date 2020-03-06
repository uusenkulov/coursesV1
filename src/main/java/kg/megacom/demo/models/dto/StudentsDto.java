package kg.megacom.demo.models.entities;

import lombok.Data;

import javax.persistence.*;

@Data
public class StudentsDto {

    private Long id;
    private String fullName;

    private Courses courses;

}
