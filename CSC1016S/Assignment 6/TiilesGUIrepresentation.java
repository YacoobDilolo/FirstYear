import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
public class TiilesGUIrepresentation extends JFrame implements ActionListener{
   //Instance Variables 
  private TileGUI[] b;
  private String word;
  private TileGUI[][] objects;
  private TileGUI wordObject;
  private ArrayList<TileGUI> wordObjects; 
  private TileGUI CurrentObject;
  private JPanel grid ;
  private TileCollection tiles ;
  private ArrayList<Player> scoreList;
  private JLabel feedbackScore;
  private JLabel feedbackWord;
  private JLabel feedbackChances;
  private int x;
  private int chances;
  private JPanel scoreResults;
  //Constructor to initialize instance variables, JFrame and JPanel
  public TiilesGUIrepresentation(){
     super();
	  setSize(400, 600);
     //setMaximumSize(600,600);
     b = new TileGUI[36];
     word ="";
     x = 0;
     chances=3;
     wordObjects = new ArrayList<TileGUI>();
     JButton submitButton = new JButton();
     grid = new JPanel();
     tiles = new TileCollection();
     setLayout(new BorderLayout());
     add(grid, BorderLayout.CENTER);
     add(submitButton, BorderLayout.SOUTH);
     submitButton.setActionCommand("Submit");
     submitButton.setText("Submit");
     submitButton.addActionListener(this);
     submitButton.setBackground(Color.CYAN);
     grid.setLayout( new GridLayout(6,6));
     scoreList = new  ArrayList<Player>();
     scoreResults= new JPanel();
    scoreResults.setLayout( new GridLayout(1,3));
    add(scoreResults, BorderLayout.NORTH);
    feedbackWord = new JLabel("Word :"+word);
    feedbackScore = new JLabel("Score: "+x);
    feedbackChances= new JLabel("Chances: "+chances);
   scoreResults.add(feedbackWord);
    scoreResults.add(feedbackScore);
    scoreResults.add(feedbackChances);
    scoreResults.setBackground(Color.PINK);
    

   }
   
  //Creating the Tiles to be shown on the grid
  public void getTiles(){
     for (int j = 0; j < b.length; j++){
         b[j] = new TileGUI(tiles.removeOne());
         grid.add(b[j]); 
         b[j].addActionListener(this);
         b[j].setForeground(Color.green);
         
        }
   }
   //Creating the board that is going to be used as a coordinate system in the form of a 2D Array
  public void getBoard(){
      objects = new TileGUI[6][6];
      int m = 0; 
      for (int i =0;i<objects.length;i++){
         for(int k=0;k<objects[i].length;k++){
            objects[i][k] = b[m];
            m++;      
         }
   }
 }
   //Instructing to the program what happens when the useer submits the word
   public void SubmitWord(){
      //creating a word using a the tiles stored when the user clicks on a word
      String wrd ="";
      for (TileGUI r:wordObjects){
        wrd += (r.getTile().letter()+"").toLowerCase();
        }
        word = wrd;
      //checking if the word is valid
     try {
            String[] results = FileToArray.read("EnglishWords.txt");
            boolean check = false;
            for (String w : results)
           {
            //System.out.println(w);
                if(word.equals(w)){
                 //if word is valid remove the tile and replace with another tile 
                 check = true;
                   for (TileGUI r:wordObjects){
                        for (int j = 0; j < b.length; j++){
                              if (b[j].equals(r)){
                                 b[j].removeActionListener(this);
                                 grid.remove(b[j]);
                                 b[j] = new TileGUI(tiles.removeOne());       
                               }
                         }
                    } 
                     //removing all tiles from the grid of stored tiles so as to  create a fresh grid
                     for (int j = 0; j < b.length; j++){
                        b[j].removeActionListener(this);
                        grid.remove(b[j]);
                     }
                     //creating a fresh a grid
                     for (int j = 0; j < b.length; j++){
                        grid.add(b[j]);
                        b[j].addActionListener(this);
                        b[j].setForeground(Color.green);
                     }
                     //setting objects of the clicked tiles to zero
                     wordObjects.removeAll(wordObjects);
                     //System.out.println(wordObjects.size());
                     //setting up the new list of stored tiles to the 2D arrray for index purposes
                     getBoard();  
                     this.setVisible(true); 
                     break; 
                }         
            }
         //checking if the word is there and telling  sending it the Player Class to calculate the points to construct another word.
         if(check){
            System.out.println(word);
            Player score = new Player(word);
            scoreList.add(score);
            for(Player e:scoreList){
                  x+=e.getPoints();
            }
           feedbackScore.setText("Score: "+x);
           word ="";
           feedbackWord.setText("Word: "+word);
         }
         //checking if the word is not there and telling the user to construct another word.
         if(!check){
             
                 chances--;
                 feedbackChances.setText("Chances: "+chances);
                    if(chances>0){
                    JOptionPane.showMessageDialog(grid,"please construct another word","Invalid Word",JOptionPane.ERROR_MESSAGE);
                    //System.out.println(wordObjects.size());
                    for(int j = 0; j < wordObjects.size(); j++){
                     wordObjects.get(j).setBackground(null);
                     }
                    CurrentObject=null;
                    wordObjects.removeAll(wordObjects);
                    word ="";
                    feedbackWord.setText("Word: "+word);
                
                  }else{
                        int n = JOptionPane.showConfirmDialog(
                                     grid,
                                     "Would you like to play again?",
                                     "Game Over",
                                     JOptionPane.YES_NO_OPTION);
                                     //play again
                                     if(n==0){
                                          grid.removeAll();
                                             TileCollection w = new TileCollection();
                                            TileGUI[]   c = new TileGUI[36];
                                            for (int j = 0; j < c.length; j++){
                                                c[j] = new TileGUI(w.removeOne());
                                                  grid.add(c[j]);
                                                  c[j].addActionListener(this);
                                                  c[j].setForeground(Color.green);
                                             } 
                                             wordObjects.removeAll(wordObjects);
                                              //System.out.println(wordObjects.size());
                                             word ="";
                                             feedbackWord.setText("Word: "+word);
                                             chances = 3;
                                             x=0;
                                             b = c;
                                             getBoard();  
                                             this.setVisible(true);  
                                             
                                          //exit game               
                                         }else if(n==1){
                                          System.exit(0);
                                         }
                              }
                     }
        }
        //when the Collection array in TileCollection class is empty the game is over the user can select to play again or quit the game
        catch (Exception exception) {
       int n = JOptionPane.showConfirmDialog(
    grid,
    "Would you like to play again?",
    "Game Over",
    JOptionPane.YES_NO_OPTION);
    //play again
    if(n==0){
         grid.removeAll();
           TileCollection q = new TileCollection();
           TileGUI[]   c = new TileGUI[36];
           for (int j = 0; j < c.length; j++){
                 c[j] = new TileGUI(q.removeOne());
                 grid.add(c[j]);
                 c[j].addActionListener(this);
                 c[j].setForeground(Color.green);
            } 
            wordObjects.removeAll(wordObjects);
             //System.out.println(wordObjects.size());
            word ="";
            feedbackWord.setText("Word: "+word);
            chances = 3;
            x=0;
            b = c;
            getBoard();  
            this.setVisible(true);  
            
         //exit game               
        }else if(n==1){
         System.exit(0);
        }
     }
 }
 //when the user clicks on a button
  public void actionPerformed(ActionEvent e){
     //when clicks the submit button should call the SubmitWord() method
     if (e.getActionCommand().equals("Submit")){
            SubmitWord();
      }
     //Setting what the user presses to the particular TileGUI
     for(int i =0;i<b.length;i++){
         if ((e.getSource()).equals(b[i])){
                  CurrentObject = b[i];
                  }
          }
    //UN-CLICKING AND UN-HIGHLITING AND REMOVING THEM FROM THE CLICKED LIST
   boolean check0 = false;
   for( TileGUI s:wordObjects){
      if(CurrentObject.equals(s)){
                  check0 = true;
         if(wordObjects.indexOf(s)==(wordObjects.size()-1)){
            s.setBackground(null);
            if(word.length()>0){
                word = word.substring(0,word.length()-1);
            }
 
            feedbackWord.setText("Word: "+word);
            if (wordObjects.size()>1){
            wordObject = wordObjects.get(wordObjects.indexOf(s)-1);
            }else{
               wordObject = s;
            }
            wordObjects.remove(s);
            break;
          }
         }

      }
   //Can only select if the word the button wasnt selected before and current one pressed isnt equal to nothing
   if (!check0&& CurrentObject != null){
         //if it is the first one pressed it should the following
         if (wordObjects.size()==0){        
            for(int i =0;i<b.length;i++){
                  if ((CurrentObject).equals(b[i])){
                  //highliting the background of the button to blue and creating a placeholder for the current button pressed
                  //And adding the clicked button to the list of clicked buttons
                           b[i].setBackground( Color.BLUE );
                             wordObject = b[i];
                             wordObjects.add(b[i]);
                             word +=b[i].getTile().letter()+"";
                             feedbackWord.setText("Word: "+word);
                  }
          }
         //if not it should do the following
         }else {
               for (int a = 0; a<objects.length;a++){
                  for (int c=0;c<objects[a].length;c++){
                  //a condition for when the button at the top left corner is pressed
                   if (a==0 &c==0){
                        //checking if the currently pressed button is adjacent to the previous one 
                       if (((CurrentObject.equals(objects[a+1][c]))& (objects[a][c].equals(wordObject)))||((CurrentObject.equals(objects[a][c+1]))& (objects[a][c].equals(wordObject)))||((CurrentObject.equals(objects[a+1][c+1]))& (objects[a][c].equals(wordObject)))){
                 //highliting the background of the button to blue and creating a placeholder for the current button pressed
                  //And adding the clicked button to the list of clicked buttons
                           for(int i =0;i<b.length;i++){
                               if ((CurrentObject).equals(b[i])){
                                   b[i].setBackground( Color.BLUE );
                                   wordObject = b[i];
                                   wordObjects.add(b[i]);
                                   word +=b[i].getTile().letter()+"";
                                   feedbackWord.setText("Word: "+word);
                                   
                                  }
                            }
                     }
                    //a condition for when the button at the top right corner is pressed
                   }else if(a==0 & c==5){
                        //checking if the currently pressed button is adjacent to the previous one 
                      if (((CurrentObject.equals(objects[a+1][c]))& (objects[a][c].equals(wordObject)))||((CurrentObject.equals(objects[a][c-1]))& (objects[a][c].equals(wordObject)))||((CurrentObject.equals(objects[a+1][c-1]))& (objects[a][c].equals(wordObject)))){
                  //highliting the background of the button to blue and creating a placeholder for the current button pressed
                  //And adding the clicked button to the list of clicked buttons
                           for(int i =0;i<b.length;i++){
                               if ((CurrentObject).equals(b[i])){
                                   b[i].setBackground( Color.BLUE );
                                   wordObject = b[i];
                                   wordObjects.add(b[i]);
                              word +=b[i].getTile().letter()+"";
                             feedbackWord.setText("Word: "+word);
                                  }
                            }
                     }
                    //a condition for when the button at the bottom left corner is pressed
                   }else if (a==5 & c==0){
                     //checking if the currently pressed button is adjacent to the previous one 
                     if (((CurrentObject.equals(objects[a-1][c]))& (objects[a][c].equals(wordObject)))||((CurrentObject.equals(objects[a][c+1]))& (objects[a][c].equals(wordObject)))||((CurrentObject.equals(objects[a-1][c+1]))& (objects[a][c].equals(wordObject)))){
                    //highliting the background of the button to blue and creating a placeholder for the current button pressed
                  //And adding the clicked button to the list of clicked buttons
                           for(int i =0;i<b.length;i++){
                               if ((CurrentObject).equals(b[i])){
                                   b[i].setBackground( Color.BLUE );
                                   wordObject = b[i];
                                   wordObjects.add(b[i]);
                                    word +=b[i].getTile().letter()+"";
                                    feedbackWord.setText("Word: "+word);
                                  }
                            }
                    }
                   //a condition for when the button at the botom left corner is pressed
                   }else if(a==5 & c==5){
                     //checking if the currently pressed button is adjacent to the previous one 
                     if (((CurrentObject.equals(objects[a-1][c]))& (objects[a][c].equals(wordObject)))||((CurrentObject.equals(objects[a][c-1]))& (objects[a][c].equals(wordObject)))||((CurrentObject.equals(objects[a-1][c-1]))& (objects[a][c].equals(wordObject)))){
                   //highliting the background of the button to blue and creating a placeholder for the current button pressed
                  //And adding the clicked button to the list of clicked buttons
                           for(int i =0;i<b.length;i++){
                               if ((CurrentObject).equals(b[i])){
                                   b[i].setBackground( Color.BLUE );
                                   wordObject = b[i];
                                   wordObjects.add(b[i]);
                                    word +=b[i].getTile().letter()+"";
                                    feedbackWord.setText("Word: "+word);
                                  }
                            }
                     } 
                   //a condition for when the buttons at the top row besides the ones at the corners are pressed  
                   }else if(a==0 & c !=0& c!=5){
                      //checking if the currently pressed button is adjacent to the previous one 
                      if (((CurrentObject.equals(objects[a+1][c]))||(CurrentObject.equals(objects[a][c+1])) ||(CurrentObject.equals(objects[a+1][c+1]))||(CurrentObject.equals(objects[a+1][c-1]))||(CurrentObject.equals(objects[a][c-1])))& (objects[a][c].equals(wordObject))){
                  //highliting the background of the button to blue and creating a placeholder for the current button pressed
                  //And adding the clicked button to the list of clicked buttons
                           for(int i =0;i<b.length;i++){
                               if ((CurrentObject).equals(b[i])){
                                   b[i].setBackground( Color.BLUE );
                                   wordObject = b[i];
                                   wordObjects.add(b[i]);
                                   word +=b[i].getTile().letter()+"";
                                   feedbackWord.setText("Word: "+word);
                                  }
                            }
                       }
                   //a condition for when the buttons at the first column besides the ones at the corners are pressed 
                   }else if(c==0 & a!=0 & a!=5){
                      //checking if the currently pressed button is adjacent to the previous one 
                      if (((CurrentObject.equals(objects[a+1][c]))||(CurrentObject.equals(objects[a-1][c]))||(CurrentObject.equals(objects[a][c+1]))||(CurrentObject.equals(objects[a+1][c+1]))||(CurrentObject.equals(objects[a-1][c+1])))& (objects[a][c].equals(wordObject))){
                 //highliting the background of the button to blue and creating a placeholder for the current button pressed
                  //And adding the clicked button to the list of clicked buttons
                            for(int i =0;i<b.length;i++){
                               if ((CurrentObject).equals(b[i])){
                                   b[i].setBackground( Color.BLUE );
                                   wordObject = b[i];
                                   wordObjects.add(b[i]);
                                   word +=b[i].getTile().letter()+"";
                                   feedbackWord.setText("Word: "+word);
                                  }
                            }
                        }
                    //a condition for when the buttons at the last  column besides the ones at the corners are pressed 
                   }else if (c==5 & a!=0 & a!=5 ){
                      //checking if the currently pressed button is adjacent to the previous one 
                     if (((CurrentObject.equals(objects[a+1][c]))||(CurrentObject.equals(objects[a-1][c]))||(CurrentObject.equals(objects[a][c-1]))||(CurrentObject.equals(objects[a+1][c-1]))||(CurrentObject.equals(objects[a-1][c-1])))& (objects[a][c].equals(wordObject))){
                   //highliting the background of the button to blue and creating a placeholder for the current button pressed
                  //And adding the clicked button to the list of clicked buttons
                           for(int i =0;i<b.length;i++){
                               if ((CurrentObject).equals(b[i])){
                                   b[i].setBackground( Color.BLUE );
                                   wordObject = b[i];
                                   wordObjects.add(b[i]);
                                    word +=b[i].getTile().letter()+"";
                                    feedbackWord.setText("Word: "+word);
                                  }
                            }
                        }
                    //a condition for when the buttons at the last row besides the ones at the corners are pressed 
                   }else if (a==5& c!=0 & c!=5 ){
                      //checking if the currently pressed button is adjacent to the previous one 
                       if (((CurrentObject.equals(objects[a-1][c]))||(CurrentObject.equals(objects[a][c-1]))||(CurrentObject.equals(objects[a][c+1]))||(CurrentObject.equals(objects[a-1][c+1]))||(CurrentObject.equals(objects[a-1][c-1])))& (objects[a][c].equals(wordObject))){
         //highliting the background of the button to blue and creating a placeholder for the current button pressed
                  //And adding the clicked button to the list of clicked buttons   
                           for(int i =0;i<b.length;i++){
                               if ((CurrentObject).equals(b[i])){
                                   b[i].setBackground( Color.BLUE );
                                   wordObject = b[i];
                                   wordObjects.add(b[i]);
                                  word +=b[i].getTile().letter()+"";
                                  feedbackWord.setText("Word: "+word);
                                  }
                            }
                        }
                   //a condition for when the buttons at the centre  besides the ones at the corners and sides are pressed 
                   }else if(a>0 &a<5 &c>0&c<5){
                      //checking if the currently pressed button is adjacent to the previous one 
                     if (((CurrentObject.equals(objects[a+1][c]))||(CurrentObject.equals(objects[a-1][c]))||(CurrentObject.equals(objects[a][c+1]))|| (CurrentObject.equals(objects[a][c-1]))||(CurrentObject.equals(objects[a+1][c+1]))||(CurrentObject.equals(objects[a-1][c-1]))||(CurrentObject.equals(objects[a-1][c+1]))||(CurrentObject.equals(objects[a+1][c-1])))& (objects[a][c].equals(wordObject))){
                 //highliting the background of the button to blue and creating a placeholder for the current button pressed
                  //And adding the clicked button to the list of clicked buttons
                           for(int i =0;i<b.length;i++){
                               if ((CurrentObject).equals(b[i])){
                                   b[i].setBackground( Color.BLUE );
                                   wordObject = b[i];
                                   wordObjects.add(b[i]);
                                   word +=b[i].getTile().letter()+"";
                                   feedbackWord.setText("Word: "+word);
                                }
                           }
                      }
                  }
                }
            }
        }
   }  
 }
}