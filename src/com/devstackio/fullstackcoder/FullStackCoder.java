package com.devstackio.fullstackcoder;

import com.devstackio.fullstackcoder.states.Game;
import com.devstackio.fullstackcoder.states.Menu;
import com.devstackio.fullstackcoder.states.SplashScreen;
import com.devstackio.fullstackcoder.states.tests.EnemyFlyTest;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class FullStackCoder extends StateBasedGame {

    // Game state ids
    public static final int SPLASHSCREEN    = 0;
    public static final int MAINMENU        = 1;
    public static final int GAME            = 3;
    public static final int ENEMY_FLY_TEST  = 4;
    
    public FullStackCoder( String appName ) {
        super( appName );
    }
    
    @Override
    public void initStatesList(GameContainer gc) throws SlickException {
        
        addState( new SplashScreen() );
        addState( new Menu() );
        addState( new Game() );
        addState( new EnemyFlyTest() );
        this.enterState( ENEMY_FLY_TEST );
        
    }

}
