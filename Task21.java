import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Task21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Deque<String> undoStack = new ArrayDeque<>();

        String text = "";

        int choice = 0;

        do {
            System.out.println("\n===== TEXT EDITOR =====");
            System.out.println("1. Add Text");
            System.out.println("2. Delete Text");
            System.out.println("3. Replace Text");
            System.out.println("4. Undo");
            System.out.println("5. Display Text");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                sc.nextLine();
                continue;
            }

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter text to add: ");
                    String newText = sc.nextLine();

                    undoStack.push(text);
                    text = text + newText;

                    System.out.println("Text added successfully!");
                    break;

                case 2:

                    if (text.isEmpty()) {
                        System.out.println("No text available to delete.");
                    } else {
                        System.out.print("Enter number of characters to delete: ");

                        if (!sc.hasNextInt()) {
                            System.out.println("Enter a valid number.");
                            sc.nextLine();
                            break;
                        }

                        int count = sc.nextInt();
                        sc.nextLine();

                        if (count <= 0 || count > text.length()) {
                            System.out.println("Invalid number of characters.");
                        } else {
                            undoStack.push(text);

                            text = text.substring(0, text.length() - count);

                            System.out.println("Text deleted successfully!");
                        }
                    }
                    break;

                case 3:

                    System.out.print("Enter new text: ");
                    String replacement = sc.nextLine();

                    undoStack.push(text);
                    text = replacement;

                    System.out.println("Text replaced successfully!");
                    break;

                case 4:
 
                    if (undoStack.isEmpty()) {
                        System.out.println("Nothing to undo!");
                    } else {
                        text = undoStack.pop();

                        System.out.println("Last operation undone!");
                    }
                    break;

                case 5:

                    System.out.println("Current Text: " + text);
                    break;

                case 6:
                    System.out.println("Exiting Text Editor...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
