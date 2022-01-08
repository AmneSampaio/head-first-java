package com.amne.java.chapter1;

public class BeerSong {
    public static void main(String[] args) {
        String word = "bottles";
        for (int i = 99; i > 0 ; i--) {
            if (i != 1) {
                System.out.println(i + " " + word + " of beer on the wall\n" +
                i + " " + word + " of beer.");
            } else {
                word = "bottle";
                System.out.println(i + " " + word + " of beer on the wall\n" +
                i + " " + word + " of beer.");
            }
            System.out.println("Take one down.\n"+"Pass it around.");
            if (i-1 == 1){
                word = "bottle";
                System.out.println(i-1 + " " + word + " of beer on the wall");
            } else if (i-1 > 1){
                System.out.println(i-1 + " " + word + " of beer on the wall");
            } else {
                System.out.println("No more bottles of beer on the wall");
            }
        }


        /*while (beerNum > 0) {
            if (beerNum != 1) {
                System.out.println(beerNum + " " + word + " of beer on the wall");
                System.out.println(beerNum + " " + word + " of beer.");
            } else {
                word = "bottle"; // singular, as in ONE bottle.
                System.out.println(beerNum + " " + word + " of beer on the wall");
                System.out.println(beerNum + " " + word + " of beer.");
            }
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum - 1;
            if (beerNum > 0 && beerNum != 1) {
                System.out.println(beerNum + " " + word + " of beer on the wall");
            } else if (beerNum == 1) {
                word = "bottle"; // singular, as in ONE bottle.
                System.out.println(beerNum + " " + word + " of beer on the wall");
            } else {
                System.out.println("No more bottles of beer on the wall");
            } // end else
        } // end while loop*/
    } // end main
}
