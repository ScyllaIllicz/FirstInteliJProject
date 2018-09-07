package com.example.helloworld;
import java.io.IOException;

public class HelloWorld {
    public static void main(String[] args){
        byte buffer[] = new byte[80];
        String input = "";
        int read;
        try {
            read = System.in.read(buffer, 0, 80);
            input = new String(buffer, 0, read);
            PrintArgs(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void PrintArgs(String str)
    {
        if(str.isEmpty()) {
            System.out.println("Hello World");
        }
        else {
            System.out.println(str);
        }

    }
}
