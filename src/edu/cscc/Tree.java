package edu.cscc;

// Jackie Turpin 5/28/19 Tree Maker //
public class Tree {
    private int height;


    public Tree(int height) {
        this.height = height;
        for(int i=1;i<=this.height;i++){
            for(int j=1;j<=(this.height-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<i;k++){
                System.out.print("* ");
            }
            System.out.print("*");
            System.out.println();
        } } }






