package com.example.helloworld;

public class HelloWorld {
    public static void main(String[] args){
        PrintArgs("Was für eine umständliche Sprache!");
        PrintArgs("");
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
