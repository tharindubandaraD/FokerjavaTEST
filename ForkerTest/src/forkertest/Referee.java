
package forkertest;

import forkertest.Player;
import java.util.ArrayList;

public class Referee extends Player implements PlayingRoundCalcukations{
    private ArrayList <Integer> p_points = new ArrayList<>(8);
    private ArrayList <String> p_names = new ArrayList<>(8);
    private ArrayList <Integer> p_ids = new ArrayList<>(8);
    private int i;
    
    protected int set_playerInfo()
    {
        
        p_names.add(getName());
        p_ids.add(getID());
        return ++i;
    }
  
     
     
    protected void point_calculate()
    {
        
        
    }

    @Override
    public void Preflop_Round() {
        
    }

    @Override
    public void Flop_Round() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Turn_Round() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void River_Round() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}