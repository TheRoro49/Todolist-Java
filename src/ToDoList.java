
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    private static ArrayList<Task> tasks = new ArrayList<>();

    // Ajouter une tâche
    public void addTask() {
        System.out.println("ajout de tâche");
        System.out.print("Entrer une tâche: ");
        Scanner scanner = new Scanner(System.in);
        String task = scanner.nextLine();
        Task newTask = new Task(task);
        tasks.add(newTask);
        showTasks();

    }

    // Afficher toutes les tâches
    public void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Aucune tâche pour le moment.");
        } else {
            System.out.println("Liste des tâches:");
            for (int i = 0; i < tasks.size(); i++) {
                // System.out.println((i + 1) + ". " + tasks.get(i));
                System.out.println(tasks.get(i));
            }
        }
    }

    // Supprimer les tâches
    public void deleteTask() {
        if (tasks.isEmpty()) {
            System.out.println("Vous n'avez aucune tâche à supprimer.");
        } else {
            showTasks();
            System.out.print("Entrer le numéros de la tâche à supprimer: ");
            Scanner scanner = new Scanner(System.in);
            int index = scanner.nextInt();

            for (int i = 0; i < tasks.size(); i++) {
                if (tasks.get(i).getId() == index) {
                    tasks.remove(i);
                    System.out.println("Tâche supprimer avec succès.");
                }

            }
            showTasks();

        }
    }

    // Marquer une tâche comme terminé
    public void doneTask() {

        if (tasks.isEmpty()) {
            System.out.println("Vous n'avez aucune tâche à terminer.");
        } else {
            showTasks();
            System.out.print("Entrer le numéros de la tâche à terminer: ");
            Scanner scanner = new Scanner(System.in);
            int index = scanner.nextInt();

            for (int i = 0; i < tasks.size(); i++) {
                if (tasks.get(i).getId() == index) {
                    tasks.get(i).setStatut(true);
                    System.out.println("Tâche supprimer avec succès.");
                    showTasks();
                }

            }

        }
    }
}
