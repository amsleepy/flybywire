package programmingAssign1;

import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;

public class Benchmarking {

    public static void main(String args[]) {

        LinkedList<Integer> num = new LinkedList<Integer>();
        BufferedReader read = null;

        Scanner keys = new Scanner(System.in);
        System.out.println("Enter name of file to be sorted.");
        String filename = keys.nextLine();
        System.out.println();

        long start = System.nanoTime();

        try { 

            read = new BufferedReader(new FileReader(filename));

            while (read.readLine() != null) {

                String insert = read.readLine();
                num.add(Integer.parseInt(insert));
                Collections.sort(num, (Integer one, Integer two) -> one.compareTo(two));

            }

            long end = System.nanoTime();

            System.out.println("Values inserted in " + (end - start)/1000000 + " milliseconds.");
            System.out.println("----------------------------------------------");
            num.forEach(Integer -> System.out.println(Integer));

            System.out.println();

            start = System.nanoTime();
            int min = num.get(0);
            end = System.nanoTime();
            System.out.println("Minimum found in " + (end - start)/1000 + " microseconds.");
            System.out.println("List minimum = " + min + "\n");

            start = System.nanoTime();
            int max = num.getLast();
            end = System.nanoTime();
            System.out.println("Maximum found in " + (end - start)/1000 + " microseconds.");
            System.out.println("List maximum = " + max + "\n");

            start = System.nanoTime();
            int med = num.get(num.size()/2);
            end = System.nanoTime();
            System.out.println("Median found in " + (end - start)/1000 + " microseconds.");
            System.out.println("List median = " + med + "\n");



        } catch (FileNotFoundException f) {
            f.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (read != null) {
                    read.close();
                } 
            } catch (IOException e) {
            } 
        }
    }   
}