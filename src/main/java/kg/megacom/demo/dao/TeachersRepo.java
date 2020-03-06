package kg.megacom.demo.dao;

import kg.megacom.demo.models.entities.Teachers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeachersRepo extends JpaRepository<Teachers, Long> {
}
