public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(1, "Smith", "John", "IT", 3);
        Employe e2 = new Employe(2, "Doe", "Jane", "HR", 2);
        Employe e3 = new Employe(3, "Brown", "Alice", "IT", 4);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        System.out.println("Liste des employés :");
        societe.displayEmploye();

        System.out.println("\nRechercher par nom 'Smith' : " + societe.rechercherEmploye("Smith"));

        System.out.println("Rechercher l'employé e1 : " + societe.rechercherEmploye(e1));

        societe.trierEmployeParId();
        System.out.println("\nAprès tri par ID :");
        societe.displayEmploye();

        societe.trierEmployeParNomDépartementEtGrade();
        System.out.println("\nAprès tri par Nom Département et Grade :");
        societe.displayEmploye();

        societe.supprimerEmploye(e2);
        System.out.println("\nAprès suppression de Jane Doe :");
        societe.displayEmploye();
    }
}
