import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileLineReader {
    public static void main(String[] args) {
        String fileName = "input.txt";
        
        // TODO: Use a try-with-resources block to open a BufferedReader for the file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            // TODO: Keep track of the line number (starting from 1)
            int lineNumber = 1;
            
            // TODO: Read the file line by line using a loop
            while ((line = reader.readLine()) != null) {
                // TODO: Print each line in the format "lineNumber: lineContent"
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }
            
        } catch (IOException e) {
            // TODO: Catch and handle any IOExceptions that might occur
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
