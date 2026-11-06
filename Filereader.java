import java.io.*;

public class Filereader
{
    public static void main(String[] args)
    {
        try
        {
            // Create a FileReader object
            FileReader fr = new FileReader("sample2.txt");

            // Declare a variable to store characters
            int i;

            // Read and display the file contents
            while ((i = fr.read()) != -1)
            {
                System.out.print((char) i);
            }

            // Close the file
            fr.close();
        }
        catch (IOException e)
        {
            // Display the exception message
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
