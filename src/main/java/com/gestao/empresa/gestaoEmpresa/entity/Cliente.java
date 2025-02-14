package com.gestao.empresa.gestaoEmpresa.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "clientes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    private String nome;
    @Setter
    @Getter
    private String email;
    @Setter
    @Getter
    private String telefone;
}
