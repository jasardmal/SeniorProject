import java.net.*;
import java.io.*;

public class Test {

    public static void main(String[] args) throws Exception {
        String url = "file:///G:/htmlreader/index.html";//"http://stackoverflow.com/questions/2835505";
        BufferedReader in=new BufferedReader(new InputStreamReader(new URL(url).openStream()));

        String out="";
        String line="";

        while ((line = in.readLine())!= null)
        {
            if (line.indexOf("<") != -1)
            {
                if (line.indexOf(">") != line.length() - 1)
                {
                    out += line.substring(line.indexOf(">") + 1, line.lastIndexOf("<"));
                    out += "\n";
                }
                else
                {
                    continue;
                }
            }
        }

        in.close();
        System.out.flush();
        System.out.println(out);
    }
}