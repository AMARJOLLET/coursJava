package fr.eql;

import org.junit.Test;
import utils.OutilsProjet;
import utils.QATools;

import static org.junit.Assert.*;

public class MaClasseDeTest extends QATools {
    Ecole ecole = new Ecole();

    // Constructeur
    // ELEVE
    String nomEleve = "nomEleve";
    String prenomEleve = "prenomEleve";
    int ageEleve = 7;
    // ENSEIGNANT
    String nomEnseignant = "nomEnseignant";
    String prenomEnseignant = "prenomEnseignant";
    // PERSONNEADMINISTRATIF
    String nomPersonnelAdministratif = "nomPersonnelAdministratif";
    String prenomPersonnelAdministratif = "prenomPersonnelAdministratif";

    // Getter - Setter
    boolean absent = true;
    double salaireEnseignant = 1200.00;
    double salairePersonnelAdministratif = 2400.00;
    double augmentationEnseignant = 233.44;
    double augmentationPersonnelAdministratif = 698.78;
    int nbMoisAbsenceEnseignant = 2;
    int nbMoisAbsencePersonnelAdministratif = 4;

    public MaClasseDeTest() throws Exception {
    }

    @Test
    public void run() throws Exception {

        // Eleve
        Eleve eleve = new Eleve(nomEleve, prenomEleve, ageEleve);
        eleve.setAbsent(absent);
        LOGGER.info("eleve est absent : " + eleve.isAbsent());
        assertEquals(absent, eleve.isAbsent());
        eleve.setNiveauCLass(ecole.retournerNiveauClasseFonctionAge(ageEleve));
        assertEquals(String.valueOf(ecole.retournerNiveauClasseFonctionAge(ageEleve)), eleve.getNiveauCLass());
        assertNotNull(eleve.getNiveauCLass());

        // Enseignant
        Enseignant enseignant = new Enseignant(nomEnseignant, prenomEnseignant);
        enseignant.setSalaire(salaireEnseignant);
        enseignant.setNbAbsenceMoisEnCours(nbMoisAbsenceEnseignant);
        enseignant.sePresenter();
        double nouveauSalaireEnseignant = ecole.augmentationSalaire(salaireEnseignant, augmentationEnseignant);
        assertEquals(salaireEnseignant + augmentationEnseignant, nouveauSalaireEnseignant, 0.0);
        LOGGER.info("le nouveau salaire de l'enseignant est : " + nouveauSalaireEnseignant);
        double nouveauSalaireEnseignant2 = enseignant.checkAugmentation(nouveauSalaireEnseignant, augmentationEnseignant);
        assertEquals(nouveauSalaireEnseignant + augmentationEnseignant, nouveauSalaireEnseignant2, 0.0);

        // PersonnelAdmnistratif
        PersonnelAdministratif personnelAdministratif = new PersonnelAdministratif(nomPersonnelAdministratif, prenomPersonnelAdministratif);
        personnelAdministratif.setSalaire(salairePersonnelAdministratif);
        personnelAdministratif.setNbAbsenceMoisEnCours(nbMoisAbsencePersonnelAdministratif);
        personnelAdministratif.sePresenter();
        double nouveauSalairePersonnelAdministratif = ecole.augmentationSalaire(salairePersonnelAdministratif, augmentationPersonnelAdministratif);
        assertEquals(salairePersonnelAdministratif + augmentationPersonnelAdministratif, nouveauSalairePersonnelAdministratif, 0.0);
        LOGGER.info("le nouveau salaire du personnel administratif est : " + nouveauSalairePersonnelAdministratif);
        double nouveauPersonnelAdministratif2 = personnelAdministratif.checkAugmentation(nouveauSalairePersonnelAdministratif, augmentationPersonnelAdministratif);
        assertEquals(nouveauSalairePersonnelAdministratif, nouveauPersonnelAdministratif2, 0.0);
    }

    @Test
    public void sepresenter(){
        for (int i = 0; i < 4; i++){
            String nomEnseignant = "nomEnseignant"+(i+1);
            String prenomEnseignant = "prenomEnseignant"+(i+1);
            double salaire = Double.parseDouble(OutilsProjet.generateRandomNumber(4));
            int nbMoisAbsence = Integer.parseInt(OutilsProjet.generateRandomNumber(1));

            Enseignant enseignant = new Enseignant(nomEnseignant, prenomEnseignant);
            enseignant.setSalaire(salaire);
            enseignant.setNbAbsenceMoisEnCours(nbMoisAbsence);
            enseignant.sePresenter();
        }
        for (int i = 0; i < 3; i++){
            String nomPersonnelAdministratif = "nomPersonnelAdministratif"+(i+1);
            String prenomPersonnelAdministratif = "prenomPersonnelAdministratif"+(i+1);
            double salaire = Double.parseDouble(OutilsProjet.generateRandomNumber(4));
            int nbMoisAbsence = Integer.parseInt(OutilsProjet.generateRandomNumber(1));

            PersonnelAdministratif personnelAdministratif = new PersonnelAdministratif(nomPersonnelAdministratif, prenomPersonnelAdministratif);
            personnelAdministratif.setSalaire(salaire);
            personnelAdministratif.setNbAbsenceMoisEnCours(nbMoisAbsence);
            personnelAdministratif.sePresenter();
        }
    }
}
