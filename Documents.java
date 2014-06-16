/*
* Documents.java
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

public class Documents { // The main of the code, gathers the fileName, fileName to InformationFinder, sends the infomation to GUI to make the frame
   public static void main(String[]args) throws FileNotFoundException{ 
      String fileName = "";
      String songorAuthor = "";
      GUI gui = new GUI(fileName, songorAuthor);
      while(true) {
         if(gui.ready()) {
            Scanner getDocNameAndWriterorSingerName = new Scanner(new File(gui.returnFileName() + ".txt"));
            String docName = getDocNameAndWriterorSingerName.nextLine();
            String writerorSingerName = getDocNameAndWriterorSingerName.nextLine();
            InformationFinder docInfo = new InformationFinder(gui.returnFileName(), docName);
            double countWords = docInfo.WordCount();
            double countLetters = docInfo.LetterCount();
            double avgWordLength = countLetters/countWords;
            gui.DisplayInfo(countWords, countLetters, docName, gui.returnsongorAuthor(), writerorSingerName, avgWordLength);
            break;
         }
         try{
            Thread.sleep(100);
         }
         catch(Exception e){}
      }
   }
}