package collabhubbr.projects.model;

import jakarta.persistence.*;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;



    @ManyToOne(fetch = FetchType.EAGER)
    private UserPermission user;
}
