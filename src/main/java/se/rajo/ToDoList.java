package se.rajo;

import java.util.ArrayList;

public class ToDoList {

    public class TodoList {
        private ArrayList<Task> tasks = new ArrayList<>();

        public void addTask (String description) {
            tasks.add(new Task(description));
        }

        public void showTasks() {
            if(tasks.isEmpty()) {
                System.out.println("There are no tasks available");
            } else {
                for (int i = 0; i < tasks.size() ; i++) {
                    System.out.println(i + 1 + ". " + tasks.get(i));
                }
            }
        }

        public void removeTask (int index) {
            if(index >= 1 && index <= tasks.size()) {
                tasks.remove(index -1);
            } else {
                System.out.println("Invalid task number");
            }
        }
    }


}
