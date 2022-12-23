public class Task {

    public boolean isDone = false;
    public String dateCreate;
    public String dateDone;
    public int number;
    public String title;
    public String description;

    public Task(int number, String dateCreate, String title) {
        this.number = number;
        this.dateCreate = dateCreate;
        this.isDone = false;
        this.title = title;
        this.description = null;
        this.dateDone = null;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public String getDateDone() {
        return dateDone;
    }

    public String getDone() {
        if (isDone == true) {
            String done = "1";
            return done;
        } else {
            String done = "0";
            return done; 
        }
    }

    public void setDone(String dateDone) {
        this.isDone = true;
        this.dateDone = dateDone;
    }

    
}
