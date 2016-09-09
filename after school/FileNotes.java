import java.io.*;
public class FileNotes{
  
  public static void main (String args[]) throws IOException{
    
    BufferedWriter outStream =
      new BufferedWriter(new FileWriter("brandon.txt")); // #1
    File f = new File("brandon.txt");
    String x = f.getAbsolutePath();
    outStream.write("micheal "); // #2
    outStream.write("fox jumps over the lazy dog"); // #3
    outStream.newLine(); // #4
    outStream.write("on Sundays only,"); // #5
    outStream.newLine(); // #6
    outStream.write("unless it rains."); // #7
    outStream.close(); // #8
    System.out.println("brandon.txt is created\n"); // #9
    
    BufferedReader inStream =
      new BufferedReader(new FileReader("brandon.txt")); // #10
    System.out.println(inStream.readLine());
    System.out.println(inStream.readLine());
    System.out.println(inStream.readLine());
    System.out.println(x);
    
  }
}