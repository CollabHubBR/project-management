package collabhubbr.projects.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Members{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userId; // UserPermission

    @ManyToOne(fetch = FetchType.LAZY)
    private Project project;

    private RoleName role; // UserPermission Prepesist

}
