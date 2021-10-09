package com.epam.task.io;

public class WriteToConsole implements Write {

    public void output(Object object) {
        System.out.println(object);
    }
}
