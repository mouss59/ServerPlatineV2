package com.example.demo.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ParcJardin implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private java.lang.String name;
    @Column
    private java.lang.String description;
    @Column
    private String type;  // parc ou jardin
    @Column
    private String L;
    @Column
    private String G;
    @Column
    private String adresse;

    @Column
    @ElementCollection(targetClass=String.class)
    private List<String> NameImage;

    @OneToMany
    private List<Commentaire> commentaires = new ArrayList<>();

    @ManyToMany
    private List<Horaire> horaires = new ArrayList<>();

    @ManyToMany
    private List<Categorie> categories = new ArrayList<>();


    public ParcJardin() {
    }

    public ParcJardin(String name, String description, String type, String l, String g, String adresse) {
        this.name = name;
        this.description = description;
        this.type = type;
        L = l;
        G = g;
        this.adresse = adresse;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getL() {
        return L;
    }

    public void setL(String l) {
        L = l;
    }

    public String getG() {
        return G;
    }

    public void setG(String g) {
        G = g;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<String> getNameImage() {
        return NameImage;
    }

    public void setNameImage(List<String> nameImage) {
        NameImage = nameImage;
    }

    public List<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(List<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }

    public List<Horaire> getHoraires() {
        return horaires;
    }

    public void setHoraires(List<Horaire> horaires) {
        this.horaires = horaires;
    }

    public List<Categorie> getCategories() {
        return categories;
    }

    public void setCategories(List<Categorie> categories) {
        this.categories = categories;
    }


    @Override
    public String toString() {
        return "ParcJardin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", L=" + L +
                ", G=" + G +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
