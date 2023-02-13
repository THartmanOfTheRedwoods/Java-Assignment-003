import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Metadata;
import com.drew.metadata.Directory;
import com.drew.metadata.Tag;
import com.drew.imaging.ImageMetadataReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.drew.metadata.Metadata;
import java.nio.file.Paths;
import java.util.Scanner;
import java.nio.file.Path;
// PUT YOUR IMPORTS HERE

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
        // Put your code to request a file path,
        System.out.println("Please type the filepath of the image which you would like the coords of:");
        Scanner sc = new Scanner(System.in);
        // read in a string from System.in,
        String givenPath = sc.nextLine();
        // convert that string into A Path type using Paths class,
        Path path = (Path)Paths.get(givenPath);
        File myFile = path.toFile();
        // and call the getHiddenSecrets method to get the file's meta-data
        // HERE
        getHiddenSecrets(myFile);
    }
}
