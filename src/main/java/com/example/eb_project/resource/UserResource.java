package com.example.eb_project.resource;

import com.example.eb_project.entities.User;
import com.example.eb_project.servicies.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserResource {
    @Autowired
    private UserService service;
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAll(){
        return ResponseEntity.ok().body(service.findAll());
    }
    @RequestMapping(value = {"/{id}"},method = RequestMethod.GET)
    public ResponseEntity<User> findById(@PathVariable String id){
        return  ResponseEntity.ok().body(service.findById(id));
    }
}
