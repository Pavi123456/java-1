import java.io.*;
public class words
{
    public static void main (String [] args) throws IOException
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String inputValue;
        inputValue = input.readLine();
        String[] words = inputValue.split("\\s+");
        for(int j= 0; j< words.length; j++)
        {
           System.out.println(words[j];
        }

    }
}
