package link.staticks.backoffice.user.repository;

import link.staticks.backoffice.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
