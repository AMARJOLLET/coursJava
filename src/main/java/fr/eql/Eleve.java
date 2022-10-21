package fr.eql;


public class Eleve extends Personne {
    protected int age;
    private boolean absent;
    private String niveauCLass;
    NiveauClasse niveauClass;

    public Eleve(String nom, String prenom, int age) {
        super(nom, prenom);
    }

    public boolean isAbsent() {
        return absent;
    }

    public void setAbsent(boolean absent) {
        this.absent = absent;
    }

    public String getNiveauCLass() {
        return niveauCLass;
    }

    public void setNiveauCLass(NiveauClasse niveauClass) {
        this.niveauCLass = String.valueOf(niveauClass);
    }


    public void apprendre() {
    }


}
