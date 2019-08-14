package com.example.services;

import java.io.IOException;
import java.util.*;

import com.example.DTO.ContactsDTO;

public class PhoneBookServices extends FileService {
    public static void listCommands() throws IOException {
        ContactsDTO contactsDTO = new ContactsDTO();
        Scanner scanner = new Scanner(System.in);
        FileService fs = new FileService();
        System.out.println("===================== PHONE BOOK ======================" + "\n\n" +
                "Type a command or 'exit' to quit findAll : " + "\n\n" +
                "'All' - lists all saved contacts in alphabetical  order" + "\n" +
                "'delete' - delete a contact by name" + "\n" +
                "'search' - searches for a contact by name" + "\n" +
                "'add' - add a new contact entry into the phone book" + "\n" +
                "'update' - edit a contact by name" + "\n" +
                "-------------------------------------------------------" + "\n" + "> ");
        String choice = scanner.nextLine().trim();
        scanner.nextLine();
        while (!choice.equals("exit")) {
            switch (choice) {
                case "All":
                    fs.fileReading("phonebook.txt");
                    break;
                case "search":
                    findByName(contactsDTO, scanner);
                    break;
                case "add":
                    add(contactsDTO, scanner);
                    break;
                case "update":

                    break;
                case "delete":

                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
    }

    public static void findByName(ContactsDTO contactsDTO, Scanner scanner) throws IOException {
        System.out.println("Enter a name : \n >");
        String name = contactsDTO.getName(scanner.nextLine());
        FileService fs = new FileService();
        List<String> contact = fs.fileReading("d:/HAMID/JAVA/PhoneBookMaven/phonebook.txt");
        contact.stream().map(it -> it.contains(name));
        System.out.println();
        System.out.println("Type a command or 'exit' to quit . For a list of valid commands use 'help':");
    }

    public static void add(ContactsDTO contactsDTO, Scanner scanner) {
        System.out.println("Adding a new contact to the phone book ... " + "\n" +
                "-----------------------------------------------------" + "\n" +
                "Enter contact name :");
        contactsDTO.getName(scanner.nextLine());
        System.out.println("Enter contact phone numbers :");
        contactsDTO.getPhoneNumber(scanner.nextLine());
        System.out.println("Enter contact mobile numbers (use comma between them) :");
        contactsDTO.getMobileNumber(scanner.nextLine());
        System.out.println("Enter contact emails (use comma between them) :");
        contactsDTO.getEmail(scanner.nextLine());
        System.out.println("select one of the contact types :" + "\n" + displayMenus());
        contactsDTO.getContactType(scanner.nextLine());
        System.out.println("Your contact is successfully added to phone book");
        saveContact(contactsDTO);
        System.out.println("Type a command or 'exit' to quit. For a list of valid commands use 'help':");
        System.out.println("> ");
    }

    public static String displayMenus() {
        return "FRIEND" + "\n" + "COLLEAGUE" + "\n" + "PERSONAL" + "\n" + "OTHER";
    }
}

