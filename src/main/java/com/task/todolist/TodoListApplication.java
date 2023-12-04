package com.task.todolist;

import com.task.todolist.entities.Tache;
import com.task.todolist.entities.Utilisateur;
import com.task.todolist.enums.StatusTache;
import com.task.todolist.repository.TacheRepository;
import com.task.todolist.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class TodoListApplication implements CommandLineRunner {
    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Autowired
    private TacheRepository tacheRepository;

    public static void main(String[] args) {
        SpringApplication.run(TodoListApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Création des utilisateurs
        /*Utilisateur mohamed = new Utilisateur();
        mohamed.setNom("Mohamed");
        mohamed.setEmail("mohamed@example.com");

        Utilisateur ferdaousse = new Utilisateur();
        ferdaousse.setNom("Ferdaousse");
        ferdaousse.setEmail("ferdaousse@example.com");

        // Enregistrement des utilisateurs
        utilisateurRepository.saveAll(Arrays.asList(mohamed, ferdaousse));

        System.out.println(mohamed.getId());

        // Création des tâches
        Tache tache1 = new Tache();
        tache1.setTitre("Tâche 1");
        tache1.setDescription("Description de la tâche 1");
        tache1.setStatues(StatusTache.EN_ATTENTE);
        tache1.setDateCreation(new Date());
        tache1.setDateDebut(new Date());
        tache1.setDateFin(new Date());
        tache1.setUtilisateur(mohamed);

        Tache tache2 = new Tache();
        tache2.setTitre("Tâche 2");
        tache2.setDescription("Description de la tâche 2");
        tache2.setStatues(StatusTache.EN_COURS);
        tache2.setDateCreation(new Date());
        tache2.setDateDebut(new Date());
        tache2.setDateFin(new Date());
        tache2.setUtilisateur(mohamed);

        Tache tache3 = new Tache();
        tache3.setTitre("Tâche 3");
        tache3.setDescription("Description de la tâche 3");
        tache3.setStatues(StatusTache.FAIT);
        tache3.setDateCreation(new Date());
        tache3.setDateDebut(new Date());
        tache3.setDateFin(new Date());
        tache3.setUtilisateur(ferdaousse);

        Tache tache4 = new Tache();
        tache4.setTitre("Tâche 4");
        tache4.setDescription("Description de la tâche 4");
        tache4.setStatues(StatusTache.EN_ATTENTE);
        tache4.setDateCreation(new Date());
        tache4.setDateDebut(new Date());
        tache4.setDateFin(new Date());
        tache4.setUtilisateur(ferdaousse);


        // Enregistrement des tâches
        tacheRepository.saveAll(Arrays.asList(tache1, tache2, tache3, tache4));

        System.out.println(tacheRepository.findByUtilisateur(ferdaousse));*/

    }
}
