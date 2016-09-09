import java.io.*;
import java.text.DecimalFormat;
public class FileName{
  public static void main (String args[]) throws IOException {
          int count = 0;
          float mage = 0;
          float mgpa = 0;
    System.out.println("\nFileName -- The Student Records File Program\n");
    DecimalFormat df = new DecimalFormat("00.000");
    File f1 = new File("students.dat");
    File f2 = new File("passing.dat");
    File f3 = new File("honors.dat");
    f2.delete();
    f3.delete();
    if (f1.exists()){

      FileReader inFile = new FileReader(f1);
      BufferedReader inStream = new BufferedReader(inFile);
      // FileWriter outFile = new FileWriter(f1);
      // BufferedWriter outStream = new BufferedWriter(outFile);
      String s = inStream.readLine();
      while(s != null){

      System.out.println("Name: " + s);
      s = inStream.readLine();

      System.out.println("Age:  " + s);
      mage += Integer.parseInt(s);
      s = inStream.readLine();

      System.out.println("GPA:  " + s);
      mgpa += Double.parseDouble(s);
      s = inStream.readLine();

      System.out.println();
      count++;
      }
    }
    else{
      System.out.println(f1.getName() + " does not exist");   
    }
    System.out.println();
    mage = mage/count;
    mgpa = mgpa/count;
    System.out.println("Total student records: "+count);
    System.out.println("Average student age:   "+df.format(mage));
    System.out.println("Average student gpa:   "+df.format(mgpa));

  }
}