package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static StorageList storageList = new StorageList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();

        while (!quit) {

            System.out.println("Please enter application action: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice >= 0 && choice <= 7) {
                switch (choice) {
                    case 0:
                        printInstructions();
                        break;
                    case 1:
                        storageList.printStorageList();
                        break;
                    case 2:
                        findItem();
                        break;
                    case 3:
                        addItem();
                        break;
                    case 4:
                        addMultiple();
                        break;
                    case 5:
                        modifyItem();
                        break;
                    case 6:
                        removeItem();
                        break;
                    case 7:
                        quit = true;
                        break;
                }
            } else {
                System.out.println("Invalid entry. Please enter a number between 0 and 7");
            }
        }

    }

    public static void printInstructions() {
        System.out.println("\nEnter");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print storage contents");
        System.out.println("\t 2 - To search for a storage item");
        System.out.println("\t 3 - To add an item to storage");
        System.out.println("\t 4 - To add multiple items to storage");
        System.out.println("\t 5 - To modify a storage item");
        System.out.println("\t 6 - To remove a storage item");
        System.out.println("\t 7 - To quit application");
    }

    public static void findItem() {
        System.out.print("Please enter item to search for: ");
        storageList.findStorageItem(scanner.nextLine());
    }

    public static void addItem() {
        System.out.print("Please enter storage item: ");
        storageList.addStorageItem(scanner.nextLine());
    }

    public static void addMultiple() {
        System.out.print("Enter number of items to add (max 50): ");
        int numberOfItemsToAdd = scanner.nextInt();
        scanner.nextLine();

        if (numberOfItemsToAdd > 0 && numberOfItemsToAdd < 51) {

            for (int i = 1; i < numberOfItemsToAdd + 1; i++) {
                System.out.println("Please enter " + i + ". storage item to be added: ");
                storageList.addStorageItem(scanner.nextLine());
            }

            System.out.print(numberOfItemsToAdd + " items added. To print new storage contents, enter 1 \n");
        } else {
            System.out.print("Invalid number of items to add");
        }
    }

    public static void modifyItem() {
        System.out.print("Current storage contents: ");
        storageList.printStorageList();
        System.out.println("Enter item number of item to be modified: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter replacing (new) item name: ");
        String newItem = scanner.nextLine();
        storageList.modifyStorageItem(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.print("Current storage contents: ");
        storageList.printStorageList();
        System.out.println("Enter item number of item to be removed: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        storageList.removeStorageItem(itemNo);
    }
}
