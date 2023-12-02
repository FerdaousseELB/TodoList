package com.task.todolist.entities;

import com.task.todolist.enums.StatusTache;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@NoArgsConstructor  @AllArgsConstructor @Builder @Data @ToString @Entity
public class Tache {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titre;
    private String description;
    @Enumerated(EnumType.STRING)
    private StatusTache statues;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDebut;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFin;
    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;
}

