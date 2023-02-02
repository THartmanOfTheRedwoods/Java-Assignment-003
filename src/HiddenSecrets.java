/**
 *
 * @author Trevor Hartman
 * @author Jeff Grimm
 *
 * @since Version 1.0
 */
package src;

import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Metadata;
import com.drew.metadata.Directory;
import com.drew.metadata.Tag;
import com.drew.imaging.ImageMetadataReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// PUT YOUR IMPORTS HERE

import java.nio.file.Paths;
import java.util.Scanner;
import java.nio.file.Path;


public class HiddenSecrets {
    public static void getHiddenSecrets(File file) {
        try {
            Metadata metadata = ImageMetadataReader.readMetadata(
                    new FileInputStream(file)
            );
            for (Directory directory : metadata.getDirectories()) {
                for (Tag tag : directory.getTags()) {
                    System.out.format("[%s] - %s = %s%n",
                            directory.getName(), tag.getTagName(), tag.getDescription());
                }
                if (directory.hasErrors()) {
                    for (String error : directory.getErrors()) {
                        System.err.format("ERROR: %s%n", error);
                    }
                }
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("That file does not exist.");
        } catch (IOException ioe) {
            System.out.println("Problem reading from file stream.");
        } catch (ImageProcessingException ipe) {
            System.out.println("Failed to process the image meta-data");
        }
    }
    public static void main(String[] args) {

        String location;// Declares variable url as type string
        Scanner scanner = new Scanner(System.in); // Gathers user input

        // Put your code to request a file path,

        System.out.println("Enter Image Location: "); // Asks user for input

        // read in a string from System.in,

        location = scanner.nextLine(); // Places user input into memory as variable url

        // System.out.println(location); // Tests variable location

        // convert that string into A Path type using Paths class,

        Path path = (Path)Paths.get(location); // Gets input from getImageString

        // and call the getHiddenSecrets method to get the file's meta-data

        getHiddenSecrets(new File(path.toUri())); /*
        getHiddenSecrets method passed variable path
        getHiddenSecrets then *gets* or uses the Uri provided at variable path = location (provided by user)
        Blundered my way into this by "clicking around" - Still 100% unclear on what's happening here */

        // HERE

    }
}

