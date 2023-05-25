package com.softtek.hbernate25_05.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "temporada")
public class Temporada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 30, nullable = false)
    private int inicio;
    @Column(length = 30, nullable = false)
    private int fin;
    @ManyToMany(mappedBy = "temporadas")
    private Set<Piloto> pilotos;
}
