package collabhubbr.projects.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserProject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userId; // UserPermission
    private RoleName role; // UserPermission Prepesist

    @ManyToOne(fetch = FetchType.LAZY)
    private Project project;


}
