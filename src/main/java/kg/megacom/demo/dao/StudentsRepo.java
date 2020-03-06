package kg.megacom.demo.dao;

import kg.megacom.demo.models.entities.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepo extends JpaRepository<Students, Long> {
}
