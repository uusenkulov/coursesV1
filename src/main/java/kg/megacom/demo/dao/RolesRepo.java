package kg.megacom.demo.dao;

import kg.megacom.demo.models.entities.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesRepo extends JpaRepository<Roles, Long> {
}
