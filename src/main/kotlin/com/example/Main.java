package com.example;

import com.example.services.FileService;
import java.io.IOException;
import static com.example.services.PhoneBookServices.listCommands;

public class Main extends FileService {
    public static void main(String[] args) throws IOException {
        listCommands();
        System.out.print("\n> ");
    }
}

