/*
* GUI.java
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

public class GUI { // Makes the frames that are displayed thoughout the programs run
   private int countLetters;
   private int countWords;
   private String fileName;
   private boolean readyToRead;
   private String songorAuthor;
  
   public GUI(String fileName, String songorAuthor){ // Contructs a GUI
      this.fileName = fileName;
      this.countLetters = countLetters;
      this.countWords = countWords;
      readyToRead = false;
      this.songorAuthor = songorAuthor;
      Welcome();
      String choice = LitOrLyric();
      if(choice.equals("LYRICS")){
         Lyric(this);
      }
      else if(choice.equals("LITERATURE")){
         Literature(this);
      }
   }
   
   public void updateState(boolean readyToRead) { // Update the ready to read boolean value
      this.readyToRead = readyToRead;
   }
   
   public boolean ready() { // Returns if the readyToRead boolean value
      return readyToRead;
   }
   
   public void Welcome(){ // Displays a welcome message
      JOptionPane.showMessageDialog(null, "Welcome!");
   }
   
   public String LitOrLyric(){ // Asks user whether they want to look at literature or lyrics and returns the choice
      String choice = JOptionPane.showInputDialog(null, "Would you like to look at Literature or Lyrics?");
      return choice.toUpperCase();
   }
   
   public void Lyric(GUI gui){ // Creates a frame with buttons that are named after different songs
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
      frame.setSize(new Dimension(250, 450));
      frame.setTitle("Lyric Document Displayer");
      frame.setLayout(new FlowLayout());
   
      JPanel ButtonPanel = new JPanel(new GridLayout(15, 1));
      JButton lybutton1 = new JButton("All The Right Moves");
      JButton lybutton2 = new JButton("Bohemian Rhapsody");
      JButton lybutton3 = new JButton("Carry On My Wayward Son");
      JButton lybutton4 = new JButton("Counting Stars");
      JButton lybutton5 = new JButton("Demons");
      JButton lybutton6 = new JButton("Eye of the Tiger");
      JButton lybutton7 = new JButton("Float On");
      JButton lybutton8 = new JButton("Heartless");
      JButton lybutton9 = new JButton("Let It Go");
      JButton lybutton10 = new JButton("Odds Are");
      JButton lybutton11 = new JButton("Radioactive");
      JButton lybutton12 = new JButton("Renegade");
      JButton lybutton13 = new JButton("Rhythm Of Love");
      JButton lybutton14 = new JButton("Viva La Vida");
      JButton lybutton15 = new JButton("We Are The Champions");
      
      lybutton1.addActionListener(new AllTheRightMoves(gui));
      lybutton2.addActionListener(new BohemianRhapsody(gui));
      lybutton3.addActionListener(new CarryOnMyWaywardSon(gui));
      lybutton4.addActionListener(new CountingStars(gui));
      lybutton5.addActionListener(new Demons(gui));
      lybutton6.addActionListener(new EyeoftheTiger(gui));
      lybutton7.addActionListener(new FloatOn(gui));
      lybutton8.addActionListener(new Heartless(gui));
      lybutton9.addActionListener(new LetItGo(gui));
      lybutton10.addActionListener(new OddsAre(gui));
      lybutton11.addActionListener(new Radioactive(gui));
      lybutton12.addActionListener(new Renegade(gui));
      lybutton13.addActionListener(new RhythmOfLove(gui));
      lybutton14.addActionListener(new VivaLaVida(gui));
      lybutton15.addActionListener(new WeAreTheChampions(gui));
      
      ButtonPanel.add(lybutton1);
      ButtonPanel.add(lybutton2);
      ButtonPanel.add(lybutton3);
      ButtonPanel.add(lybutton4);
      ButtonPanel.add(lybutton5);
      ButtonPanel.add(lybutton6);
      ButtonPanel.add(lybutton7);
      ButtonPanel.add(lybutton8);
      ButtonPanel.add(lybutton9);
      ButtonPanel.add(lybutton10);
      ButtonPanel.add(lybutton11);
      ButtonPanel.add(lybutton12);
      ButtonPanel.add(lybutton13);
      ButtonPanel.add(lybutton14);
      ButtonPanel.add(lybutton15);
      
      frame.add(ButtonPanel, BorderLayout.CENTER);
      
      frame.setVisible(true);
   }
   
   public void Literature(GUI gui){ // Creates frame with buttons that are named after documents of literature
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
      frame.setSize(new Dimension(250, 450));
      frame.setTitle("Literature Document Displayer");
      frame.setLayout(new FlowLayout());
   
      JPanel ButtonPanel = new JPanel(new GridLayout(10, 1));
      JButton libutton1 = new JButton("Dracula");
      JButton libutton2 = new JButton("Hitchhiker's Guide to the Galaxy");
      JButton libutton3 = new JButton("Life, The Universe, and Everything");
      JButton libutton4 = new JButton("Mostly Harmless");
      JButton libutton5 = new JButton("Ode To Code");
      JButton libutton6 = new JButton("Sherlock");
      JButton libutton7 = new JButton("So Long and Thanks For All the Fish");
      JButton libutton8 = new JButton("The Invisible Man");
      JButton libutton9 = new JButton("They're Made Out Of Meat");
      JButton libutton10 = new JButton("Where The Sidewalk Ends");
      
      libutton1.addActionListener(new Dracula(gui));
      libutton2.addActionListener(new HitchHikersGuide(gui));
      libutton3.addActionListener(new LifeUniverseEverything(gui));
      libutton4.addActionListener(new MostlyHarmless(gui));
      libutton5.addActionListener(new OdeToCode(gui));
      libutton6.addActionListener(new Sherlock(gui));
      libutton7.addActionListener(new SoLongThxForFish(gui));
      libutton8.addActionListener(new TheInvisibleMan(gui));
      libutton9.addActionListener(new TheyreMadeOutOfMeat(gui));
      libutton10.addActionListener(new WhereTheSidewalkEnds(gui));
      
      ButtonPanel.add(libutton1);
      ButtonPanel.add(libutton2);
      ButtonPanel.add(libutton3);
      ButtonPanel.add(libutton4);
      ButtonPanel.add(libutton5);
      ButtonPanel.add(libutton6);
      ButtonPanel.add(libutton7);
      ButtonPanel.add(libutton8);
      ButtonPanel.add(libutton9);
      ButtonPanel.add(libutton10);
      
      frame.add(ButtonPanel, BorderLayout.CENTER);
      
      frame.setVisible(true);
   }
  
   public String returnFileName(){ // Returns the fileName String
      return fileName;
   }
   
   public void updateFileName(String fileName){ // Sets fileName
      this.fileName = fileName;
   }
   
   public String returnsongorAuthor(){ // Returns the songorAuthor String
      return songorAuthor;
   }
   
   public void setAuthororSinger(String songorAuthor){ // Sets songorAuthor String based on the String provided
      if(songorAuthor.equals("S")){
         songorAuthor = "Performer";
      }
      else if(songorAuthor.equals("A")){
         songorAuthor = "Writer";
      }
      this.songorAuthor = songorAuthor;
   }
   
   public void DisplayInfo(double countWords, double countLetters, String docName, String songorAuthor, String writerorSingerName, double avgWordLength){ // Creates the frame that displays all the information
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(new Dimension(350, 100));
      frame.setTitle(docName + " Information");
      frame.setLayout(new FlowLayout());
      
      JPanel topCenter = new JPanel(new GridLayout(4, 1));
      topCenter.add(new JLabel("The " + songorAuthor + " is: " + writerorSingerName));
      topCenter.add(new JLabel("The Word Count is: " + countWords));
      topCenter.add(new JLabel("The Letter Count is: " + countLetters));
      topCenter.add(new JLabel("The Average Word Length is: " + avgWordLength + " letters"));
      frame.add(topCenter, BorderLayout.CENTER);
      
      JButton button1 = new JButton("Click To Close");
      button1.addActionListener(new DisplayButton());
      frame.add(button1);
            
      frame.setVisible(true);
   }
}
//DISPLAY BUTTON
class DisplayButton implements ActionListener { // The code that exits the program when the button is pressed
   public void actionPerformed(ActionEvent e) {
      System.exit(0);
   }
}