package com.example.eb_project.DTO;

import com.example.eb_project.entities.postosGraduacoes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO implements Serializable {
    private String id_Military;
    private String name;
    private com.example.eb_project.entities.postosGraduacoes postosGraduacoes;
}
