package collabhubbr.projects.model;

import jakarta.persistence.*;

import java.util.List;

@Entity

public class UserPermission {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private Long userId;

    private RoleName roleUser;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Project> project;
}
