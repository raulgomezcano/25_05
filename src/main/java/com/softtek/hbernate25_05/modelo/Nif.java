package com.softtek.hbernate25_05.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "nif")
public class Nif {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private char letra;
    @Column(length = 30,nullable = false)
    private long numero;
    @OneToOne
    @JoinColumn(name = "piloto_id")
    private Piloto pilotoN;
}
