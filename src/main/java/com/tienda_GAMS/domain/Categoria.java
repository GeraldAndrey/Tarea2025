package com.tienda_GAMS.domain;

import lombok.Data;
import java.io.Serializable;
import jakarta.persistence.*;

@Data
@Entity
@Table(name="Categoria")
public class Categoria implements Serializable{
    
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private long idCategoria;
    private String descripcion;
    @Column(name="ruta_imagen")
    private String rutaImagen;
    @Column(name = "activo")
    private boolean activo;

    public Categoria(){

    }

    public Categoria(String descripcion, boolean activo){
        this.descripcion = descripcion;
        this.activo = activo;
    }
}
