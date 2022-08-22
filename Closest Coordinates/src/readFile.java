//package locationsDistance;

import java.io.File;
import java.util.PriorityQueue;
import java.util.Scanner;

public class readFile {

    private Scanner z;

    public readFile(String s) {
        try {
            z = new Scanner(new File(s));
        } catch (Exception e) {
            System.out.println("location not found");
        }
    }

    public void readFromFile(PriorityQueue<location> priortyQ) {

        // need this line to skip first character
        // see:
        // https://stackoverflow.com/questions/17405165/first-character-of-the-reading-from-the-text-file-%C3%AF
        z.skip("﻿"); 
        if (z.hasNext()) {
            location.setA(z.nextInt());
            location.setB(z.nextInt());
        }
        int size = 0;
        while (z.hasNext()) {
            int x = z.nextInt();
            int y = z.nextInt();
            location locat = new location(x, y, location.getA(), location.getB());
            // System.out.println(size + ":");
            // locat.print();
            priortyQ.add(locat);
            size++;
        }
        z.close();
    }

}
