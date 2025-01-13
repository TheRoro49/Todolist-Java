public class Task {
    private static int idbis = 1;
    private  int id;
    private String description;
    private boolean statut;

    public Task(String description) {
        this.description = description;
        this.id = this.idbis++;
        this.statut = false;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        if (!statut) {
            
            return id+ " - " +  description + " [ En cours ]"  ;
        }else{
            return id+ " - " + description + " [ Terminé ]"  ;
        }
    }

    public int getId() {
        return id;
    }


}
