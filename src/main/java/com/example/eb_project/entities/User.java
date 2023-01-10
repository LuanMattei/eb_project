package com.example.eb_project.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
@Data
@AllArgsConstructor
@Document(collection ="user")
public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    private String id_Military;
    private String name;
    private postosGraduacoes postosGraduacoes;
   private Date dataDeIngresso;
    private Boolean ativo;

}
