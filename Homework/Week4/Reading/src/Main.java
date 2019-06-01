
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Main {
    private static List<Character> list = new ArrayList<>();
    private static int lineNumber = 0;

    public static void main(String[] args) throws IOException {

        System.out.print("Enter cells: ");
        // Scanner reader = new Scanner(System.in);
        BufferedReader j=new BufferedReader(new InputStreamReader(System.in));
        //String z = reader.nextLine();
        String q = j.readLine();
        j.close();
        for (int x = 0; x < 9; x++) {
            list.add(q.charAt(x));
        }
        System.out.println();

        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            printLine();
        }
        System.out.println("---------");

    }

    public static void printLine() {
        System.out.print("| ");
        for (int i = 0; i < 3; i++) {
            System.out.print(list.get(lineNumber)+" ");
            lineNumber++;
        }
        System.out.println("|");
    }


}
