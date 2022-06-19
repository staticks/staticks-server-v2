package link.staticks.backoffice.user.repository;

import link.staticks.backoffice.user.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {
}
