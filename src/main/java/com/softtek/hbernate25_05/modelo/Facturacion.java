package com.softtek.hbernate25_05.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "facturacion")
public class Facturacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 30, nullable = false)
    private int sueldo;
    @Column(length = 30, nullable = false)
    private int publicidad;
    @OneToOne
    @JoinColumn(name = "id_piloto", nullable = false, foreignKey = @ForeignKey(name = "fk_facturacion_piloto"))
    private Piloto pilotoF;
}
