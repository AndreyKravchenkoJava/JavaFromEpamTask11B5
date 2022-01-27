package project;

import java.util.*;

public class Console {
    private List<Integer> list;
    private Scanner scanner;

    public Console(List<Integer> list) {
        this.list = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            init();
        }
    }

    private void init() {
        message();
        String choice = getChoiceOneChar();
        switch (choice) {
            case "a": {
                getAllList();
                break;
            }
            case "b": {
                addNumber();
                break;
            }
            case "c": {
                removeNumber();
                break;
            }
            case "d": {
                searchNumber();
                break;
            }
            default: {
                System.out.println("Your input wrong choice!");
            }
        }
    }

    private void message() {
        System.out.println("----------------------------------");
        System.out.println("Hello, this program can: ");
        System.out.println("a - get all numbers from a list");
        System.out.println("b - add number to list");
        System.out.println("c - remove number from list");
        System.out.println("d - search number");
    }

    private String getChoiceOneChar() {
        return String.valueOf(scanner.next().trim().charAt(0));
    }

    private void getAllList() {
        System.out.println("All list");
        System.out.println(list);
    }

    private void addNumber() {
        System.out.println("Enter the number you want to add: ");
        list.add(scanner.nextInt());
    }

    private void removeNumber() {
        System.out.println("Enter the position of the number you want to remove: ");
        list.remove(scanner.nextInt());
    }

    private void searchNumber() {
        System.out.println("Enter the number you wont to search: ");
        int number = scanner.nextInt();
        Optional<Integer> optionalInteger = list.stream().filter(n -> n > number).findFirst();
        System.out.println("Found: " + optionalInteger);

    }
}
