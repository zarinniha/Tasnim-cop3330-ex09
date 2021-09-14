/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Zarin Tasnim
 */

import java.util.Scanner;

class painCalculator{

    public static void main(String args[])
    {
        System.out.print("What is the lenght? ");
        Scanner sc = new Scanner(System.in);//reading the lenght
        int length = sc.nextInt();

        System.out.print("What is the width? ");
        int width = sc.nextInt();//reading the width

        int area = length * width;
        double num_paint = (double)area/350;
        System.out.println("You will need to purcahse " + (int)Math.ceil(num_paint) + " gallos of paint to cover "
                +area + " square feet");




    }
}
