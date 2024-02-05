package duke;

import duke.Task;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Ui {
    public final Scanner in;

    private final PrintStream out;

    private static final String LINE = "_________________________________________________________";

    private static final String GREET = "Hello! I'm DOUMMI\n" +
            "What can I do for you?";

    private static final String LOADING_ERROR = "Loaded wrongly - Please check again!";

    private static final String LIST_ANNOUNCEMENT = "Here are the tasks in your list:";

    private static final String BYE = "Hope to see you again soon!";

    public Ui() {
        this(System.in, System.out);
    }

    public Ui(InputStream in, PrintStream out) {
        this.in = new Scanner(in);
        this.out = out;
    }


    public String readCommand() {
        String userCmd = in.nextLine();
        return userCmd;
    }

    public void showWelcome() {
        System.out.println(GREET);
    }

    public void showError(String msg) {
        System.out.println("Sir, " + msg);
    }

    public void showLoadingError() {
        System.out.println(LOADING_ERROR);
    }

    public void showLine() {
        System.out.println(LINE);
    }

    public void announceListing() {
        System.out.println(LIST_ANNOUNCEMENT);
    }

    public void markedDone(Task task) {
        System.out.println("Nice! I've marked this task as done:\n" +
                "\t" + task.toString());
    }

    public void markedUndone(Task task) {
        System.out.println("OK, I've marked this task as not done yet:\n" +
                "\t" + task.toString());
    }

    public void sayGoodBye() {
        System.out.println(BYE);
    }


}
