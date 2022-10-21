package fr.eql;

import utils.QATools;

public abstract class Personne extends QATools {
    protected String nom;
    protected String prenom;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
}
