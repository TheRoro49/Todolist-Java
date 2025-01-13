import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        int choix;
        ToDoList todolist = new ToDoList();
       
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
            choix = scanner.nextInt();
        
            switch (choix) {
                case 1:
                todolist.addTask();
                    break;
                case 2:
                todolist.deleteTask();
                    break;
                case 3:
                todolist.showTasks();
                    break;
                case 4:
                todolist.doneTask();
                    break;
                case 0:
                System.out.println("Au revoir!");
                    break;
            
                default:
                System.out.println("Veillez entrer une réponse valide");
                    break;
            }
        } while (choix!=0);
        
    }
}
