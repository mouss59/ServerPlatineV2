package com.example.demo.Entity;

import javax.persistence.*;

import java.io.Serializable;

@Entity
public class Horaire implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String ouverture;
    @Column
    private String fermuture;
    @Column
    private String journee;


    public Horaire(String ouverture) {
        this.ouverture = ouverture;
    }

    public Horaire(String ouverture, String fermuture, String journee) {
        this.ouverture = ouverture;
        this.fermuture = fermuture;
        this.journee = journee;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOuverture() {
        return ouverture;
    }

    public void setOuverture(String ouverture) {
        this.ouverture = ouverture;
    }

    public String getFermuture() {
        return fermuture;
    }

    public void setFermuture(String fermuture) {
        this.fermuture = fermuture;
    }

    public String getJournee() {
        return journee;
    }

    public void setJournee(String journee) {
        this.journee = journee;
    }


    @Override
    public String toString() {
        return "Horaire{" +
                "id=" + id +
                ", ouverture='" + ouverture + '\'' +
                ", fermuture='" + fermuture + '\'' +
                ", journee='" + journee + '\'' +
                '}';
    }
}
