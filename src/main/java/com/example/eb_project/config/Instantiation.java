package com.example.eb_project.config;

import com.example.eb_project.entities.User;
import com.example.eb_project.entities.postosGraduacoes;
import com.example.eb_project.repository.UserRepository;
import com.example.eb_project.servicies.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration
public class Instantiation implements CommandLineRunner {
    @Autowired
    private UserRepository rep;

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));


        User user1 = new User("055292","Luan", postosGraduacoes.ALUNO, sdf.parse("28/12/2021"),true);
        User user2 = new User("055291","cris", postosGraduacoes.CAPITAO, sdf.parse("10/01/2023"),true);
        rep.saveAll(Arrays.asList(user1,user2));

    }
}
