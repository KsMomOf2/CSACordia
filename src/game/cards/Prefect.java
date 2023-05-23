package src.game.cards;

//  imports
import src.game.cards.godtype.Satvrnvs;
import src.game.Player;

import java.awt.Graphics;

public class Prefect extends PersonalityCard implements Satvrnvs {
   public final CardImage IMAGE = CardImage.PREFECT;
   public final boolean ISSTARTING;
   
   public Prefect(Player myPlayer, boolean isStarting) {
      super(myPlayer, 0, 0, 0, isStarting ? 0 : 1, 0, 1);
      this.ISSTARTING = isStarting;
   }
   
   @Override
   public void doAction() {
      //TO DO
      //Add Production Bonus
      //Produce chosen province
      setPlayed(true);
   }
   
   @Override
   public int calculatePoints() {
      return getVictoryMultiplier() * satvrnvsScorePoints();
   }
   
   @Override
   public void update() {
      
   }
   
   @Override
   public void draw(Graphics g) {
      
   }
   
   @Override
   public Player getPlayer() {
      return super.getMyPlayer();
   }
}