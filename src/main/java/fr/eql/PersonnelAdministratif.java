package fr.eql;

import utils.QATools;

public class PersonnelAdministratif extends Personne implements EmployeEcole {
    String className = getClass().getSimpleName();
    private double salaire;
    private int nbAbsenceMoisEnCours;

    public PersonnelAdministratif(String nom, String prenom) {
        super(nom, prenom);
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public int getNbAbsenceMoisEnCours() {
        return nbAbsenceMoisEnCours;
    }

    public void setNbAbsenceMoisEnCours(int nbAbsenceMoisEnCours) {
        this.nbAbsenceMoisEnCours = nbAbsenceMoisEnCours;
    }

    void sePresenter(){
        LOGGER.info("\n Présentation de " + className +
                "\nnom : " + nom +
                "\nprenom : " + prenom +
                "\nSalaire : " + getSalaire() +
                "\nNb absence dans le mois en cours : " + getNbAbsenceMoisEnCours());
    }

    double checkAugmentation(double salaire, double augmentation) {
        Ecole ecole = new Ecole();
        if (nbAbsenceMoisEnCours < 4) {
            salaire = ecole.augmentationSalaire(salaire, augmentation);
            LOGGER.info("augmentation du salaire");
        } else {
            LOGGER.info("trop d'absence");
        }
        return salaire;
    }
}
