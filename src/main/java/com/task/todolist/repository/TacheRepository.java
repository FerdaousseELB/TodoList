package com.task.todolist.repository;


import com.task.todolist.entities.Tache;
import com.task.todolist.enums.StatusTache;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TacheRepository extends JpaRepository<Tache, Long> {
    @Query("select t from Tache t where t.utilisateur.nom like :x")
    Page<Tache> findByUtilisateurContains(@Param("x") String nom, Pageable pageable);

    Page<Tache> findByTitreContains(String titre, Pageable pageable);

    Page<Tache> findByStatuesEquals(StatusTache statusTache, Pageable pageable);

    /*@Query("select t from Tache t where t.titre like :x")
    Page<Tache> chercher(@Param("x") String titre, Pageable pageable);*/


}
