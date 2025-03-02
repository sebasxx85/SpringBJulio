package com.desafioCliente.desafio.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity @Table(name = "client")

@NoArgsConstructor @AllArgsConstructor
@ToString @EqualsAndHashCode
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private Long id;

    @Getter @Setter private String name;
    @Getter @Setter private String lastname;
    @Getter @Setter private Integer dni;


}
