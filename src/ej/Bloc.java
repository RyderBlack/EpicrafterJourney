package ej;

public class Bloc {

    private int task_ID;
    private String task_name;
    private String description;



    // TASK ID
    public int getTask_ID() {
        return task_ID;
    }

    public void setTask_ID(int task_ID) {
        this.task_ID = task_ID;
    }

    // TASK NAME
    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    // DESCRIPTION
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public void displayDescription() {
        System.out.println(description);
    }

}
