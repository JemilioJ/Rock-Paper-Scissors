import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class RPS 
{

   public static void main(String [] args) 
   {
      int win = 0;
      int pScore = 0;
      int cScore = 0;
      String standings = "";
      do{
         int user = getPlayerChoice(pScore, cScore);
         int comp = getComputerChoice();   
         win = getOutcome(user, comp);
         if(win == 1)
         {
            cScore++;
         }
         else if(win == 2)
         {
            pScore++;
         }
      }
      while((cScore<10 && pScore<10) && JOptionPane.showConfirmDialog(null, "Will you play again?") == JOptionPane.YES_OPTION);
      getResults(pScore, cScore);
   }
   
   public static int getComputerChoice()
   {
      int y= (int)(Math.random() * 3) + 1;
      int z = y-1;
      return z;
   }
   
   public static int getPlayerChoice(int pScore, int cScore)
   {
      Object[] options = {"Rock", "Paper", "Scissors"};
      ImageIcon icon = new ImageIcon("[...]");
      int x = JOptionPane.showOptionDialog(null, "The first one to 10 wins! Select your choice:"+"\nPlayer's Score is: "+pScore+"\nComputer's Score is: "+cScore,"Play Rock-Paper-Scissors!", 
         JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
      return x;
   }
   
   public static int getOutcome(int x, int y)
   {
      int win = 0;
      if (x != -1 && x==0) {
         if(y==0){
            JOptionPane.showMessageDialog(null,"You chose rock and the computer chose rock! It's a tie!");
            win = 3;
         }
         if(y==1){
            JOptionPane.showMessageDialog(null,"You chose rock and the computer chose paper!");
            win = 1;
         }
         if(y==2){
            JOptionPane.showMessageDialog(null,"You chose rock and the computer chose scissors!");
            win = 2;
         }
      } 
      else if(x != -1 && x==1)
      {
         if(y==0){
            JOptionPane.showMessageDialog(null,"You chose paper and the computer chose rock!");
            win = 2;
         }
         if(y==1){
            JOptionPane.showMessageDialog(null,"You chose paper and the computer chose paper! It's a tie!");
            win = 3;
         }
         if(y==2){
            JOptionPane.showMessageDialog(null,"You chose paper and the computer chose scissors!");
            win = 1;
         }
      }
      else if(x != -1 && x==2)
      {
         if(y==0){
            JOptionPane.showMessageDialog(null,"You chose scissors and the computer chose rock!");
            win = 1;
         }
         if(y==1){
            JOptionPane.showMessageDialog(null,"You chose scissors and the computer chose paper!");
            win = 2;
         }
         if(y==2){
            JOptionPane.showMessageDialog(null,"You chose scissors and the computer chose scissors!  It's a tie!");
            win = 3;
         }
      }
      return win;
   }
   
   
   public static void getResults(int pScore, int cScore)
   {
      if(pScore > cScore){
         JOptionPane.showMessageDialog(null,"Congratulations! You won!");
      }
      else if(cScore > pScore){
         JOptionPane.showMessageDialog(null,"Sorry you lost, better luck next time!");
      }
      else{
         JOptionPane.showMessageDialog(null,"It's a stalemate!");
      }
   }
}