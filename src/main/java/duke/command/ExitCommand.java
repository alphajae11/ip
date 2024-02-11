package duke.command;

import duke.Storage;
import duke.task.TaskList;
import duke.Ui;

public class ExitCommand extends Command {

    public ExitCommand() {

    }

    public void execute(TaskList tasks, Ui ui, Storage storage) {
        storage.save(tasks);
        ui.sayGoodBye();
    }

    public boolean isExit() {
        return true;
    }
}
