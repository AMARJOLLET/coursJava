package fr.eql;

import utils.QATools;

public final class Ecole extends QATools {

    double augmentationSalaire (double salaire, double augmentation) {
        LOGGER.info("ancien salaire : " + salaire);
        return salaire + augmentation;
    }

    int retournerAgeFonctionNiveauClasse(NiveauClasse niveauClasse) throws Exception {
        switch(niveauClasse){
            case CP :
                return 6;
            case CE1 :
                return 7;
            case CE2 :
                return 8;
            case CM1 :
                return 9;
            case CM2 :
                return 10;
            default:
                throw new Exception("Absence du niveau de classe dans l'école");
        }
    }

    NiveauClasse retournerNiveauClasseFonctionAge(int age) throws Exception {
        switch(age){
            case 6 :
                return NiveauClasse.CP;
            case 7 :
                return NiveauClasse.CE1;
            case 8 :
                return NiveauClasse.CE2;
            case 9 :
                return NiveauClasse.CM1;
            case 10 :
                return NiveauClasse.CM2;
            default:
                if (age < 6) {
                    throw new Exception("Enfant est trop jeune");
                } else {
                    throw new Exception("Enfant est trop vieux");
                }
        }
    }


    String name = "test";
    private String prenom = "test2";
}
