package printToFileOnDrive;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        scanner.close();

        FileWriter writer = new FileWriter("C:\\name.txt");
        writer.write(name);
        writer.close();
        System.out.println("Your name has been written to name.txt");
    }
}