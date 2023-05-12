package src.game.cards;

//  imports
import src.game.cards.godtype.Minerva;
import src.game.Player;

import java.awt.Graphics;
//Depending on future implementation, may incorporate all Specialist cards under
//one superclass/interface
public class Smith extends PersonalityCard implements Minerva {
   
   Smith(Player myPlayer, int brickPrice, int foodPrice) {
      super(myPlayer, brickPrice, foodPrice, 0, 0, 0, 2);
   }
   
   @Override
   public void doAction() {
      //TO DO
      //All owned cities of specified type produce
      setPlayed(true);
   }
   
   @Override
   public int calculatePoints() {
      return getVictoryMultiplier() * scorePoints();
   }
   
   @Override
   public void update() {
      
   }
   
   @Override
   public void draw(Graphics g) {
      
   }
   
}