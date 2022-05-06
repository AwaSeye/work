package io.work.MapJeunesse.entity;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)

public class DossierCandidat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String cv;
    private String lettreMotivation;
    private String diplome;
//    @ManyToOne
//    private Projet categorie;

}
