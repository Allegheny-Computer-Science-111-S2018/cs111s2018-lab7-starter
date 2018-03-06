package labseven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Atm {
  public static void main( String args[] ) {
    // declare the starting file and scanner
    File inputsFile1 = null;
    File inputsFile2 = null;
    Scanner scanner = null;
    // connect the scanner to the first input file
    try {
      inputsFile1 = new File("input/input1.txt");
      scanner = new Scanner(inputsFile1);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // connect the scanner to the second input file
    try {
      inputsFile2 = new File("input/input2.txt");
      scanner = new Scanner(inputsFile2);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
  }
}
