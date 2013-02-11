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
        
        while((square.getY() < getHeight()) && (square.getX() < getWidth())) {

        		square.move(dx, dy);
        		dy = dy + 0.05;
        		pause(PAUSE_TIME);
        	} if (square.getY) {
        		square.setColor(Color.magenta);
        		dx = dx - 0.02;
        		square.move(dx, (1 - dy));
        			
        		
            }    
        }
    }

    private static final double N_STEPS = 100;
    private static final double PAUSE_TIME = 20;
    private static final double SQUARE_SIZE = 50;
}
