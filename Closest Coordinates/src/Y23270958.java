//package locationsDistance;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Y23270958 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

//check parameter in priority queue constructor
        PriorityQueue<location> pq = new PriorityQueue<location>(new locationsComparator());

        int n;
        n = 7;
        // n = Integer.parseInt(args[1]);

        // readFile rf = new readFile(args[0]);
        readFile rf = new readFile(
                "C:\\Users\\p_mf\\Desktop\\Y23270958\\locations.txt"); // put
                                                                                                                                                   // in
                                                                                                                                                   // args[0]
        rf.readFromFile(pq);
        /*
         * while (!pq.isEmpty()) { pq.poll().print();
         * 
         * }
         */

        // after all data is entered into priority queue
        File file1 = new File(
                "C:\\Users\\p_mf\\Desktop\\Y23270958\\locationsResults.txt");
        // File file1 = new File("locationsResults.txt");
        // Create the file
        try {
            if (file1.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        FileWriter writer;
        try {
            // Write Content
            writer = new FileWriter(file1);

            for (int i = 0; i < n; i++) {
                writer.write(pq.poll().toString() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}