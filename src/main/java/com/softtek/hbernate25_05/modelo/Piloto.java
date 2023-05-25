package com.softtek.hbernate25_05.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

@ToString(onlyExplicitlyIncluded = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "piloto")
public class Piloto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 30, nullable = false)
    private String nombre;
    @Column(length = 30, nullable = false)
    private int edad;
    @OneToOne(mappedBy = "pilotoF", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Facturacion facturacion;
    @OneToOne(mappedBy = "pilotoN", cascade = CascadeType.ALL, fetch =FetchType.LAZY)
    private Nif nif;
    @ManyToOne
    @JoinColumn(name = "escuderia_id")
    private Escuderia escuderia;
    @OneToMany(mappedBy = "piloto", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Telefono> telefonos;
    @ToString.Exclude
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
            name = "piloto_temporada",
            joinColumns = @JoinColumn(name = "piloto_id"),
            inverseJoinColumns = @JoinColumn(name = "temporada_id")
    )
    private Set<Temporada> temporadas;
}
