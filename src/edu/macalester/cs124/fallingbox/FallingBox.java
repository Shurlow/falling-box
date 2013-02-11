package edu.macalester.cs124.fallingbox;

import java.awt.Color;
import java.awt.Point;

import acm.graphics.*;
import acm.program.*;

public class FallingBox extends GraphicsProgram {
    ;
    public void run() {
    	GCanvas canvas = new GCanvas();
    	setBackground(Color.cyan);
        GRect square = new GRect(0, 0, SQUARE_SIZE, SQUARE_SIZE);
        square.setFilled(true);
        add(square);
        double dx = (getWidth()  - SQUARE_SIZE) / N_STEPS;
        double dy = (getHeight() - SQUARE_SIZE) / N_STEPS;
        
        for(int i = 0; i < N_STEPS; i++) {
        	
        	if (square.getY() < (getHeight() - 50)) {
        		square.move(dx, dy);
        		dy = dy + 0.02;
        		pause(PAUSE_TIME);
        	}
        	else {
        		square.setColor(Color.magenta);
        		square.move(dx, dy);
        		dx = dx - 0.02;
        			
        		
            }    
        }
    }

    private static final double N_STEPS = 100;
    private static final double PAUSE_TIME = 20;
    private static final double SQUARE_SIZE = 50;
}
