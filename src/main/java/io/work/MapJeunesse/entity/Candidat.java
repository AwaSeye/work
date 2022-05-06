package io.work.MapJeunesse.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Candidat extends Utilisateur{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long    id;
    private Date    dateNaissance;
    private String  niveau;
    private String  profession;


    @OneToMany
    private Set<Role> roles = new HashSet<>();
}
