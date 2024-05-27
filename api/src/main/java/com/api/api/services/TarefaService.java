package com.api.api.services;

import com.api.api.entities.Tarefa;
import com.api.api.repositories.TarefaRepository;
import exceptions.TaskDontFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    public List<Tarefa> findAll() {
        return tarefaRepository.findAll();
    }

    public Tarefa findById(Long id) {
        Optional<Tarefa> result = tarefaRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        }
        throw new TaskDontFoundException();
    }

    public Tarefa create(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    public void delete(Long id) {
        // Department department = findById(id);
        // repository.delete(department);
        tarefaRepository.deleteById(id);
    }

    public Tarefa update(Long id, Tarefa novaTarefa) {
        Tarefa tarefa= findById(id);
        tarefa.setDescricao(novaTarefa.getDescricao());
        Tarefa tarefa1 = tarefaRepository.save(tarefa);
        return tarefa1;
    }

}
