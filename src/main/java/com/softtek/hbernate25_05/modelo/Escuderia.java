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
@Table(name = "escuderia")
public class Escuderia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 30, nullable = false)
    private String nombre;
    @Column(length = 30, nullable = false)
    private String pais;
    @OneToMany(mappedBy = "escuderia", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Piloto> pilotos;
}
