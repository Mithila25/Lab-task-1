/*
Name    : Mithila Talukdar
ID      : 2012020056
Section : B
email   : cse_2012020056@lus.ac.bd
Date    : 16-07-2021
 */

package mithila;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String section;
        Scanner input = new Scanner(System.in);


        System.out.print("Please enter your section : ");
        section = input.nextLine();

        Info info = new Info();
        Hobby hobby = new Hobby();

        System.out.println("Section : "+section);
        System.out.println("Name : "+info.name);
        System.out.println("ID : "+info.id);
        System.out.println("Hobby : "+hobby.hobbyName);
    }
}