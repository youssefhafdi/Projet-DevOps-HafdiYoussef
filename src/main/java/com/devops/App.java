package com.devops;

/**
 * Mini Projet DevOps
 * @author Hafdi Youssef
 * @version 1.0
 */
public class App {

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    public void run() {
        System.out.println("*******************************************");
        System.out.println("*     MINI PROJET DEVOPS - EMSI TANGER    *");
        System.out.println("*******************************************");
        System.out.println();
        System.out.println("  " + getMessage());
        System.out.println();
        System.out.println("  Etudiant: " + getEtudiant());
        System.out.println("  Version:  " + getVersion());
        System.out.println("  Annee:    " + getAnnee());
        System.out.println();
        System.out.println("*******************************************");
    }

    public String getMessage() {
        return "Bonjour et bon courage dans votre projet en DevOps";
    }

    public String getEtudiant() {
        return "Hafdi Youssef";
    }

    public String getVersion() {
        return "1.0-SNAPSHOT";
    }

    public String getAnnee() {
        return "2025/2026";
    }

    public String getEcole() {
        return "EMSI Tanger";
    }

    public String getModule() {
        return "DevOps";
    }

    public String getGroupe() {
        return "5IIR";
    }
}
