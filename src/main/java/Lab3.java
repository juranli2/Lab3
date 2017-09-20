/*123*/
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
/*123*/
public class Lab3 {
/*123*/
    public static void main(String[] args) {
        String url = "http://erdani.com/tdpl/hamlet.txt";
        String contents = urlToString(url);

        System.out.println("Simple Java Word Count Program");


        int wordCount = 1;

        for (int i = 0; i < contents.length(); i++)
        {
            if (contents.charAt(i) == ' ')
            {
                wordCount++;
            }
        }

        System.out.println("Word count is = " + wordCount);// TODO Auto-generated method stub

    }




/**
 * Retrieve contents from a URL and return them as a string.
 *
 * @param url url to retrieve contents from
 * @return the contents from the url as a string, or an empty string on error
 */
public static String urlToString(final String url) {
    Scanner urlScanner;
    try {
        urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
    } catch (IOException e) {
        return "";
    }
    String contents = urlScanner.useDelimiter("\\A").next();
    urlScanner.close();
    return contents;
}
}