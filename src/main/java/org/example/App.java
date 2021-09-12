/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package org.example;
import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("What is the quote? ");
        String str = s.nextLine();
        System.out.print("Who said it? ");
        String person = s.nextLine();
        String res = person.concat(" says, ").concat("\"").concat(str).concat("\"");
        System.out.print(res);
    }
}