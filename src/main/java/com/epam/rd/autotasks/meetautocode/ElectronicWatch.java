package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int minutes = (int)Math.floor((float)seconds/60);
        int minutesTens = (int)Math.floor((float)minutes/10)%6;
        int minutesOnes = minutes%10;
        int hours = (int)Math.floor((float)minutes/60)%24;
        seconds = seconds%60;
        int secondsTens = (int)Math.floor((float)seconds/10);
        int secondsOnes = seconds%10;
        System.out.print(hours + ":" + minutesTens + minutesOnes + ":" + secondsTens + secondsOnes);
    }
}
