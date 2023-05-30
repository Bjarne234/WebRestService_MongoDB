package bj_WebRestService_MongoDB_com.example.WebRestService_MongoDB.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bj_WebRestService_MongoDB_com.example.WebRestService_MongoDB.entity.ToDo;
import bj_WebRestService_MongoDB_com.example.WebRestService_MongoDB.repository.ToDoRepository;
import bj_WebRestService_MongoDB_com.example.WebRestService_MongoDB.service.ToDoService;

@Service
public class ToDoServiceImpl implements ToDoService {

    @Autowired
    private ToDoRepository toDoRepository;

    @Override
    public List<ToDo> getallToDos() {

        List<ToDo> toDos = toDoRepository.findAll();

        return toDos;
    }

    @Override
    public ToDo createToDo(ToDo toDo) {

        ToDo newToDo = toDoRepository.save(toDo);

        return newToDo;
    }
}
