package seedu.duke;

import seedu.duke.task.Task;

public class Ui {
    static String lineCutOff = "_______________________________________________________";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32;1m";
    public static final String ANSI_BLUE = "\u001B[34;1m";

    /**
     * Prints the logo of CEGMods and prompts for command 'help'.
     */
    public static void printWelcomeMessage() {
        String logo =
            "                   __ _                      _           \n"
                    + "   __      ___    / _` |  _ __     ___    __| |    ___   \n"
                    +  "  / _|    / -_)   \\__, | | '  \\   / _ \\  / _` |   (_-<   \n"
                    +  "  \\__|_   \\___|   |___/  |_|_|_|  \\___/  \\__,_|   /__/_  \n"
                    +  "_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| "
                    +  "\n"
                    +  "\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-' ";


        System.out.println(lineCutOff);
        System.out.println(ANSI_GREEN + logo + ANSI_RESET);
        System.out.println("Hello, this is CEGMods! What can I do for you?\n"
                + "Enter " + ANSI_GREEN + "'help'" + ANSI_RESET + " to get more information.");
        System.out.println(lineCutOff);
    }

    /**
     * Prints content of help message.
     */
    public static void printHelpMessage() {
        System.out.println(lineCutOff);
        System.out.println("Commands are colored " + ANSI_GREEN + "green" + ANSI_RESET
                + " while user input are colored " + ANSI_BLUE + "blue.\n" + ANSI_RESET
                + "Please enter using the format as stated strictly!\n"
                + "1. Add a module:" + ANSI_GREEN + " add mod/" + ANSI_BLUE + "<MODULE_CODE>\n" + ANSI_RESET
                + "2. Delete a module: " + ANSI_GREEN + "delete mod/" + ANSI_BLUE + "<MODULE_CODE>\n" + ANSI_RESET
                + "3. View today's timetable: " + ANSI_GREEN + "today timetable\n" + ANSI_RESET
                + "4. View weekly timetable:" + ANSI_GREEN + " this week timetable\n" + ANSI_RESET
                + "5. View task list: " + ANSI_GREEN + "task list\n" + ANSI_RESET
                + "6. Add a to do task: " + ANSI_GREEN + "todo" + ANSI_BLUE + " <DESCRIPTION>\n" + ANSI_RESET
                + "7. Add a deadline: " + ANSI_GREEN + "deadline" + ANSI_BLUE + " <DESCRIPTION> " + ANSI_GREEN + "/by"
                + ANSI_BLUE + " <YYYY-MM-DD HH:mm>\n" + ANSI_RESET
                + "8. Add an event: " + ANSI_GREEN + "event" + ANSI_BLUE + " <DESCRIPTION> "
                + ANSI_GREEN + "/at" + ANSI_BLUE + " <YYYY-MM-DD HH:mm>\n" + ANSI_RESET
                + "9. Mark a task as done: " + ANSI_GREEN + "done task/" + ANSI_BLUE + "<TASK_INDEX>\n" + ANSI_RESET
                + "10. Delete a task: " + ANSI_GREEN + "delete task/" + ANSI_BLUE + "<TASK_INDEX>\n" + ANSI_RESET
                + "11. Find a task with keyword: " + ANSI_GREEN + "find " + ANSI_BLUE + "<KEYWORD>\n" + ANSI_RESET
                + "12. Add a project subtask: " + ANSI_GREEN + "mod/" + ANSI_BLUE + "<MODULE_CODE> "
                + ANSI_GREEN + "ptask/" + ANSI_BLUE + "<DESCRIPTION> " + ANSI_GREEN + "by/" + ANSI_BLUE
                + "<DEADLINE>" + " \n" + ANSI_RESET
                + "13. View project task list: " + ANSI_GREEN + "mod/" + ANSI_BLUE + "<MODULE_CODE>"
                + ANSI_GREEN + " project " + "task list\n" + ANSI_RESET
                + "14. View project progress: " + ANSI_GREEN + "mod/" + ANSI_BLUE + "<MODULE_CODE>"
                + ANSI_GREEN + " progress\n" + ANSI_RESET
                + "15. View today's deadline: " + ANSI_GREEN + "today deadline\n" + ANSI_RESET
                + "16. View this week deadline:" + ANSI_GREEN + " this week deadline\n" + ANSI_RESET
                + "17. View all modules' information: " + ANSI_GREEN + "check modules\n" + ANSI_RESET
                + "18. Exit CEGMods: " + ANSI_GREEN + "exit" + ANSI_RESET
        );
        System.out.println(lineCutOff);
    }

    /**
     * Prints content of bye message.
     */
    public static void printByeMessage() {
        System.out.println(lineCutOff);
        System.out.println("Bye! Have a nice day with CEG!");
        System.out.println(lineCutOff);
    }

    /**
     * Prints error message if delete index is out of bound.
     * If it is not a delete exception, prints standard error message.
     *
     * @param command  Command input by user.
     */
    public static void dealWithException(String command) {
        System.out.println((" OOPS!!! I'm sorry, but I don't know what that means. "
                + "Please follow the input format correctly."));
    }

    /**
     * Prints statement that there is file loading error.
     */
    public void showLoadingError() {
        System.out.printf("\tThere are some errors when loading file.%n");
    }

    /**
     * Print affirmative statement of task being marked done.
     *
     * @param task Task that is marked done.
     */
    public static void printMarkMessage(Task task) {
        System.out.println(" \t" + lineCutOff);
        System.out.printf(" \tNice! I've marked this task as done:%n");
        System.out.println("\t  " + task);
        System.out.println(" \t" + lineCutOff);
    }

}
