package duke;

import duke.Task;

import java.util.ArrayList;


/**
 * Class that contains a list of tasks
 */
public class TaskList {

    public ArrayList<Task> tasks;

    /**
     * Creates an instance of Tasklist where there is no task in the file
     */
    public  TaskList() {
        this.tasks = new ArrayList<Task>();
    }

    /**
     * Creates an instance of Tasklist which existing tasks from the file
     * @param tasks
     */
    public TaskList(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    /**
     * Returns the number of tasks in the list
     * @return
     */
    public int getSize() {
        return tasks.size();
    }

    /**
     * Returns the specific task with specific index from the tasklist
     * @param i index of the task in the tasklist
     * @return
     */
    public Task getTask(int i) {
        return tasks.get(i);
    }
}
