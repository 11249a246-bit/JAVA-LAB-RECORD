import java.io.*;

public class Filewriter
{
    public static void main(String[] args)
    {
        try
        {
            // Create a FileWriter object
            FileWriter fw = new FileWriter("sample2.txt");

            // Write uppercase alphabets from A to Z
            for (char i = 'A'; i <= 'Z'; i++)
            {
                fw.write(i);
            }

            // Close the file
            fw.close();

            // Display success message
            System.out.println("Data written successfully.");
        }
        catch (IOException e)
        {
            // Display the exception message
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
