package io.work.MapJeunesse.entity;


import lombok.*;
import org.springframework.context.annotation.Bean;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class RepresentantEntreprise extends Utilisateur{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long    id;
    private String  fonction;

//    @OneToMany
//    private Set<Role> roles = new HashSet<>();
}
