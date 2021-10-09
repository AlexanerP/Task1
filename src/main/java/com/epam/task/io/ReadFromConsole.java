package com.epam.task.io;

import java.util.Scanner;

public class ReadFromConsole implements Read {

    private Scanner scanner = new Scanner(System.in);

    public String getData() {
        return scanner.nextLine();
    }
}
