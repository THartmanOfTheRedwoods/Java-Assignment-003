/**
 * @author Trevor Hartman
 * @author Michael Thoreson
 *
 * @since 1.0
 */
import java.nio.file.Paths;
import java.io.File;
import java.util.Scanner;
import java.nio.file.Path;
public class readMetadata {

    public static void main(String[] args) {
        Scanner pathField = new Scanner(System.in);
        System.out.println("Enter the path to your file:");
        Path myPath = Paths.get(pathField.nextLine());
        File myFile = myPath.toFile();
        HiddenSecrets.getHiddenSecrets(myFile);
    }
}
