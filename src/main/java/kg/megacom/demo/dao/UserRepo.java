package kg.megacom.demo.dao;

import kg.megacom.demo.models.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, Long> {
}
