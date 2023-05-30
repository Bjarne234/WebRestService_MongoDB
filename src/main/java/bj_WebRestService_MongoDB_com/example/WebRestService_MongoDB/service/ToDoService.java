package bj_WebRestService_MongoDB_com.example.WebRestService_MongoDB.service;

import java.util.List;

import bj_WebRestService_MongoDB_com.example.WebRestService_MongoDB.entity.ToDo;

public interface ToDoService {

    List<ToDo> getallToDos();

    ToDo createToDo(ToDo toDo);

}
