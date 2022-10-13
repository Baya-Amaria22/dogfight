package IDogfightModel;

import java.awt.Image;
import java.awt.Point;

public interface IMobile {
public static final DogfightModel dogfightModel = new DogfightModel();
public static Direction getDirection() {
	return ;
}
public static void setDirection(Direction direction) {
	
}
public Point getPosition() {
	return ;
}
public Dimension getDimension() {
	return ;
}
public int getWidth() {
	return ;
}
public int getHeight() {
	return ;
}
public int getSpeed() {
	return ;
}
public Image getImage() {
	return ;
}
public static void move() {
	
}
public static void placeInArea(IArea area) {
	
}
public static boolean isPlayer(int player) {
	return ;
}
public static void setDogfightModel(DogfightModel dogfightModel) {
	
}
public static boolean hit() {
	return ;
}
public static boolean isWeapon() {
	return ;
}
}
