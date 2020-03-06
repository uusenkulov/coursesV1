package kg.megacom.demo.dao;

import kg.megacom.demo.models.entities.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepo extends JpaRepository<Courses, Long> {
}
