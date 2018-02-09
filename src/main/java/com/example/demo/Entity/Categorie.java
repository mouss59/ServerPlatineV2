package com.example.demo.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Categorie implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String nomcategorie;


    public Categorie(String nomcategorie) {
        this.nomcategorie = nomcategorie;
    }

    public Categorie() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomcategorie() {
        return nomcategorie;
    }

    public void setNomcategorie(String nomcategorie) {
        this.nomcategorie = nomcategorie;
    }


    @Override
    public String toString() {
        return "Categorie{" +
                "id=" + id +
                ", nomcategorie='" + nomcategorie + '\'' +
                '}';
    }
}
