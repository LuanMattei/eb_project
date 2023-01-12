package com.example.eb_project.servicies;

import com.example.eb_project.DTO.UserDTO;
import com.example.eb_project.entities.User;
import com.example.eb_project.repository.UserRepository;
import com.example.eb_project.servicies.exception.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository rep;
    @Autowired
    private ModelMapper modelMapper;

    public List<User> findAll(){
        return rep.findAll();
    }
    public User findById(String id){
        Optional<User> user =  rep.findById(id);
        return user.orElseThrow(()-> new ObjectNotFoundException("Object not found"));
    }
    public ResponseEntity<User> insert(User obj){
        return ResponseEntity.status(HttpStatus.CREATED).body(rep.insert(obj));
    }
    public  void delete(String id){
        findById(id);
        rep.deleteById(id);
    }

}
