package labseven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Atm {
  public static void main(String [] args) {
    // declare the starting file and scanner
    File inputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      inputsFile = new File("input/input1.txt");
      scanner = new Scanner(inputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
  }
}
