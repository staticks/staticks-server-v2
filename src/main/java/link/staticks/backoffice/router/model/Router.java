package link.staticks.backoffice.router.model;

import link.staticks.backoffice.project.model.Project;
import link.staticks.backoffice.project.model.ProjectMember;
import link.staticks.backoffice.shared.BaseEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Router extends BaseEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String path;
    private String parameter;
    private String pageName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private ProjectMember member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;

    @Builder
    public Router(Long id, String path, String parameter, String pageName, ProjectMember member, Project project) {
        this.id = id;
        this.path = path;
        this.parameter = parameter;
        this.pageName = pageName;
        this.member = member;
        this.project = project;
    }
}
