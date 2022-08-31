package ProjectCode;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class MapGenerator {

    protected int map[][];
    private int brickWidth;
	private int brickHeight;
	
	public int getBrickWidth() {
		return brickWidth;
	}

	public void setBrickWidth(int brickWidth) {
		this.brickWidth = brickWidth;
	}

	public int getBrickHeight() {
		return brickHeight;
	}

	public void setBrickHeight(int brickHeight) {
		this.brickHeight = brickHeight;
	}

	
	public MapGenerator(int row, int col)
{
		map = new int[row][col];
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[0].length; j++) {
			
			map[i][j] = 1;
		}
}
	
	brickWidth = 80;
	brickHeight = 50;
	
}
	
	public void draw(Graphics2D g) {
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[0].length; j++) {
			if(map[i][j] > 0) {
				g.setColor(Color.white);
				g.fillRect(j*brickWidth+70, i*brickHeight+50, brickWidth, brickHeight);
				
				g.setStroke(new BasicStroke(3)); //for black borders in the bricks
				g.setColor(Color.black);
				g.drawRect(j*brickWidth+70, i*brickHeight+50, brickWidth, brickHeight);
				
			}
	    }
	  }
	}
	
	public void setBrickvalue(int value, int row, int col) {
		map[row][col] = value;
		
	}
}
