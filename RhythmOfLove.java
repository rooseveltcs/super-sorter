/*
* RhythmOfLove.java
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

public class RhythmOfLove implements ActionListener{// A clone class that returns a fileName
   private GUI gui;
   
   public RhythmOfLove(GUI gui){// A constructor
      this.gui = gui;
   }
   
   public void actionPerformed(ActionEvent e){// Return a fileName
      String fileName = "RhythmOfLove";
      String songorAuthor = "S";
      gui.setAuthororSinger(songorAuthor);
      gui.updateFileName(fileName);
      gui.updateState(true);
   }
}