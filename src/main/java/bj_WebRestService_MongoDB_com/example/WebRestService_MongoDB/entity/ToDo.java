package bj_WebRestService_MongoDB_com.example.WebRestService_MongoDB.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import bj_WebRestService_MongoDB_com.example.WebRestService_MongoDB.controller.todoController;
import lombok.Builder;
import lombok.Data;

@Document(collection = "todo")
@Data
@Builder
public class ToDo {

    @PostMapping
    public ResponseEntity<ToDo> createToDo(todoController todoController) {
        ToDo newToDo = todoController.toDoService.createToDo(this);

        return new ResponseEntity<ToDo>(newToDo, HttpStatusCode.OK);
    }

    @Id
    private final String id;
    private final String title;
}
