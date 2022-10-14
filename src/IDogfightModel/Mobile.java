package IDogfightModel;

import java.awt.Color;
import java.awt.Image;

public class Mobile implements IMobile{
	private int speed;
	private Direction direction;
	private Dimension dimension;
	private Position position;
	public Mobile(Direction direction,Position position,Dimension dimension,int speed, String image) {
		
	}
	public Direction getDirection() {
		return direction;
	}
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	public Position getPosition() {
		return position;
	}
	public Dimension getDimension() {
		return dimension;
	}
	public int getSpeed() {
		return 1;
	}
	public int getWidth() {
		return 1;
	}
	public int getHeight() {
		return 1;
	}
	public static void move() {
		
	}
	public static void placeInArea(IArea area) {
		
	}
	public static boolean isPlayer(int player) {
		return false;
	}
	private void moveUp() {
		
	}
	private void moveRight() {
			
		}
	private void moveLeft() {
		
	}
	private void moveDown() {
		
	}
	public static Color getColor() {
		return null ;
	}
	public static void getIDogfightModel(IDogfightModel dogfightModel) {
		
	}
	public static boolean hit() {
		return false;
	}
	public static boolean isWeapon() {
		return false;
	}
	public static Image getImage() {
		return null;
	}
	
}
