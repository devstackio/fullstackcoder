package com.devstackio.fullstackcoder.gamestates;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Menu extends BasicGameState {
    
    private StateBasedGame game;
    
    @Override
    public int getID() {
        return 1;
    }

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        this.game = sbg;
    }
    
    @Override
    public void keyReleased( int key, char c ) {
        
        //@todo these should be static final values
        switch( key ) {
            case Input.KEY_1:
                this.game.enterState( 3 );
               break;
            case Input.KEY_2:
                break;
            case Input.KEY_3:
                break;
            case Input.KEY_4:
                this.game.enterState( 4 );
                break;
            case Input.KEY_5:
                this.game.enterState( 5 );
                break;
            case Input.KEY_6:
                this.game.enterState( 6 );
                break;
            case Input.KEY_7:
                this.game.enterState( 7 );
                break;
            default:
                break;
        }
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        g.setColor( Color.white );
        g.drawString( "devstackio's : FullStackCoder", 100, 10 );
        g.drawString( "1. Play Game", 100, 100 );
        g.drawString( "2. High Scores", 100, 120 );
        g.drawString( "3. Quit", 100, 140 );
        g.drawString( "-- Development Tests -- [ hit Escape to return to Menu ]", 100, 160 );
        g.drawString( "4. Enemy Fly Test", 100, 180 );
        g.drawString( "5. CodeBlock Test", 100, 200 );
        g.drawString( "6. Full CodeBlock Test [ with FlyingEnemies! ]", 100, 220 );
        g.drawString( "7. Base Defender Test", 100, 240 );
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        
    }
    
    
    
}
