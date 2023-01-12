package com.example.eb_project.repository;

import com.example.eb_project.DTO.UserDTO;
import com.example.eb_project.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
