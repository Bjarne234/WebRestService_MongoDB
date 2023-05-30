package bj_WebRestService_MongoDB_com.example.WebRestService_MongoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import bj_WebRestService_MongoDB_com.example.WebRestService_MongoDB.entity.ToDo;

@Repository
public interface ToDoRepository extends MongoRepository<ToDo, String> {

}
