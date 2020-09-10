package programmingAssign1;

import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Benchmarking {

    public static void main(String args[]) {

        LinkedList<Integer> num = new LinkedList<Integer>();
        BufferedReader read = null;

        try { 

            read = new BufferedReader(new FileReader("input1.txt"));

            String head = read.readLine();
            String next;
            int numberA = Integer.parseInt(head);
            int numberB;
            
            num.addFirst(numberA);

            while (read.readLine() != null) {

                next = read.readLine();
                numberA = Integer.parseInt(head);
                numberB = Integer.parseInt(next);

                if (numberB <= numberA) {
                    num.addFirst(numberB);
                } else {
                    num.add(numberB);
                }

            }

        } catch (FileNotFoundException f) {
            f.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
}
