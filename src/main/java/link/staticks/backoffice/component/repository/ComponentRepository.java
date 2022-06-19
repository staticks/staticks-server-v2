package link.staticks.backoffice.component.repository;

import link.staticks.backoffice.component.model.Component;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComponentRepository extends JpaRepository<Component, Long> {
}
