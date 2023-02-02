package be.vdab.jpfhfdst21;

import be.vdab.Punt;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class testMain {
    public static void main(String[] args) {

        try (var stream =
                     new ObjectInputStream(Files.newInputStream(
                             Path.of("/data/punt.ser")));
        ) {
            var punt = (Punt) stream.readObject();
            System.out.println(punt);
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
}

