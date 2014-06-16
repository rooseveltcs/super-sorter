/*
* Demons.java
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

public class Demons implements ActionListener{// A clone class that returns a fileName
   private GUI gui;
   
   public Demons(GUI gui){// A constructor
      this.gui = gui;
   }
   
   public void actionPerformed(ActionEvent e){// Returns a fileName
      String fileName = "Demons";
      String songorAuthor = "S";
      gui.updateFileName(fileName);
      gui.setAuthororSinger(songorAuthor);
      gui.updateState(true);
   }
}