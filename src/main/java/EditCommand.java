public class EditCommand extends Command {
    private String editType;

    private int index;

    public EditCommand(String editType, String n) {
        this.editType = editType;
        int index = Integer.parseInt(n) - 1;
        this.index = index;
    }

    public void execute(TaskList tasks, Ui ui, Storage storage) {
        Task task = tasks.getTask(index);
        if (editType.equals("mark")) {
            task.markAsDone();
            ui.markedDone(task);
        } else {
            task.unmark();
            ui.markedUndone(task);

        }
    }

    public boolean isExit() {
        return false;
    }
}
