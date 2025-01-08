import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        int entre;
       
        do {
            System.out.println("");
            System.out.println("Bienvenue sur notre application ");
            System.out.println("Faites un choix ");
            System.out.println("1-Ajouter une tâche ");
            System.out.println("2-Supprimer une tâche ");
            System.out.println("3-Afficher toutes les  tâche ");
            System.out.println("4-Marquer un tâche comme terminé ");
            System.out.println("0-Quitter ");
            Scanner scanner = new Scanner(System.in);
            entre = scanner.nextInt();
            System.out.println(entre);

            switch (entre) {
                case 1:
                System.out.println("ajout");
                    break;
                case 2:
                System.out.println("supression");
                    break;
                case 3:
                System.out.println("affichage");
                    break;
                case 4:
                System.out.println("marquer comme terminé");
                    break;
                case 0:
                System.out.println("Au revoir!");
                    break;
            
                default:
                System.out.println("Veillez entrer une réponse valide");
                    break;
            }
        } while (entre!=0);
        
    }
}
