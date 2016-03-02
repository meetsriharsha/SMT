package edu.umkc.sc9v9.tetris.boardpanel;


import java.awt.Color;
import java.awt.Graphics;

import edu.umkc.sc9v9.tetris.boardpanel.BoardPanelArch;

public interface IBoardPanelImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (BoardPanelArch arch);
	public BoardPanelArch getArch();
	
	/*
  	  Myx Lifecycle Methods: these methods are called automatically by the framework
  	  as the bricks are created, attached, detached, and destroyed respectively.
	*/	
	public void init();	
	public void begin();
	public void end();
	public void destroy();

	/*
  	  Implementation primitives required by the architecture
	*/
	public void clear();
	public int checkLines();
	public void paintComponent(Graphics g);
	void drawTile(Color base, Color light, Color dark, int x, int y, Graphics g);
    
}