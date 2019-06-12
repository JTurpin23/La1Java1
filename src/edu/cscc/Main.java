package edu.cscc;

// Jackie Turpin 5/28/19 Tree Maker //

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

       System.out.print("Please input the height (Positive number only) you would like your tree: ");
        Tree tree = new Tree (scan.nextInt());  }

        }