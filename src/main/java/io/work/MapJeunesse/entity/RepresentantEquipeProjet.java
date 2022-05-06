package io.work.MapJeunesse.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class RepresentantEquipeProjet extends Utilisateur{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long    id;
    private String  fonction;
//
//    @OneToMany
//    private Set<Role> roles = new HashSet<>();
}
