package io.work.MapJeunesse.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Utilisateur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long    id;
    private String  nom;
    private String  prenom;
    private String  username;
    private String  password;
    private String  email;
    private String  sexe;
    private String  telephone;

    @OneToMany
    private Set<Role> roles = new HashSet<>();
}
