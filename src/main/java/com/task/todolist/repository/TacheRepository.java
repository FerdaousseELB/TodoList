package com.task.todolist.repository;


import com.task.todolist.entities.Tache;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TacheRepository extends JpaRepository<Tache, Long> {
}
