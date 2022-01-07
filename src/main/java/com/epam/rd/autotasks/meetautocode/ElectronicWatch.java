package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int minutes = (int)Math.floor((float)seconds/60);
        int hours = (int)Math.floor((float)minutes/60);
        seconds = seconds%60;
        System.out.print(hours + ":" + minutes + ":" + seconds);


    }
}
