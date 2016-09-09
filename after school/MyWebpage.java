import java.io.*;
import java.awt.Desktop;


public class MyWebpage{
  
  public static String addSpace(int n) {
    String result = "";
    for (int i = 0; i < n*3; i++)
      result += "&nbsp;";
    return result;
  }
      
  public static void main (String args[]) throws IOException {

      BufferedWriter outStream =
      new BufferedWriter(new FileWriter("Burns.html"));
       outStream.write("<html>"); 
       outStream.write("<head><title>Burns</title></head>");
       outStream.write("<body>"); 
       outStream.write("<p>import java.io.*;\n</p>"); 
       outStream.write("<p>import java.awt.Desktop;\n</p>"); 
       outStream.write("<br />");
       outStream.write("<p>public class MyWebpage{</p>");
       outStream.write("<p>" + addSpace(1) + "public static void main (String args[]) throws IOException {</p>");
       outStream.write("<br />");
       outStream.write("<p>" + addSpace(2) + "BufferedWriter outStream =</p>");
       outStream.write("<p>" + addSpace(2) + "new BufferedWriter(new FileWriter(\"Burns.html\"));</p>");
       outStream.write("<p>" + addSpace(2) + "outStream.write(\"&#60;html&#62;\");</p>");
       outStream.write("<p>" + addSpace(2) + "outStream.write(\"&#60;head&#62;&#60;title&#62;Burns&#60;/title&#62;&#60;/head&#62;\");</p>");
       outStream.write("<p>" + addSpace(2) + "outStream.write(\"&#60;body&#62;\"); </p>");
       outStream.write("<p>" + addSpace(2) + "outStream.write(\"&#60;p&#62;Write a Program&#60;/p&#62;\"); </p>");
       outStream.write("<p>" + addSpace(2) + "outStream.write(\"&#60;/body&#62;\"); </p>");
       outStream.write("<p>" + addSpace(2) + "outStream.write(\"&#60;/html&#62;\");</p>");
       outStream.write("<p>" + addSpace(2) + "outStream.close();</p>");

        //open file
       outStream.write("<p>" + addSpace(2) + "try {</p>");
       outStream.write("<p>" + addSpace(3) + "Desktop desktop = null;</p>");
       outStream.write("<p>" + addSpace(3) + "if (Desktop.isDesktopSupported()) {</p>");
       outStream.write("<p>" + addSpace(4) + "desktop = Desktop.getDesktop();</p>");
       outStream.write("<p>" + addSpace(3) + "}</p>");
       outStream.write("<p>" + addSpace(3) + "desktop.open(new File(\"Burns.html\"));</p>");
       outStream.write("<p>" + addSpace(2) + "} catch (IOException ioe) {</p>");
       outStream.write("<p>" + addSpace(3) + "ioe.printStackTrace();</p>");
       outStream.write("<p>" + addSpace(2) + "}</p>");
       outStream.write("<p>" + addSpace(1) + "}</p>");
        outStream.write("<p>}</p>");
       
       outStream.write("</body>"); 
       outStream.write("</html>"); 
       outStream.close();
    try {
      Desktop desktop = null;
      if (Desktop.isDesktopSupported()) {
        desktop = Desktop.getDesktop();
      }

       desktop.open(new File("Burns.html"));
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }


  }
}