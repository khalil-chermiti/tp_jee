package com.example.tp_final;

public class Personne {
    public int id;

    public String nom;

    public String prenom;

    public String adresse;

    public Personne() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Personne{" + "id=" + id + ", nom='" + nom + '\'' + ", prenom='" + prenom + '\'' + ", adresse='" + adresse + '\'' + '}';
    }
}
