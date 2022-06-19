package link.staticks.backoffice.page.repository;

import link.staticks.backoffice.page.model.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PageRepository extends JpaRepository<Page, Long> {
}
