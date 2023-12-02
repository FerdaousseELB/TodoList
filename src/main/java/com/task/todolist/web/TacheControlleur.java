package com.task.todolist.web;

import com.task.todolist.entities.Tache;
import com.task.todolist.repository.TacheRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class TacheControlleur {
    private TacheRepository tacheRepository;
    @GetMapping("/index")
    public String index(Model model){
        List<Tache> tacheList= tacheRepository.findAll();
        model.addAttribute("listTaches", tacheList);
        return "taches";
    }

}
