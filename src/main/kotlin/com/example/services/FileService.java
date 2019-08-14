package com.example.services;

import com.example.DTO.ContactsDTO;
import com.example.domains.Contacts;
import com.example.enumerations.ContactType;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.*;
import static java.util.Collections.*;

public class FileService {
    public List<String> fileReading(String filePath) throws IOException {
        String fileName = "d:/HAMID/JAVA/PhoneBookMaven/phonebook.txt";
        List<String> list = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            list = stream.collect(Collectors.toList());
            list.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] split = fileName.split("\t");
        Contacts contacts = new Contacts();
        contacts.setName(split[0]);
        contacts.setPhoneNumber(split[1]);
        contacts.setMobileNumber(split[2]);
        contacts.setEmail(split[3]);
        contacts.setContactType(ContactType.valueOf(split[4]));
        return list;
    }
public static void saveContact(ContactsDTO contactsDTO){
    try {
        File file = new File("d:/HAMID/JAVA/PhoneBookMaven/phonebook.txt");
        if (!file.exists()) {
            file.createNewFile();
            PrintWriter pw = new PrintWriter(file);
            pw.println(contactsDTO);
            pw.close();
        }
    }catch (IOException e){
        System.out.println(e.getMessage());
    }
}

}