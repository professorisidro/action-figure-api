package br.org.pulsemais.actionfigures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ActionFigureController {

    @Autowired
    private ActionFigureRepo repo;

    @GetMapping("/actionfigures")
    public List<ActionFigure> recuperarTodos(){
        return repo.findAll();
    }

    @PostMapping("/actionfigures")
    public ActionFigure criarNovo(@RequestBody ActionFigure nova){
        return repo.save(nova);
    }
}
