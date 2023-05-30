package bj_WebRestService_MongoDB_com.example.WebRestService_MongoDB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bj_WebRestService_MongoDB_com.example.WebRestService_MongoDB.entity.ToDo;
import bj_WebRestService_MongoDB_com.example.WebRestService_MongoDB.service.ToDoService;

@RestController
@RequestMapping("/todo")
public class todoController {

    @Autowired
    public ToDoService toDoService;

    @GetMapping
    public ResponseEntity<List<ToDo>> getallToDos() {

        List<ToDo> toDos = toDoService.getallToDos();

        return new ResponseEntity<List<ToDo>>(toDos, HttpStatusCode.OK);
    }

}
