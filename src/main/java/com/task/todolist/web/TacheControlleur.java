package com.task.todolist.web;

import com.task.todolist.entities.Tache;
import com.task.todolist.repository.TacheRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class TacheControlleur {
    private TacheRepository tacheRepository;
    @GetMapping("/index")
    public String index(Model model,@RequestParam(name="page", defaultValue = "0") int page,
                                    @RequestParam(name="size", defaultValue = "5") int size,
                                    @RequestParam(name ="titre", defaultValue = "") String kw){
        Page<Tache> pagesTache= tacheRepository.findByTitreContains(kw,PageRequest.of(page,size));
        model.addAttribute("listTaches", pagesTache.getContent());
        model.addAttribute("pages", new int[pagesTache.getTotalPages()]);
        model.addAttribute("currentPage",page);
        return "taches";
    }

}
