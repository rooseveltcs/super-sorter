/*
* InformationFinder.java
* Assignment: Final Project - Super Sorter
* Purpose: Demonstrating that I can design and code a project on my own 
*
* @version 6/13/14
* @author Nate Spencer
*/

import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.io.*;
import javax.swing.*;

public class InformationFinder{ // A class that scans through txt files and pulls out information about them
   private String fileName;
   private String docName;
   private int countWords;
   private int countLetters;
   private ArrayList<String> words;
   
   public InformationFinder(String fileName, String docName)throws FileNotFoundException{ // Constructs a InformationFinder
      this.fileName = fileName;
      this.docName = docName;
      Scanner docWords = new Scanner(new File(fileName + ".txt"));
      ScannerToArray(docWords, fileName);
   }
   
   public void ScannerToArray(Scanner docWords, String fileName){ // Makes an ArrayList of the contents of the Scanner
      docWords.nextLine();
      docWords.nextLine();
      words = new ArrayList<String>();
      int i = 0;
      while(docWords.hasNext()){
         words.add(i, docWords.next());
         i += 1;
      }
   }
   
   public double WordCount(){ // Gathers the wordcount of the document in the ArrayList
      double counter = words.size();
      return counter;
   }
   
   public double LetterCount(){ // Gathers the lettercount of the document in the ArrayList
      String counted = words.toString();
      double counter = counted.length() - words.size();
      return counter;
   }
}