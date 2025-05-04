package ej;

public class Main {
    public static void main(String[] args) {

        Bloc new_task = new Bloc();
        new_task.setTask_ID(3);
        new_task.setTask_name("Operational Task");
        new_task.setDescription("This is a new task with the ID : " + new_task.getTask_ID() );

        new_task.displayDescription();
    }


}