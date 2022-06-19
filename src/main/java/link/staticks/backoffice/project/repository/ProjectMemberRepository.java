package link.staticks.backoffice.project.repository;

import link.staticks.backoffice.project.model.ProjectMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectMemberRepository extends JpaRepository<ProjectMember, Long> {
}
